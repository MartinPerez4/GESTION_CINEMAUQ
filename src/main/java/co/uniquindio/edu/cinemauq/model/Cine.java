package co.uniquindio.edu.cinemauq.model;

import java.util.List;

public class Cine {
    private String nombre;
    private String nit;
    private List<Sala> sala;
    private List<Venta>venta;
    private List<Tarifa> tarifas;

    public Cine(String nombre, String nit, List<Sala> sala, List<Venta> venta, List<Tarifa> tarifas) {
        this.nombre = nombre;
        this.nit = nit;
        this.sala = sala;
        this.venta = venta;
        this.tarifas = tarifas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }

    public List<Venta> getVenta() {
        return venta;
    }

    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
}
