package TCS_NQT.practice;

public class prog2 {
    public static void main(String[] args) {
        prog2 ob2=new prog2();
        ob2.decimalToBinary(20);
    }

    public void decimalToBinary(int num)
    {
        String binary= "";
        while(num!=0)
        {
           binary=(num&1)+binary;
           num=num>>1;
        }
        binary=binary.replaceAll("1","2");
        binary=binary.replaceAll("0","1");
        binary=binary.replaceAll("2","0");
        int n=Integer.parseInt(binary,2);
        System.out.println(n);

    }
}
