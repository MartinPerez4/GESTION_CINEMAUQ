package co.uniquindio.edu.cinemauq.model;

import java.time.LocalDate;

public class Funcion {
    private String codigo;
    private Pelicula pelicula;
    private Sala sala;
    private LocalDate fecha;
    private String hora;
    private double valorBase;
    private EstadoFuncion estadoFuncion;

    public Funcion(String codigo, Pelicula pelicula, Sala sala, LocalDate fecha, String hora, double valorBase, EstadoFuncion estadoFuncion) {
        this.codigo = codigo;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.valorBase = valorBase;
        this.estadoFuncion = estadoFuncion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public EstadoFuncion getEstadoFuncion() {
        return estadoFuncion;
    }

    public void setEstadoFuncion(EstadoFuncion estadoFuncion) {
        this.estadoFuncion = estadoFuncion;
    }
}
