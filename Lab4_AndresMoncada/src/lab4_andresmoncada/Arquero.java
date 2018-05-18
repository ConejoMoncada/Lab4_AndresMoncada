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
public class Arquero extends Pieza{

    public Arquero() {
        simbolo = 'A';
    }

    public Arquero(String color, String material, int fila, int columna) {
        super(color, material, fila, columna);
        simbolo = 'A';
    }

    @Override
    public String toString() {
        return "Arquero " + super.toString();
    }

    @Override
    public char[][] mover(int f, int c, char t[][]){
        t[f][c] = 'A';
        t[fila][columna] = '°';
        fila = f;
        columna = c;
        return t;
    }
    
}