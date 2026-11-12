package co.uniquindio.edu.cinemauq.model;

public class Cliente {
    private String id;
    private String nombre;
    private TipoCliente tipoCliente;

    public Cliente(String id, String nombre, TipoCliente tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
