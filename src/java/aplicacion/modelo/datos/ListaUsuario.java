/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Usuario;
import java.util.ArrayList;

/**
 *
 * @author PC-Gamer
 */
public class ListaUsuario {

    private ArrayList<Usuario> listaUsuario;

    public ListaUsuario() {
        listaUsuario=new ArrayList();
        listaUsuario.add(new Usuario("usuario1", "usuario1"));
        listaUsuario.add(new Usuario("usuario2", "usuario2"));
    }

    public ListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    public Usuario validarUsuario(String usuario, String contraseña){
        Usuario usu=null;
        for(Usuario u:listaUsuario){
            if(u.getUsuario().equals(usuario)&&u.getContraseña().equals(contraseña)){
                usu=u;
                break;
                     
            }
        }
        return usu;
    }

    /**
     * @return the listaUsuario
     */
    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
}
    

