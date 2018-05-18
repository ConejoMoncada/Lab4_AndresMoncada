/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_andresmoncada;

/**
 *
 * @author Dell
 */
public class Jugador {
    private String nombre;
    private String usuario;
    private int puntos;
    private String lnacimiento;
    private int edad;
    private char sexo;

    public Jugador() {
        puntos = 0;
    }

    public Jugador(String nombre, String usuario, String lnacimiento, int edad, char sexo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.lnacimiento = lnacimiento;
        this.edad = edad;
        this.sexo = sexo;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getLnacimiento() {
        return lnacimiento;
    }

    public void setLnacimiento(String lnacimiento) {
        this.lnacimiento = lnacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + ", usuario: " + usuario + ", puntos: " + puntos;
    }
    
}
