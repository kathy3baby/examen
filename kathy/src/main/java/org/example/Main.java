package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int usuario;
        int intentos = 3;

        numero = (int) (Math.random()*100+1);
        System.out.println("ingresa un numero entre el 1 y 100. "
                + "Tienes 3 intentos.");
        System.out.println(numero);
        //  ciclo do-while
        do {
            System.out.println("intento numero: " + intentos);
            System.out.print("Ingresa el número que creas posible: ");
            usuario = scanner.nextInt();
            if (usuario > numero) {
                System.out.println("El número que buscas es menor, te quedan "
                        + (intentos-1) + " intentos: ");
            } else if (usuario < numero){
                System.out.println("El número que buscas es mayor, te quedan "
                        + (intentos-1) + " intentos: ");
            } else {
                System.out.print("¡CORRECTO! "+ numero + " era el número que estabas ");
            }
            intentos--;
        } while (usuario != numero && intentos > 0);
        if (intentos == 0) {
            System.out.println("Has perdido. El numero aleatorio era " + numero);
        }
    }
}