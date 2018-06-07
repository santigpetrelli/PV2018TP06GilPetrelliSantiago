/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaElectrodomestico;
import aplicacion.modelo.datos.ListaMarcas;
import aplicacion.modelo.dominio.Electrodomestico;
import aplicacion.modelo.dominio.Marca;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoManagedBean {

    private String codigo;
    private String tipo;
    private Marca marca;
    private ListaElectrodomestico listaElectro;
    private ListaMarcas listaMarcas;
    private String fecha;
    private Date fech;
    private String marc;
    private ListaElectrodomestico listaElec;
    private double precio;
    private int stock;
    private String disponible;
    
    /**
     * Creates a new instance of ElectrodomesticoManagedBean
     */
    public ElectrodomesticoManagedBean() {
        listaElectro = new ListaElectrodomestico();
        listaMarcas=new ListaMarcas();
        listaMarcas.getListaMarcas().add(new Marca("SM01", "Samsung"));
        listaMarcas.getListaMarcas().add(new Marca("LG02", "LG"));
        listaMarcas.getListaMarcas().add(new Marca("PH03", "Philips"));
        listaElec=new ListaElectrodomestico();
    }

    public void agregarElemento() throws ParseException {
        if(getStock()>0){
            setDisponible("Si");
        }
        else{
            setDisponible("No");
        }
        //SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        //setFechaA(formato.parse(getFecha()));
        getListaElec().agregarElemento(new Electrodomestico(getCodigo(), getTipo(), getMarca(), getFech(), getPrecio(), getStock(),getDisponible()));
    }

    public void reiniciarLista() {
        getListaElec().getListaElectrodomestico().clear();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the listaElectro
     */
    public ListaElectrodomestico getListaElectro() {
        return listaElectro;
    }

    /**
     * @param listaElectro the listaElectro to set
     */
    public void setListaElectro(ListaElectrodomestico listaElectro) {
        this.listaElectro = listaElectro;
    }

    /**
     * @return the listaMarcas
     */
    public ListaMarcas getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ListaMarcas listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the fech
     */
    public Date getFech() {
        return fech;
    }

    /**
     * @param fech the fech to set
     */
    public void setFech(Date fech) {
        this.fech = fech;
    }

    /**
     * @return the marc
     */
    public String getMarc() {
        return marc;
    }

    /**
     * @param marc the marc to set
     */
    public void setMarc(String marc) {
        this.marc = marc;
    }

    /**
     * @return the listaElec
     */
    public ListaElectrodomestico getListaElec() {
        return listaElec;
    }

    /**
     * @param listaElec the listaElec to set
     */
    public void setListaElec(ListaElectrodomestico listaElec) {
        this.listaElec = listaElec;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the disponible
     */
    public String getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    
}
