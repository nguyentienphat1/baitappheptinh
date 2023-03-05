import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int so1;
        int so2;
        int tong, hieu, tich, thuong, du;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập giá trị số 1");
        so1= scanner.nextInt();
        System.out.println("nhập giá trị số 2");
        so2= scanner.nextInt();
        tong=so1+so2;
        hieu=so1-so2;
        tich=so1*so2;
        thuong=so1/so2;
        du=so1%so2;
        System.out.println("kết quả tổng 2 số trên là:"+tong);
        System.out.println("kết quả hiệu 2 số trên là:"+hieu);
        System.out.println("kết quả tích 2 số trên là:"+tich);
        System.out.println("kết quả thương 2 số trên là:"+thuong);
        System.out.println("kết quả dư 2 số trên là:"+du);

    }
}