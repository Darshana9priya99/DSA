import java.util.*;
public class OddNumber{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}