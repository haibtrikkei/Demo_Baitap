package ra.edu.ss02;

public class Vong_Lap_While {
    public static void main(String[] args) {
        // Tính giá trị biểu thức: A = 1 + 1/2 + 1/3 + ... + 1/n
        // Với điều kiện 1/n >=0.025

        float A = 0;
        int i = 1;
        while(1.0/i>=0.025){
            A = A + 1.0F/i;
            i++;
        }
        System.out.println("Giá trị của biểu thức A là: "+A);
    }
}
