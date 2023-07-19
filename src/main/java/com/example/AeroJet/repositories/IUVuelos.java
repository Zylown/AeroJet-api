package com.example.AeroJet.repositories;

//import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.AeroJet.models.Vuelos;

public interface IUVuelos extends JpaRepository<Vuelos, Integer> {

        @Query(value = "SELECT v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad - COUNT(asiento.id) AS disponibles "
                        + "FROM vuelos v "
                        + "JOIN rutas r ON v.ruta_id = r.id "
                        + "JOIN aviones a ON v.avion_id = a.id "
                        + "LEFT JOIN asientos asiento ON v.id = asiento.vuelo_id "
                        + "GROUP BY v.id, v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad", nativeQuery = true)
        List<Object[]> getVuelosDisponibles1();

        @Query(value = "SELECT v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad - COUNT(asiento.id) AS disponibles "
                        + "FROM vuelos v "
                        + "JOIN rutas r ON v.ruta_id = r.id "
                        + "JOIN aviones a ON v.avion_id = a.id "
                        + "LEFT JOIN asientos asiento ON v.id = asiento.vuelo_id "
                        + "WHERE v.fecha_salida BETWEEN :fechaInicio AND :fechaSalida "
                        + "GROUP BY v.id, v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad", nativeQuery = true)
        List<Object[]> getVuelosDisponibles(@Param("fechaInicio") LocalDate fechaInicio,
                        @Param("fechaSalida") LocalDate fechaSalida);

        @Query(value = "SELECT v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad - COUNT(asiento.id) AS disponibles "
                        + "FROM vuelos v "
                        + "JOIN rutas r ON v.ruta_id = r.id "
                        + "JOIN aviones a ON v.avion_id = a.id "
                        + "LEFT JOIN asientos asiento ON v.id = asiento.vuelo_id "
                        + "WHERE v.fecha_salida = :fechaInicio " // Aquí agregamos la cláusula WHERE
                        + "GROUP BY v.id, v.fecha_salida, v.hora_salida, r.punto_origen, r.punto_destino, a.capacidad", nativeQuery = true)
        List<Object[]> getVuelosPorFechaInicio(@Param("fechaInicio") LocalDate fechaInicio);

}
