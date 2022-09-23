package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.UserEntity;
import co.gov.mintic.cartera.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/{id}")
    public UserEntity findById(@PathVariable int id){
        return userService.findById(id);
    }

    @GetMapping("/user")
    public List<UserEntity> findAll(){
        return this.userService.findAll();
    }

    @PostMapping("/user")
    public UserEntity createUser (@RequestBody UserEntity user){
        return this.userService.createUser(user);
    }

    @PutMapping("/user")
    public UserEntity updateUser(@RequestBody UserEntity user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id){
        this.userService.deleteUser(id);
    }
}
