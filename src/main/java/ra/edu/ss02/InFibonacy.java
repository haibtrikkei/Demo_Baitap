package ra.edu.ss02;

import java.util.Scanner;

public class InFibonacy {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giới hạn n: ");
        n = sc.nextInt();

        System.out.println("Dãy các số fibonacy từ 1 đến "+n+" là: ");
        int f0 = 0, f1 = 1;
        while(f1<=n){
            System.out.print(f1+"\t");
            f1 = f0 + f1;
            f0 = f1 - f0;
        }
    }
}
