package com.open_bootcamp;

public class Main {

    public static void main(String[] args) {
        int resultado;
    resultado = suma(10,5,6);
        System.out.println(resultado);

        Coche miCoche= new Coche();
        miCoche.ponerPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a,int b ,int c) {
        return (a+b+c);
    }
}


class Coche {
    public int puertas =4;

    public void ponerPuerta(){
        this.puertas++;
    }

}