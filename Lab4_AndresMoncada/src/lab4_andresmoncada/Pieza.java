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
public abstract class Pieza {
    protected String color;
    protected String material;
    protected int fila;
    protected int columna;
    protected char simbolo;

    public Pieza() {
    }

    public Pieza(String color, String material, int fila, int columna) {
        this.color = color;
        this.material = material;
        this.fila = fila;
        this.columna = columna;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return color + ", material: " + material + '}';
    }
    public abstract void mover(int f,int c);
}
