package com.example.AeroJet.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AeroJet.models.Usuario;
import com.example.AeroJet.repositories.IUser;

@Service
public class UsuarioService {
    @Autowired
    IUser userRep;

    public ArrayList<Usuario> getUsuarios() {
        return (ArrayList<Usuario>) userRep.findAll();
    }

    public Usuario saveUser(Usuario user) {
        return userRep.save(user);
    }

    public Optional<Usuario> getById(Integer id) {
        return userRep.findById(id);
    }

    public Usuario updateById(Usuario request, Integer id) {
        Usuario user = userRep.findById(id).get();
        user.setNombreUsuario(request.getNombreUsuario());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return user;
    }

    public Boolean deleteuser(Integer id) {
        try {
            userRep.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
