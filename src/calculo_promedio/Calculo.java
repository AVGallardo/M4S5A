package calculo_promedio;

import java.util.Scanner;

public class Calculo {
    public void solicitar(){

        Scanner sc = new Scanner(System.in);
        String[] listaMaterias = new String[5];
        double[] listaNotas = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese el NOMBRE de la asignatura");
            listaMaterias[i] = sc.next();
            System.out.println("Ingrese el PROMEDIO de la asignatura: "+listaMaterias[i]);
            listaNotas[i] = sc.nextDouble();
        }
        mostrar(listaMaterias, listaNotas);
    }
    private void mostrar(String[] listaMaterias, double[] listaNotas){
        double notas = 0;

        System.out.println("Sus notas son las siguientes");
        for(int i = 0; i < 5; i++){
            System.out.println( listaMaterias[i] + " = " + listaNotas[i]);
            notas = notas + listaNotas[i];
        }
        System.out.println("Su PROMEDIO GENERAL es de = " + (notas/5));
    }
}
