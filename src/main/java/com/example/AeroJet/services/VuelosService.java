package com.example.AeroJet.services;

//import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AeroJet.models.Vuelos;
import com.example.AeroJet.repositories.IUVuelos;

@Service
public class VuelosService {
    @Autowired
    IUVuelos vuelosRep;// traer metodos del JPA

    public List<Object[]> getVuelosDisponibles(LocalDate start, LocalDate end) {
        return vuelosRep.getVuelosDisponibles(start, end);
    }

    public List<Object[]> getVuelosPorFechaInicio(LocalDate start) {
        return vuelosRep.getVuelosPorFechaInicio(start);
    }

    public List<Object[]> getVuelosDisponibles1() {
        return vuelosRep.getVuelosDisponibles1();
    }

    public ArrayList<Vuelos> getVuelos() {
        return (ArrayList<Vuelos>) vuelosRep.findAll();
    }

    public Vuelos saveVuelos(Vuelos vuelos) {
        return vuelosRep.save(vuelos);
    }

    public Optional<Vuelos> getById(Integer id) {
        return vuelosRep.findById(id);
    }

    public Vuelos updateByVuelos(Vuelos request, Integer id) {
        Vuelos vuelo = vuelosRep.findById(id).get();
        vuelo.setFecha_salida(request.getFecha_salida());
        vuelo.setHora_salida(request.getHora_salida());
        vuelo.setFecha_llegada(request.getFecha_llegada());
        vuelo.setHora_llegada(request.getHora_llegada());
        vuelo.setFecha_reprogramacion(request.getFecha_reprogramacion());
        vuelo.setEstado(request.getEstado());
        return vuelo;

    }

    public Boolean deleteVuelos(Integer id) {
        try {
            vuelosRep.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
