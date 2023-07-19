package com.example.AeroJet.models;

import jakarta.persistence.*;

@Entity
@Table(name = "asientos")
public class Asientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private Integer id;

    @Column(name = "Avion_id")
    private Integer avion_id;

    @Column(name = "Vuelo_id")
    private Integer vuelo_id;

    @Column(name = "Numero")
    private Integer numero;

    @Column(name = "Estado")
    private Boolean estado;

    @Column(name = "Ubicacion")
    private String ubicacion;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAvion_id() {
        return this.avion_id;
    }

    public void setAvion_id(Integer avion_id) {
        this.avion_id = avion_id;
    }

    public Integer getVuelo_id() {
        return this.vuelo_id;
    }

    public void setVuelo_id(Integer vuelo_id) {
        this.vuelo_id = vuelo_id;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean isEstado() {
        return this.estado;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
