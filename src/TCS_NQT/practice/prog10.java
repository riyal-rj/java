package TCS_NQT.practice;

import java.util.Scanner;

public class prog10 {
    private boolean isEven(int n)
    {
        return (n&1)==0?true:false;
    }

    private int calculateFine(int date,int []regiCarNos,int fineCharges)
    {
        int []count=countOddEven(regiCarNos);
        if(isEven(date))
            return count[1]*fineCharges;
        else
            return count[0]*fineCharges;

    }
    private int []countOddEven(int []regiCarNos)
    {
        int countEven=0,countOdd=0;
        for(int carNo:regiCarNos)
        {
            if(isEven(carNo))
                countEven++;
            else
                countOdd++;
        }
        return new int []{countEven,countOdd};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of registered Cars: ");
        int NoOfCars=sc.nextInt();
        int []regisCars=new int[NoOfCars];
        System.out.println("Enter the no of registration ID of Cars: ");
        for(int i=0;i<NoOfCars;i++)
            regisCars[i]=sc.nextInt();
        System.out.println("Enter the fine charges per car: ");
        int fineCharges=sc.nextInt();
        System.out.println("Enter the date: ");
        int date=sc.nextInt();
        prog10 ob=new prog10();
        System.out.println(ob.calculateFine(date,regisCars,fineCharges));
    }
}
