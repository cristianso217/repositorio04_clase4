
package programas;

import java.util.Scanner;
public class producto {
    public static void main(String[]args){
        //declarar variables
        int n1,n2,n3,producto,suma,suma2;
        Scanner lectura=new Scanner(System.in);
        //entrada
        System.out.print("Ingresar número 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar número 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar número 3:");
        n3=lectura.nextInt();
        //proceso
        producto=n1*n2*n3;
        suma=n1+n2+n3;
        suma2=n1+n2;
        //salida
        System.out.println("El producto de los números es:"+producto );
        System.out.println("La suma de los números es:"+suma);
        //SE PROCEDIO CON LA MODIFICACION
        System.out.println("Suma de dos primeras compras es:"+suma2);
    }
    
}
