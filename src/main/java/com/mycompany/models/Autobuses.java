package com.mycompany.models;

public class Autobuses {

    private int ID;
    private String marca;
    private String modelo;
    private String año_fabricacion;
    private int plazas_disponibles;
    private String placa;
    private int kilometraje;
    private int available;
    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(String año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    public int getPlazas_disponibles() {
        return plazas_disponibles;
    }

    public void setPlazas_disponibles(int plazas_disponibles) {
        this.plazas_disponibles = plazas_disponibles;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

}
