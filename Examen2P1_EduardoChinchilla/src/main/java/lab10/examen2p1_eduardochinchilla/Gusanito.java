package lab10.examen2p1_eduardochinchilla;

import java.util.ArrayList;
import java.util.Random;
import static lab10.examen2p1_eduardochinchilla.Examen2P1_EduardoChinchilla.read;
import static lab10.examen2p1_eduardochinchilla.Examen2P1_EduardoChinchilla.rand;
public class Gusanito {

    private ArrayList<String> instrucciones;
    private char[][] tablero;
    private int xM;
    private int yM;
    private int xG;
    private int yG;

    public class gusanito {

    }

    public Gusanito(int n, int m) {
        System.out.println("Ingrese tamaño n: ");
        int n1 = read.nextInt();
        System.out.println("ingrese tamaño m: ");
        int m1 = read.nextInt();
        if (n1 >= 4 || n1 <= 10 || m1 >= 4 || m1 <= 10) {
            System.out.println("Tamaños ingresados fuera de limites, vuelva a ingresar: ");
            System.out.println("Ingrese tamaño n: ");
            n1 = read.nextInt();
            System.out.println("ingrese tamaño m: ");
            m1 = read.nextInt();
        }
    this.tablero = new char [n][m];
    this.xM = rand.nextInt(n);
    this.yM = rand.nextInt(m);
    this.xG = rand.nextInt(n);
    this.yG = rand.nextInt(m);
    
    this.tablero [xM][yM] = 'O';
    this.tablero [xG][yG] = 'S';
    }
public int mover (int n){
    
    return n;
}
}
