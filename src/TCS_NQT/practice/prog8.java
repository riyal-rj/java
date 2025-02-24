package TCS_NQT.practice;

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of members: ");
        int N=sc.nextInt();

        prog8 ob=new prog8();
        int res=ob.factorial(N-1) * 2;
        System.out.println(res);
    }

    private int factorial(int n)
    {
        if(n == 0 || n == 1)
            return 1;
        return n*factorial(n-1);
    }
}
