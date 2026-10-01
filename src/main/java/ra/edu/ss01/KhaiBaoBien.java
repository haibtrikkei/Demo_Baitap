package ra.edu.ss01;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhaiBaoBien {
    public static void main(String[] args) {
        int a;
        float b;
        double c;
        long d;
        char ch;
        boolean bl;
        String name;
        Date dob;

        //Khai báo hằng số
        final int n = 1000;

        a = 10;
        b = 2.34F;
        c = 25235.235325;
        d = 252532556;
        ch = 'G';
        name = "Nguyễn Tuấn Anh";
        //Lấy ngày bất kỳ:
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dob = sdf.parse("25/12/2001");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        bl = true;

        System.out.println("a = " + a);
        System.out.printf("b=%.1f", b); //In theo định dạng của C
        System.out.println("\nc = "+c+", d = "+d);
        System.out.println("Chào bạn: "+name);
        System.out.println("Kí tự: "+ch);
        System.out.println("Trạng thái: "+(bl?"Active":"Nonactive"));
        System.out.println("Ngày tháng: "+dob); //Kiểu GMT
        System.out.println("Ngày tháng có format: "+sdf.format(dob));

        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Giá trị: "+nf.format(d));

//        n = 2000;  không được do n là hằng số
    }
}
