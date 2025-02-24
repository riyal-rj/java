package TCS_NQT.practice;

import java.util.Scanner;

public class prog9 {
    private int sumOfDigits(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum=sum+ num%10;
            num/=10;
        }
        return sum;
    }
    private int singleDigitSum(int num)
    {
        while(num>=10)
        {
            num=sumOfDigits(num);
        }
        return num;
    }
    private int solve(int N,int R)
    {
        int digitSum=sumOfDigits(N);
        int totalSum=digitSum*R;
        return singleDigitSum(totalSum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        sc.close();
        prog9 ob=new prog9();
        System.out.println(ob.solve(N,R));
    }
}
