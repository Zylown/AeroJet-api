package com.example.AeroJet.models;

public class Viaje {
    private long id;
    private String destino;
    private String descripcion;
    private double precio;
    private int dias;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}
