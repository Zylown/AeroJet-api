package com.example.AeroJet.controllers;

/*
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;*/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.AeroJet.models.Vuelos;
import com.example.AeroJet.services.VuelosService;

@RestController
@RequestMapping("/vuelos")
public class vuelos_data {

    @Autowired
    private VuelosService vueloService;

    @GetMapping
    public ArrayList<Vuelos> getVuelos() {
        return this.vueloService.getVuelos();
    }

    @PostMapping
    public Vuelos saveVuelos(@RequestBody Vuelos vuelo) {
        return this.vueloService.saveVuelos(vuelo);
    }

    @GetMapping("/vuelos-fecha-inicio-disponibles")
    public ResponseEntity<?> getVuelosPorFechaInicio(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaInicio) {

        List<Map<String, Object>> vuelos = vueloService.getVuelosPorFechaInicio(fechaInicio)
                .stream()
                .map(data -> {
                    Map<String, Object> vueloMap = new HashMap<>();
                    vueloMap.put("fecha", data[0]);
                    vueloMap.put("hora", data[1]);
                    vueloMap.put("origen", data[2]);
                    vueloMap.put("destino", data[3]);
                    vueloMap.put("disponibles", data[4]);
                    return vueloMap;
                })
                .collect(Collectors.toList());

        if (vuelos.isEmpty()) {
            Map<String, String> response = new HashMap<>();
            response.put("mensaje", "No se encontraron resultados para la fecha de inicio proporcionada.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(response);
        }

        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/vuelos-fechas-disponibles")
    public ResponseEntity<?> getVuelosDisponibles(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaInicio,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaSalida) {

        List<Map<String, Object>> vuelos = vueloService.getVuelosDisponibles(fechaInicio, fechaSalida)
                .stream()
                .map(data -> {
                    Map<String, Object> vueloMap = new HashMap<>();
                    vueloMap.put("fecha", data[0]);
                    vueloMap.put("hora", data[1]);
                    vueloMap.put("origen", data[2]);
                    vueloMap.put("destino", data[3]);
                    vueloMap.put("disponibles", data[4]);
                    return vueloMap;
                })
                .collect(Collectors.toList());

        if (vuelos.isEmpty()) {
            Map<String, String> response = new HashMap<>();
            response.put("mensaje", "No se encontraron resultados para las fechas proporcionadas.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(response);
        }

        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/vuelos-disponibles")
    public ResponseEntity<?> getVuelosDisponibles1() {
        List<Map<String, Object>> vuelos = vueloService.getVuelosDisponibles1()
                .stream()
                .map(data -> {
                    Map<String, Object> vueloMap = new HashMap<>();
                    vueloMap.put("fecha_salida", data[2]);
                    vueloMap.put("hora_salida", data[3]);
                    vueloMap.put("punto_origen", data[0]);
                    vueloMap.put("punto_destino", data[1]);
                    vueloMap.put("disponibles", data[4]);
                    return vueloMap;
                })
                .collect(Collectors.toList());

        return ResponseEntity.ok(vuelos);
    }

    @GetMapping(path = "/{id}")
    public Optional<Vuelos> getById(@PathVariable Integer id) {
        return this.vueloService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Vuelos updateVuelosById(@RequestBody Vuelos request, @PathVariable Integer id) {
        return this.vueloService.updateByVuelos(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteVuelosById(@PathVariable("id") Integer id) {
        Boolean ok = this.vueloService.deleteVuelos(id);
        if (ok) {
            return "Vuelo número " + id + " eliminado.";
        } else {
            return "Vuelo no eliminado.";
        }
    }

}
