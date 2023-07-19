package com.example.AeroJet.models;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.*;

@Entity
@Table(name = "vuelos")
public class Vuelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "fecha_salida")
    private Date fecha_salida;

    @Column(name = "hora_salida")
    private Time hora_salida;

    @Column(name = "fecha_llegada")
    private Date fecha_llegada;

    @Column(name = "hora_llegada")
    private Time hora_llegada;

    @Column(name = "fecha_reprogramacion")
    private Date fecha_reprogramacion;

    @Column(name = "estado")
    private String estado;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_salida() {
        return this.fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Time getHora_salida() {
        return this.hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getFecha_llegada() {
        return this.fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public Time getHora_llegada() {
        return this.hora_llegada;
    }

    public void setHora_llegada(Time hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public Date getFecha_reprogramacion() {
        return this.fecha_reprogramacion;
    }

    public void setFecha_reprogramacion(Date fecha_reprogramacion) {
        this.fecha_reprogramacion = fecha_reprogramacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
