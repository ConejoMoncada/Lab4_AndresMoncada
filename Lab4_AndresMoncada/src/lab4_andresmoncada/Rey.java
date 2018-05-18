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
public class Rey extends Pieza{

    public Rey() {
        simbolo = 'R';
    }

    public Rey(String color, String material, int fila, int columna) {
        super(color, material, fila, columna);
        simbolo = 'R';
    }

    @Override
    public String toString() {
        return "Rey " + super.toString();
    }

    @Override
    public char[][] mover(int f, int c, char t[][]) throws MovimientoMalo{
        return t;
    }
    
}