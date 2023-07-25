package com.example.AeroJet.models;

import java.sql.Date;

public class Compra {
    private long id;
    private long id_cliente;
    private long id_paquete;
    private int cant_personas;
    private Date fech_reserva;
    private String estado;
    private String tipo_comprobante;
    private double monto_paquetes;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_cliente() {
        return this.id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getId_paquete() {
        return this.id_paquete;
    }

    public void setId_paquete(long id_paquete) {
        this.id_paquete = id_paquete;
    }

    public int getCant_personas() {
        return this.cant_personas;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public Date getFech_reserva() {
        return this.fech_reserva;
    }

    public void setFech_reserva(Date fech_reserva) {
        this.fech_reserva = fech_reserva;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_comprobante() {
        return this.tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public double getMonto_paquetes() {
        return this.monto_paquetes;
    }

    public void setMonto_paquetes(double monto_paquetes) {
        this.monto_paquetes = monto_paquetes;
    }
    
}
