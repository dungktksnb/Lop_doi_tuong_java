import java.io.Serializable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();
        QuadraticEquation nghiem = new QuadraticEquation(a, b, c);
        double d=nghiem.getDiscriminant();
        if(d>0){
            System.out.println("phương trình có 2 nghiệm là :"+ "x1="+nghiem.getRoot1()+";" +"x2="+nghiem.getRoot2());
        }else if (d==0 ){
            System.out.println("phuong trình có nghiệm là :" +nghiem.getRoot1());

        }else {
            System.out.println("phương trình vô nghiệm .");
        }

    }
}

