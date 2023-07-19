package com.example.AeroJet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

import com.example.AeroJet.models.Usuario;

//@Repository
public interface IUser extends JpaRepository<Usuario, Integer> {

    @Query("SELECT MAX(u.id) FROM Usuario u")
    Integer findMaxUserId();
}
