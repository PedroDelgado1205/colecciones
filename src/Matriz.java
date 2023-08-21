import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int M[][] = new int[2][2];
        int N[][] = new int[2][2];
        Scanner sacan = new Scanner(System.in);
        for (int i=0; i<=M.length-1; i++){
            for (int j=0; j<=M[0].length-1; j++){
                System.out.println("intrese un valor "+i+" "+j+" de la primera matriz: ");
                M[i][j] = sacan.nextInt();
            }
        }
        for (int i=0; i<=N.length-1; i++){
            for (int j=0; j<=N[0].length-1; j++){
                System.out.println("intrese un valor "+i+" "+j+" de la segunda matriz: ");
                N[i][j] = sacan.nextInt();
            }
        }
        multiplicación(N, M);
    }
    public static int[][] multiplicación (int [][] A, int [][] B){
        int n= A[0].length;
        int n2= B.length;
        int [][] C= new int [n2][n];
        if (n==n2){
            for (int i=0; i<n-1;i++){
                for (int j=0; j<n2-1;j++){
                    C[i][j] = A[i][j]*B[j][i];
                }
            }
        }
        imprimirM(C);
        return C;
    }
    public static void imprimirM(int V[][]){
        for (int i=0; i<=V.length-1; i++){
            for (int j=0; j<=V[0].length-1; j++){
                System.out.print(V[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
