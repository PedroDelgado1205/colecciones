import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int A[] = new int[5];
        Scanner sacan = new Scanner(System.in);
        for (int i=0; i<=A.length-1; i++){
            System.out.println("intrese un valor "+i+": ");
            A[i]= sacan.nextInt();
        }
        imprimirA(A);
    }
    public static void imprimirA(int V[]){
        for (int i=0; i<=V.length-1; i++){
            System.out.print(V[i]+" ");
        }
    }
}
