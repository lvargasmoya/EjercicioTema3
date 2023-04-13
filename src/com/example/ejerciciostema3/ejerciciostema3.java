package com.example.ejerciciostema3;

public class ejerciciostema3 {

    public static void main(String[] args) {
        int result;
        result = sumaEntreSi(600,60, 6);
        System.out.println(result);

        coche miCoche = new coche();
        miCoche.increPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int sumaEntreSi(int a, int b, int c){
        return a + b + c;
    }
}
class coche {
    public int puertas = 3;

    public void increPuertas() {
        this.puertas++;
    }
}