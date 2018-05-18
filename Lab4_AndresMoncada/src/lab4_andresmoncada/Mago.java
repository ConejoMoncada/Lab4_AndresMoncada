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
public class Mago extends Pieza{

    public Mago() {
        simbolo = 'M';
    }

    public Mago(String color, String material, int fila, int columna) {
        super(color, material, fila, columna);
        simbolo = 'M';
    }

    @Override
    public String toString() {
        return "Mago " + super.toString();
    }

    @Override
    public char[][] mover(int f, int c, char t[][]){
        t[f][c] = 'M';
        t[fila][columna] = '°';
        return t;
    }
    
}