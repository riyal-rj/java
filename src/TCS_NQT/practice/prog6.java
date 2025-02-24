package TCS_NQT.practice;
import java.util.Scanner;
public class prog6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();

        prog6 ob6=new prog6();
        System.out.println(ob6.productOfDigits(price));
    }
    int productOfDigits(int num)
    {
        int prod=1;
        while(num!=0)
        {
            prod=prod*(num%10);
            num/=10;
        }
        return prod;
    }
}
