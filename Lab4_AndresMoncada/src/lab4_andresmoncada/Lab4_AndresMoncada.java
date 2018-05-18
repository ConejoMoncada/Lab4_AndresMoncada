/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_andresmoncada;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Lab4_AndresMoncada {

    static ArrayList<Jugador> jugadores = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pieza> piezas;
    static char tablero[][] = new char[10][10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean v = true;
        int menu;
        while(v){
            System.out.println("1. Administracion de jugadores");
            System.out.println("2. Iniciar juego");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("");
                    usuarios();
                    break;
                case 2:
                    System.out.println("");
                    inicio();
                case 3:
                    v = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
    public static void usuarios(){
        sc.useDelimiter("\\n");
        int menu;
        boolean v = true;
        while(v){
            System.out.println("1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Regresar");
            System.out.print("Escoja na opcion: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese un nombre de usuario: ");
                    String usuario = sc.next();
                    System.out.print("Ingrese su lugar de nacimiento: ");
                    String lnacimiento = sc.next();
                    System.out.print("Ingrese su edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese su sexo: ");
                    char sexo = sc.next().charAt(0);
                    jugadores.add(new Jugador(nombre,usuario,lnacimiento,edad,sexo));
                    break;
                case 2:
                    for (Jugador j : jugadores) {
                        System.out.println(j.toString());
                    }
                    break;
                case 3:
                    int i = 0;
                    for (Jugador j : jugadores) {
                        System.out.println(i+". "+j.toString());
                        i++;
                    }
                    System.out.print("Ingrese el indice del jugador a eliminar: ");
                    i = sc.nextInt();
                    try {
                        jugadores.remove(i);
                        System.out.println("Eliminado");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No hay un jugador con ese indice");
                    }
                    break;
                case 4:
                    v = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println("");
        }
    }
    public static void inicio(){
        piezas = new ArrayList();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = '°';
            }
        }
        piezas.add(new Caballero("negro","madera",0,0));
        piezas.add(new Caballero("negro","madera",1,4));
        piezas.add(new Caballero("negro","madera",0,9));
        piezas.add(new Caballero("blanco","madera",9,0));
        piezas.add(new Caballero("blanco","madera",8,5));
        piezas.add(new Caballero("blanco","madera",9,9));
        piezas.add(new Mago("negro","madera",0,5));
        piezas.add(new Mago("blanco","madera",9,4));
        piezas.add(new Arquero("negro","madera",1,2));
        piezas.add(new Arquero("negro","madera",0,3));
        piezas.add(new Arquero("negro","madera",0,6));
        piezas.add(new Arquero("negro","madera",1,7));
        piezas.add(new Arquero("blanco","madera",8,2));
        piezas.add(new Arquero("blanco","madera",9,3));
        piezas.add(new Arquero("blanco","madera",9,6));
        piezas.add(new Arquero("blanco","madera",8,7));
        piezas.add(new Rey("negro","madera",0,4));
        piezas.add(new Rey("blanco","madera",9,5));
        for (Pieza p : piezas) {
            tablero[p.getFila()][p.getColumna()] = p.getSimbolo();
        }
        System.out.println("Blanco son las fichas de abajo y negro las de arriba");
        jugar();
    }
    public static void jugar(){
        boolean v = true;
        boolean t = true;
        //t:  turno
        int f; 
        int c;
        int i, i2;
        while(v){
            imprimir();
            if(t)
                System.out.println("Turno de blanco.");
            else
                System.out.println("Turno de negro.");
            System.out.print("Ingrese la fila de la pieza que quiere mover: ");
            f = sc.nextInt();
            System.out.print("Ingrese la columna de la pieza que quiere mover: ");
            c = sc.nextInt();
            try {
                i = validar(f, c, t);
                v = false;
            } catch (FueraDeTablero fuera) {
                System.out.println(fuera.getMessage());
                System.out.println("");
            } catch (SeleccionMala sm) {
                System.out.println(sm.getMessage());
                System.out.println("");
            }
        }
    }
    public static void imprimir(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int validar(int f, int c, boolean t) throws FueraDeTablero, SeleccionMala{
        if(f > 9 || c > 9)
            throw new FueraDeTablero("Fila/Columna fuera del tablero");
        boolean v = false;
        int i = 0;
        for (Pieza p : piezas) {
            if (t)
                v = (p.getFila() == f && p.getColumna() == c && p.getColor().equals("blanco"));
            else
                v = (p.getFila() == f && p.getColumna() == c && p.getColor().equals("negro"));
            if(v){
                break;
            }
            i++;
        }
        if(!v)
            throw new SeleccionMala("No se seleccionaron coordenadas con una pieza del color correcto");
        return i;
    }
}
