/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_andresmoncada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab4_AndresMoncada {

    static ArrayList<Jugador> jugadores = new ArrayList();
    static Scanner sc = new Scanner(System.in);
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
        
    }
}
