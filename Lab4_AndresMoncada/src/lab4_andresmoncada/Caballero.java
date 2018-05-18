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
public class Caballero extends Pieza{

    public Caballero() {
        simbolo = 'C';
    }

    public Caballero(String color, String material, int fila, int columna) {
        super(color, material, fila, columna);
        simbolo = 'C';
    }

    @Override
    public String toString() {
        return "Caballero " + super.toString();
    }

    @Override
    public char[][] mover(int f, int c, char t[][]) throws MovimientoMalo{
        return t;
    }
    
}
