package co.uniquindio.edu.cinemauq.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Cine {
    private String nombre;
    private String nit;
    private List<Pelicula> listaPeliculas;
    private List<Funcion> listaFunciones;
    private List<Sala> listaSalas;
    private List<Venta> listaVentas;
    private List<Tarifa> listaTarifas;

    public Cine(String nombre, String nit, List<Pelicula> listaPeliculas, List<Sala> listaSalas, List<Venta> listaVentas, List<Tarifa> listaTarifas, List<Funcion> listaFunciones) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaPeliculas = listaPeliculas;
        this.listaSalas = listaSalas;
        this.listaVentas = listaVentas;
        this.listaTarifas = listaTarifas;
        this.listaFunciones = listaFunciones;
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

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<Tarifa> getListaTarifas() {
        return listaTarifas;
    }

    public void setListaTarifas(List<Tarifa> listaTarifas) {
        this.listaTarifas = listaTarifas;
    }

    public List<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(List<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    //////////////////

    public boolean registrarPelicula(Pelicula pelicula) {
        if (pelicula == null) {
            return false;
        }
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getCodigo().equals(pelicula.getCodigo())) {
                return false;
            }
        }
        return listaPeliculas.add(pelicula);
    }

    public Pelicula buscarPelicula(String codigo) {
        for (Pelicula p : listaPeliculas) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean modificarPelicula(String codigo, Pelicula nueva) {
        Pelicula existe = buscarPelicula(codigo);
        if (existe == null) {
            return false;
        }
        existe.setNombre(nueva.getNombre());
        existe.setGenero(nueva.getGenero());
        existe.setDuracionMinutos(nueva.getDuracionMinutos());
        existe.setClasificacion(nueva.getClasificacion());
        existe.setEstadoPelicula(nueva.getEstadoPelicula());
        return true;
    }

    public boolean deshabilitarPelicula(String codigo) {
        Pelicula existe = buscarPelicula(codigo);
        if (existe == null) {
            return false;
        }
        existe.setEstadoPelicula(EstadoPelicula.NO_DISPONIBLE);
        return true;
    }

    //////////////

    public boolean registrarSala(Sala sala) {
        if (sala == null) {
            return false;
        }
        for (int i = 0; i < listaSalas.size(); i++) {
            if (listaSalas.get(i).getCodigo().equals(sala.getCodigo())) {
                return false;
            }
        }
        return listaSalas.add(sala);
    }

    public Sala buscarSala(String codigo) {
        for (Sala s: listaSalas) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        return null;
    }

    public boolean modificarSala(String codigo, Sala nueva) {
        Sala existe = buscarSala(codigo);
        if (existe == null) {
            return false;
        }
        existe.setNombre(nueva.getNombre());
        existe.setCapacidad(nueva.getCapacidad());
        existe.setEstadoSala(nueva.getEstadoSala());
        return true;
    }

    public boolean deshabilitarSala(String codigo) {
        Sala existe = buscarSala(codigo);
        if (existe == null) {
            return false;
        }
        existe.setEstadoSala(EstadoSala.FUERA_DE_SERVICIO);
        return true;
    }
    //////////////////
    public boolean programarFuncion(Funcion funcion) {
        if (funcion == null) {
            return false;
        }
        for (int i = 0; i < listaFunciones.size(); i++) {
            if (listaFunciones.get(i).getCodigo().equals(funcion.getCodigo())) {
                return false;
            }
        }
        return listaFunciones.add(funcion);
    }

    public Funcion consultarFuncion(String codigo) {
        for (Funcion f: listaFunciones) {
            if (f.getCodigo().equals(codigo)) {
                return f;
            }
        }
        return null;
    }
    //los null podemos cambiarlos por algun aviso? es que no se como funcioné en con javafx help

    ///////

    public List<Asiento> consultarDisponibilidad(String codigoFuncion) {
        List<Asiento> disponibles = new ArrayList<>();

        for (int i = 0; i < listaFunciones.size(); i++) {
            if (listaFunciones.get(i).getCodigo().equals(codigoFuncion)) {
                List<Asiento> asientos = listaFunciones.get(i).getSala().getListaAsientos();

                for (int j = 0; j < asientos.size(); j++) {
                    if (asientos.get(j).Disponible()) {
                        disponibles.add(asientos.get(j));
                    }
                }
                return disponibles;
            }
        }
        return disponibles;
    }

    //////

    public int obtenerPeliculasVendidas(Pelicula peliculaBuscada) {
        int unidades = 0;

        for (Venta venta : getListaVentas()) {

            Funcion funcion = venta.getFuncion();

            if (funcion != null && funcion.getPelicula().equals(peliculaBuscada)) {
                unidades++;
            }
        }

        return unidades;
    }


    public Pelicula obtenerPeliculaMasVendida() {
        Pelicula masVendida = null;
        int max = 0;
        for (Pelicula pelicula : listaPeliculas) {

            int unidades = obtenerPeliculasVendidas(pelicula);

            if (unidades > max) {
                max = unidades;
                masVendida = pelicula;
            }
        }

        return masVendida;
    }


    public double generarReporteIngresos() {
        double totalIngresos = 0.0;

        for (Venta venta : listaVentas) {

            Tarifa tarifa = venta.getTarifa();

            if (tarifa != null) {
                totalIngresos += tarifa.getValor();
            }
        }

        return totalIngresos;
    }

    public int generarReporteOcupacion(String codigoFuncion) {
        int asientosOcupados = 0;

        for (Venta venta : getListaVentas()) {

            Funcion funcion = venta.getFuncion();

            if (funcion != null) {

                if (funcion.getCodigo().equals(codigoFuncion)) {
                    asientosOcupados++;
                }
            }
        }

        return asientosOcupados;
    }

    public Venta venderEntrada(Cliente cliente, Funcion funcion, Asiento asiento, TipoEntrada tipo) {
        if (cliente == null || funcion == null || asiento == null || tipo == null)
            return null;
        if (funcion.getEstadoFuncion() != EstadoFuncion.PROGRAMADA)
            return null;
        if (!funcion.getSala().getListaAsientos().contains(asiento))
            return null;

        for (Venta v : listaVentas) {
            if (v.getEstadoVenta() == EstadoVenta.ACTIVA && v.getFuncion().getCodigo().equals(funcion.getCodigo()) && v.getAsiento().getCodigo().equals(asiento.getCodigo())) {
                return null;
            }
        }


        Tarifa tarifa = null;
        for (Tarifa t : listaTarifas) {
            if (t.getTipoEntrada() == tipo) {
                tarifa = t;
                break;
            }
        }
        if (tarifa == null)
            return null;

        String codigo = "V" + (listaVentas.size() + 1);
        Venta venta = new Venta(codigo, cliente, funcion, asiento,
                LocalDateTime.now().toString(), EstadoVenta.ACTIVA, tarifa);
        listaVentas.add(venta);
        return venta;
    }

    public boolean cancelarVenta(String codigoVenta) {
        for (Venta v : listaVentas) {
            if (v.getCodigo().equals(codigoVenta)) {
                if (v.getEstadoVenta() == EstadoVenta.CANCELADA)
                    return false;
                v.setEstadoVenta(EstadoVenta.CANCELADA);
                return true;
            }
        }
        return false;
    }






}