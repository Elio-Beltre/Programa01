import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1- identicar variables
        int a, b, total;
        Scanner S = new Scanner(System.in);

        //2- imprimir el mensaje "ingrese a"
        System.out.print("ingrese a: ");

        //3- leer y almacenar en variable a
        a = S.nextInt();

        //4- imprimir el mensaje "ingrese b"
        System.out.print("ingrese b: ");

        //5- leer y almacenar en variable b
        b= S.nextInt();

        //6- total = a* b
        total = a*b;

        //7- imprimir el mensaje "el resultado es "
        // al valor del total
        System.out.print("El resultado es " + total);
    }
}
