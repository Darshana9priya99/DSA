import java.util.*;
public class SimpleCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction");
        int choice= sc.nextInt();
        if(choice==1){
            System.out.println("Enter two numbers");
            int a= sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("The sum is:"+sum);
        }
        else if (choice==2){
            System.out.println("Enter two numbers");
            int a= sc.nextInt();
            int b= sc.nextInt();
            int diff= a-b;
            System.out.println("The diff is:"+diff);
         }
        else{
            System.out.println("Invalid choice");
        }
    }
}