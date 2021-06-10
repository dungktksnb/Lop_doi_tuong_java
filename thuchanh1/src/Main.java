import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chiều rộng :");
        double width=scanner.nextDouble();
        System.out.println("nhập chiều dài :");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("hình chữ nhật có chiều rộng và chiều dài là: \n" +rectangle.display());
        System.out.println("chu vi hình chữ nhật của hình chữ nhật là : \n" +rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật là :" +rectangle.getAcreage());
        System.out.println("xét lại giá trị của chiều rộng và chiều dài");
        rectangle.setWith(20);
        rectangle.setHeight(100);
        System.out.println("diện tích khi thay đổi là :" +rectangle.getAcreage());
        System.out.println("chu vi khi thau thay đổi lại dữ liệu là :" +rectangle.getPerimeter());


    }
}
