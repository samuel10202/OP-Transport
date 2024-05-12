package com.mycompany.models;

public class Conductores {
    private int id;
    private int cc;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String genero;
    private int licencia;
    private String direccion;
    private String fecha_nacimiento;
    private String fecha_vencLicen;
    private String fecha_expeLicen;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_vencLicen() {
        return fecha_vencLicen;
    }

    public void setFecha_vencLicen(String fecha_vencLicen) {
        this.fecha_vencLicen = fecha_vencLicen;
    }

    public String getFecha_expeLicen() {
        return fecha_expeLicen;
    }

    public void setFecha_expeLicen(String fecha_expeLicen) {
        this.fecha_expeLicen = fecha_expeLicen;
    }
}
