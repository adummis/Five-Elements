package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.RoleEntity;
import co.gov.mintic.cartera.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleRestController {
    @Autowired
    private IRoleService roleService;

    @GetMapping("/role/{id}")
    public RoleEntity findById(@PathVariable int id){
        return roleService.findById(id);
    }

    @GetMapping("/role")
    public List<RoleEntity> findAll(){
        return roleService.findAll();
    }

    @PostMapping("/role")
    public RoleEntity createRole(@RequestBody RoleEntity role){
        return roleService.createRole(role);
    }

    @PutMapping("/role/{id}")
    public RoleEntity updateRole(@PathVariable int id, @RequestBody RoleEntity role){
        return roleService.updateRole(id, role);
    }

    @DeleteMapping("/role/{id}")
    public void deleteRole(@PathVariable int id){
        roleService.deleteRole(id);
        //Buscando y borrando
    }
}
