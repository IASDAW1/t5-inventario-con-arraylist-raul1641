/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebagit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Pruebagit {

    public static void main(String[] args) {
       
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 agregar producto");
            System.out.println("2 mostrar inventario");
            System.out.println("3 salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("nombre del producto: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);

                    System.out.print("precio: ");
                    double precio = scanner.nextDouble();
                    precios.add(precio);

                    System.out.print("cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    cantidades.add(cantidad);

                    System.out.println("Producto agregado al inventario: " + nombre);
                    break;

                case 2:
                    System.out.println("Inventario actual:");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println("pmbre: " + nombres.get(i));
                        System.out.println("Precio: " + precios.get(i));
                        System.out.println("Cantidad en stock: " + cantidades.get(i));
                    }
                    break;

                case 3:
                    System.out.println("adiós");
                    System.exit(0);

                default:
                    System.out.println("opción no valida");
            }
        }
    }
}

