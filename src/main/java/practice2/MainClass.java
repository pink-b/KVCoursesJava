package practice2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        //Однострочный комментарий
        /*многострочный комментарий*/
        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList(true, "string", 'c', 0b101, 0X0005, 011, 878, 23.25F, 23.25D));
        int i = 0;
        while(arr.indexOf(arr.get(i)) != arr.size()-1) {
            System.out.println(arr.get(i));
            i++;
        }
        System.out.println(new MainClass().sum(1,2));
    }
    public void iter(List arr, Object el) {
        if(arr.indexOf(el) == arr.size() - 1) {System.out.println(el);}
        else {
            System.out.println(el);
            iter(arr, arr.indexOf(el)+1);
        }
    }
    public int sum(int num1, int num2) {return num1 + num2;};

    public double diff(int num1, int num2) {return num1 - num2;}

    public long multip(int num1, int num2) {return ((long) num1 * num2);}

    public BigInteger div (int num1, int num2) {return BigInteger.valueOf(num1 / num2);}
}
