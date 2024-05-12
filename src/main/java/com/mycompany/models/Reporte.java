package com.mycompany.models;

public class Reporte {

    private int id;
    private String date_out;
    private String date_return;
    private String ruta;
    private int cond_id;
    private int aut_id;
    private int dinero_recogido;
    private String available;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCond_id() {
        return cond_id;
    }

    public void setCond_id(int cond_id) {
        this.cond_id = cond_id;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public String getDate_out() {
        return date_out;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    public String getDate_return() {
        return date_return;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    public int getDinero_recogido() {
        return dinero_recogido;
    }

    public void setDinero_recogido(int dinero_recogido) {
        this.dinero_recogido = dinero_recogido;
    }

}
