package co.uniquindio.edu.cinemauq.model;

public class Tarifa {
    private TipoEntrada tipoEntrada;
    private double valor;

    public Tarifa(TipoEntrada tipoEntrada, double valor) {
        this.tipoEntrada = tipoEntrada;
        this.valor = valor;
    }


    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public double getValor() {
        return valor;
    }
}
