package org.example.juanjosegallego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";
        ArrayList<Object> productos=new ArrayList<>();


        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n******************");
        System.out.println(colorVerde+"***** Uribe APP *****");
        System.out.println("******************");

        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println("Digita una opcion");
        menuOption=keyEntry.nextInt();

        while(menuOption!=5){
            HashMap<String,Object> diccionario=new HashMap<>();
            try {

               if(menuOption==1){

                   //REGISTRAR PRODUCTOS EN BD
                   //System.out.println("registrar prenda en BD");
                   //keyEntry.nextLine();
                   //productos.add(keyEntry.nextLine());

                   //creacion de objetos/diccionario


                   //llenando un diccionario
                   System.out.println("Introduzca el id del producto");
                   diccionario.put("id",keyEntry.nextInt());

                   System.out.println("Introduzca el precio del precio");
                   diccionario.put("precio", keyEntry.nextInt());

                   System.out.println("Introduzca el nombre del producto");
                   keyEntry.nextLine(); //limpio el bufer
                   diccionario.put("nombre", keyEntry.nextLine());

                   System.out.println(diccionario);
               }
               else if(menuOption==2){
                    System.out.println("Mostrar el inventario de prendas");
                    System.out.println(productos);
               }
               else if(menuOption==3){
                    System.out.println("Modificar los datos de una prenda");
               }
               else if(menuOption==4){
                    System.out.println("Eliminar los datos de una prenda");
               }
               else if(menuOption==5){
                   System.out.println("SALIR USUARIO, GECIAS POR USAR NUESTRA APP");
               }

               System.out.println("ahora digita otra opcion");
               menuOption=keyEntry.nextInt();

            } catch (Exception error) {
                System.out.println(error.getMessage());
            }



        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS 4

    }
}
