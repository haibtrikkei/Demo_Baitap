package ra.edu.ss02;

import java.util.Scanner;

public class DocSoRaChu {
    public static void main(String[] args) {
        //Nhập vào 1 số có 2 chữ số, đọc số đó ra chữ
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số có 2 chữ số: ");
        number = sc.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Số nhập vào không đúng");
        } else {
            //Tách số  34  -> chuc = 3, donvi = 4
            int chuc = number / 10;
            int donvi = number % 10;

            //CTRL + ALT + L = format code
            switch (chuc) {
                case 1:
                    System.out.print("Mười ");
                    break;
                case 2:
                    System.out.print("Hai mươi ");
                    break;
                case 3:
                    System.out.print("Ba mươi ");
                    break;
                case 4:
                    System.out.print("Bốn mươi ");
                    break;
                case 5:
                    System.out.print("Năm mươi ");
                    break;
                case 6:
                    System.out.print("Sáu mươi ");
                    break;
                case 7:
                    System.out.print("Bảy mươi ");
                    break;
                case 8:
                    System.out.print("Tám mươi ");
                    break;
                case 9:
                    System.out.print("Chín mươi ");
                    break;
            }

            switch (donvi) {
                case 1:
                    if(chuc==1) {
                        System.out.println("một");
                    }
                    else {
                        System.out.println("mốt");
                    }
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("lăm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
            }
        }
    }
}
