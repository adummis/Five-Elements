package co.com.mintic.proyecto4.cartera.controller;

import co.com.mintic.proyecto4.cartera.entities.DocumentTypeEntity;
import co.com.mintic.proyecto4.cartera.entities.RoleEntity;
import co.com.mintic.proyecto4.cartera.entities.UserEntity;
import co.com.mintic.proyecto4.cartera.services.IDocumentTypeService;
import co.com.mintic.proyecto4.cartera.services.IRoleService;
import co.com.mintic.proyecto4.cartera.services.IUserService;
import co.com.mintic.proyecto4.cartera.util.EncryptPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.DocumentType;

import javax.management.relation.Role;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UserController extends EncryptPassword {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IDocumentTypeService documentTypeService;
    private final Logger LOG = Logger.getLogger(""+ UserController.class);
    private Validator validator;

    @GetMapping("/usuarios/listar")
    public String getListUsuarios(Model model){
        LOG.log(Level.INFO,"getListUsuarios");
        List<UserEntity> usuarios = userService.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios/list";
    }

    @GetMapping("/usuarios/crear")
    public String createUserEntity(Model modelo){
        LOG.log(Level.INFO,"createUsuario");
        //Usuario
        UserEntity userEntity = new UserEntity ();
        modelo.addAttribute("usuario", userEntity);
        //Roles
        List<RoleEntity> roles = roleService.findAll();
        modelo.addAttribute("roles", roles);
        // Tipo de documento
        List<DocumentTypeEntity> documentTypes = documentTypeService.findAll();
        modelo.addAttribute("tiposDocumentos", documentTypes);
        return "usuarios/modificar";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@Valid UserEntity userEntity, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarUsuario");
        if(userEntity.getRoleEntity().getIdRoleEntity() == 0) {
            FieldError field = new FieldError("usuario", "rol","No puede ser null");
            error.addError(field);
        }
        if(userEntity.getDocumentTypeEntity().getIdDocumentTypeEntity() == 0) {
            FieldError field = new FieldError("usuario", "tipoDocumento","No puede ser null");
            error.addError(field);
        }
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            //Roles
            List<RoleEntity> roles = roleService.findAll();
            modelo.addAttribute("roles", roles);
            // Tipo de documento
            List<DocumentTypeEntity> documentTypes = documentTypeService.findAll();
            modelo.addAttribute("tiposDocumentos", documentTypes);
            return "usuarios/modificar";
        }
        userEntity.setStatus(true);
        userEntity.set_password(encryptPassword(userEntity.get_password()));
        userEntity = userService.createUser(userEntity);
        return "redirect:/usuarios/listar";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editUserEntity(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editUsuario");
        UserEntity user = userService.findById(id);
        modelo.addAttribute("usuario", user);
        //Roles
        List<RoleEntity> roles = roleService.findAll();
        modelo.addAttribute("roles", roles);
        // Tipo de documento
        List<DocumentTypeEntity> documentTypes = documentTypeService.findAll();
        modelo.addAttribute("tiposDocumentos", documentTypes);
        return "usuarios/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteUserEntity(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteUsuario");
        userService.deleteUser(id);
        return "redirect:/usuarios/listar";
    }
}
