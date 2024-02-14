/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2p1_miguelmoran;
import java.util.Scanner;
/**
 *
 * @author flash
 */
public class Tarea2P1_MiguelMoran {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        while(seguir){
            System.out.println("1. Replace");
            System.out.println("2. Factorial");
            System.out.println("3. Mensajes");
            System.out.println("4. Promedios");
            System.out.println("5. Aprobabo o Reprobado");
            System.out.println("6. Contains");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.print("Escriba una palabra: ");
                    String palabra = sc.next();
                    System.out.print("Escriba un caracter que desea cambiar: ");
                    char char_por_cambiar = sc.next().charAt(0);
                    System.out.print("Escriba el caracter por el que lo desea cambiar: ");
                    char char_nuevo = sc.next().charAt(0);
                    System.out.println(Reemplazo(palabra, char_por_cambiar, char_nuevo));
                }
                case 2 ->{
                    System.out.print("Escriba el numero del cual desea calcular el factorial: ");
                    int numero = sc.nextInt();
                    System.out.println("El factorial del numero es: "+Factorial(numero));
                }
                case 3 ->{
                    System.out.print("Escriba una palabra: ");
                    String palabra = sc.next();
                    Mensaje(palabra);
                }
                case 4 ->{
                    System.out.print("Ingrese la primera nota: ");
                    int nota1 = sc.nextInt();
                    System.out.print("Ingrese la segunda nota: ");
                    int nota2 = sc.nextInt();
                    System.out.print("Ingrese la tercera nota: ");
                    int nota3 = sc.nextInt();
                    System.out.print("Ingrese la cuarta nota: ");
                    int nota4 = sc.nextInt();
                    System.out.println("El promedio es: "+Promedio(nota1, nota2, nota3, nota4));
                }
                case 5 ->{
                    System.out.print("Ingrese la nota del alumno: ");
                    int nota = sc.nextInt();
                    if(Test(nota)){
                        System.out.println("El alumno a reprobado");
                    } else {
                        System.out.println("El alumno a reprobado");
                    }
                }
                case 6 ->{
                    System.out.print("Escriba una palabra: ");
                    String palabra = sc.next();
                    System.out.print("Escriba otra palabra: ");
                    String palabra1 = sc.next();
                    if(Contains(palabra, palabra1)){
                        System.out.println(palabra+" contiene "+palabra1);
                    } else {
                        System.out.println(palabra+" no contiene "+palabra1);
                    }
                }
                case 7 ->{
                    seguir = false;
                }
                default ->{
                    System.out.println("Seleccione una opcion valida");
                }
            }
        }
        
    }
    public static String Reemplazo(String palabra, char char_camb, char char_nuevo){
        String nuevpal = "";
        for (int i = 0; i < palabra.length(); i++) {
            char char_act = palabra.charAt(i);
            if(char_act == char_camb){
                nuevpal += char_nuevo;
            } else {
                nuevpal += char_act;
            }
        }
        return nuevpal;
    }
    public static int Factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void Mensaje(String m){
        System.out.println(m);
    }
    public static int Promedio(int n1, int n2, int n3, int n4){
        int total = n1 + n2 + n3 + n4;
        int prom = total/4;
        return prom;
    }
    public static boolean Test(int n){
        boolean ver = true;
        if(n < 60){
            ver = false;
        }
        return ver;
    }
    public static boolean Contains(String string, String substring){
        boolean contains = false;
        if(substring.length() < string.length()){
            for(int i = 0; i < string.length() - substring.length() + 1; i++) {
                String seg = "";
                for(int j = 0; j < substring.length(); j++) {
                    seg += string.charAt(i+j);
                }
                if(seg.equalsIgnoreCase(substring)){
                    contains = true;
                    i++;
                }
            }
        }
        return contains;
    }
}
