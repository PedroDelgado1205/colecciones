import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ope();
    }
    public static void ope(){
        Scanner input = new Scanner(System.in);
        int num = 0, val=0, suma=0, mult=1;
        System.out.printf("Cuantos números decea ingresar: ");
        num = input.nextInt();
        for (int i = 1; i <=num; i++){
            System.out.println("ingrese un valor: ");
            val= input.nextInt();
            suma=val+suma;
            mult=val*mult;
        }
        System.out.println("Todos los números sumados dan: "+suma);
        System.out.println("Todos los números multiplicados dan: "+mult);
    }
}