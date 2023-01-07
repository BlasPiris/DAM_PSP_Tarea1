/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import java.util.Scanner;
/**
 *
 * @author bpiris
 */
public class piris_ruiz_blas_PSP01_Tarea {

    /**
     * MAIN DONDE LLAMAMOS A LOS  METODOS
     */
    public static void main(String[] args) {
        ordenarNumeros();
        System.out.println("-----------------------");
        aleatorios();
    }
    /**
     * METODO QUE ORDENA LOS NUMEROS OBTENIDOS DEL USUARIO Y LOS MUESTRA POR PANTALLA
     */
       public static void ordenarNumeros(){
           /**
            * @param nIndeterminado Número indeterminado de veces que pediremos al usuario que escriba un número
            * @param arrayNumeros ArrayList donde almacenaremos los números
            * @param sc Scanner para obener los numeros del usuario
            * 
            */
            int nIndeterminado = 5;
            ArrayList<Integer> arrayNumeros=new ArrayList<>();
            Scanner sc=new Scanner(System.in);
            
            /**
             * EJECUTAMOS UN FOR PARA SOLICITAR LOS NUMEROS. LOS GUARDAMOS EN EL ARRAY
             */
            for(int i =0; i < nIndeterminado; i++){
                System.out.println("Introduce un numero");
                 arrayNumeros.add(sc.nextInt());
            }
            
            /**
             * PARA ORDENAR LOS NUMEROS, USAREMOS LA CLASE COLLECTIONS Y SU METODO SORT PARA ORGANIZAR EL ARRAY
             */
       
            Collections.sort(arrayNumeros);
       
            /**
             * HACEMOS OTRO FOR PARA LEER EL ARRAY
             */
            for(int i =0; i < arrayNumeros.size(); i++){
                System.out.println("-----------------------");
                System.out.println(arrayNumeros.get(i));
            }
            
             System.out.println("-----------------------");
             
        }
       
       /**
        * METODO QUE GENERA 40 NUMEROS ALEATORIOS Y LOS MUESTRA POR PANTALLA
        */
       
        public static void aleatorios(){
            /**
             * @param rand Variable de tipo random que utilizaremos para obener un numero aleatorio
             * @param arrayNumeros ArrayList donde almacenaremos los números
             */
            Random rand=new Random();
            ArrayList<Integer> arrayNumeros=new ArrayList<>();
            
            /**
             * REALIZAMOS UN BUCLE PARA GENERAR 40 NÚMEROS ALEATORIOS Y LOS AMACENAMOS EN EL ARRAY
             */
             for(int i =0; i < 40; i++){
              arrayNumeros.add(rand.nextInt(100));
            }
             
             /**
              * REALIZAMOS UN SEGUNDO BUCLE PARA MOSTRAR POR PANTALLA LOS NÚMEROS
              */
            for(int i =0; i < arrayNumeros.size(); i++){
                System.out.println("-----------------------");
                System.out.println(arrayNumeros.get(i));
            }
        }
    
}