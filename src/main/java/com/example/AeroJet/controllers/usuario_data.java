package com.example.AeroJet.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.AeroJet.models.Usuario;
import com.example.AeroJet.services.UsuarioService;

@RestController
@RequestMapping("/users")
public class usuario_data {

    @Autowired
    private UsuarioService userService;

    @GetMapping
    public ArrayList<Usuario> getUsuarios() {
        return this.userService.getUsuarios();
    }

    @PostMapping
    public Usuario saveUser(@RequestBody Usuario user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> getById(@PathVariable Integer id) {
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Usuario updateUserById(@RequestBody Usuario request, @PathVariable Integer id) {
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Integer id) {
        Boolean ok = this.userService.deleteuser(id);
        if (ok) {
            return "User con id " + id + " fue eliminado.";
        } else {
            return "User id no eliminado.";
        }
    }

}
