package lab10.examen2p1_eduardochinchilla;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Examen2P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        //Gusanito g = new Gusanito();
        int opcion = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Libros y mas Libros");
            System.out.println("2. Gusanito hambriento");
            System.out.println("3. Salir");

            opcion = read.nextInt();

            switch (opcion) {

                case 1: {
                    int elegir = 0;
                    do {
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Eliminar libro");
                        System.out.println("3. Listar");
                        System.out.println("4. Buscar por titulo");
                        System.out.println("5. Regresar al menu");

                        elegir = read.nextInt();

                        switch (elegir) {

                            case 1: {

                                System.out.println("Ingrese el nombre del libro: ");
                                String titulo = read.next();

                                System.out.println("Ingrese el nombre del autor: ");
                                String autor = read.next();

                                libreria.addLibro(titulo, autor);
                                break;
                            }
                            case 2: {
                                System.out.println("Introduzca el nombre de libro a eliminar: ");
                                String titulo = read.next();
                                libreria.elimLibro(titulo);
                                break;
                            }
                            case 3: {
                                System.out.println("Lista de libros ingresados: ");
                                libreria.listLibro();
                                break;
                            }
                            case 4: {
                                System.out.println("que libro desea encontrar: ");
                                String titulo = read.next();
                                libreria.findLibro(titulo);
                                break;
                            }
                            case 5: {
                                System.out.println("Ha vuelto al menu principal");
                                break;
                            }

                            default:
                        }
                        break;
                    } while (elegir != 5);
                    break;
                }
                case 2: {
                    System.out.println ("Ingrese la unidad n que desea mover: ");
                    int n = read.nextInt();

                    break;
                }

                default:
                    break;
            }

        } while (opcion != 3);

    }//fin main

}
