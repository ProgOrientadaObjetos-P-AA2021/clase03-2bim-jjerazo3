/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Seleccionar opcion\n1. Estudiante\n2. Docente\n3. Policia");
        int op = read.nextInt();
        read.nextLine();
        System.out.println("Ingresar nombre");
        String nombre = read.nextLine();
        System.out.println("Ingresar apellido");
        String apellido = read.nextLine();
        System.out.println("Ingresar edad");
        int edad = read.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingresar maticula");
                double mat = read.nextDouble();
                // TODO code application logic here
                Estudiante e = new Estudiante(nombre, apellido, edad, mat);
                System.out.println(e);
                break;

            case 2:
                System.out.println("Ingresar sueldo");
                double s = read.nextDouble();
                // Un docente hereda de una Persona y adicionalmente tiene 
                // la característia sueldo
                Docente d = new Docente(nombre, apellido, edad, s); // falta implementar
                System.out.println(d);
                break;

            case 3:
                read.nextLine();
                System.out.println("Ingresar rango");
                String rango = read.nextLine();
                // Un policia hereda de una Persona y adicionalmente tiene 
                // la característia rango
                Policia p = new Policia(nombre, apellido, edad, rango); // falta implementar
                System.out.println(p);
                break;
        }

    }

}