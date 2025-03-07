package Arrays.Leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class LargeFactorialNumber {
    public static void main(String[] args) {
        LargeFactorialNumber lfn=new LargeFactorialNumber();
        System.out.println(lfn.factorialDigits(10));
    }
    List<Integer> factorialDigits(int n)
    {
        BigInteger fact=BigInteger.ONE;

        for(int i=2;i<=n;i++)
            fact=fact.multiply(BigInteger.valueOf(i));

        List<Integer> res=new ArrayList<>();
        for(char c:fact.toString().toCharArray())
            res.add(c - '0');

        return res;
    }
}
