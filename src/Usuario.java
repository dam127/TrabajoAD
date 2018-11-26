/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM215
 */
public class Usuario {
    private String usuario,nombre, contrasenia,apellidos,fechanac;
    private int idUsuario, numAccesos,puntuacionMedia;

    public Usuario() {
    }

    public Usuario(String usuario, String nombre, String contrasenia, String apellidos, String fechanac) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumAccesos() {
        return numAccesos;
    }

    public void setNumAccesos(int numAccesos) {
        this.numAccesos = numAccesos;
    }

    public int getPuntuacionMedia() {
        return puntuacionMedia;
    }

    public void setPuntuacionMedia(int puntuacionMedia) {
        this.puntuacionMedia = puntuacionMedia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre + ", contrasenia=" + contrasenia + ", apellidos=" + apellidos + ", fechanac=" + fechanac + ", idUsuario=" + idUsuario + ", numAccesos=" + numAccesos + ", puntuacionMedia=" + puntuacionMedia + '}';
    }

 
    
    
}
