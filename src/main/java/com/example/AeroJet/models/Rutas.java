package com.example.AeroJet.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rutas")
public class Rutas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private Integer id;

    @Column(name = "punto_origen")
    private String punto_origen;

    @Column(name = "punto_destino")
    private String punto_destino;

    @Column(name = "Distancia")
    private Integer distancia;

    @Column(name = "duracion_estimada")
    private Integer duracion_estimada;

    @Column(name = "aerouerto_origen_id")
    private Integer aerouerto_origen_id;

    @Column(name = "aerouerto_destino_id")
    private Integer aerouerto_destino_id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPunto_origen() {
        return this.punto_origen;
    }

    public void setPunto_origen(String punto_origen) {
        this.punto_origen = punto_origen;
    }

    public String getPunto_destino() {
        return this.punto_destino;
    }

    public void setPunto_destino(String punto_destino) {
        this.punto_destino = punto_destino;
    }

    public Integer getDistancia() {
        return this.distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getDuracion_estimada() {
        return this.duracion_estimada;
    }

    public void setDuracion_estimada(Integer duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    public Integer getAerouerto_origen_id() {
        return this.aerouerto_origen_id;
    }

    public void setAerouerto_origen_id(Integer aerouerto_origen_id) {
        this.aerouerto_origen_id = aerouerto_origen_id;
    }

    public Integer getAerouerto_destino_id() {
        return this.aerouerto_destino_id;
    }

    public void setAerouerto_destino_id(Integer aerouerto_destino_id) {
        this.aerouerto_destino_id = aerouerto_destino_id;
    }

}
