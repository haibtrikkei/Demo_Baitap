package ra.edu.ss02;

import java.util.Scanner;

public class Validate_DoWhile {
    public static void main(String[] args) {
        String id; //Yêu cầu: id có kích thước từ 4 - 6 kí tự

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập vào mã: ");
            id = sc.nextLine();
            if(id.length()<4 || id.length()>6){
                System.out.println("Id phải có kích thước từ 4 đến 6 ký tự");
            }
        }while (id.length()<4 || id.length()>6);

        System.out.println("Giá trị id vừa nhập "+id);
    }
}
