/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaUsuario;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@ViewScoped
public class UsuarioManagedBean {
    private String username;
    private String contraseña;
    private ListaUsuario listaUsuario;
    
    /**
     * Creates a new instance of UsuarioManagedBean
     */
    public UsuarioManagedBean() {
        listaUsuario=new ListaUsuario();
    }
    public String validarUsuario(){
        String resultado=null;
        Usuario usuario=null;
        usuario=getListaUsuario().validarUsuario(getUsername(), getContraseña());
        if(usuario==null){
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales invalidas","Nombre de osuario o contraseñas erroneas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        else{
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Credenciales correctas","Las credenciales son correctas");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado", usuario);
            resultado="/index";
        }
        return resultado;
    }
    public String getUsuarioValidado(){
        String user=null;
        Usuario usuario=null;
        usuario=getListaUsuario().validarUsuario(getUsername(), getContraseña());
        if(usuario!=null){
            user=usuario.getUsuario();
        }
        return user;
    }
    public String cerrarSesion(){
        String resultado="/login";
        FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Sesion cerrada","La sesion ha sido cerrada con exito");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        return resultado;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the listaUsuario
     */
    public ListaUsuario getListaUsuario() {
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(ListaUsuario listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
    
}
