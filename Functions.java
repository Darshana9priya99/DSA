import java.util.*;
public class Functions{
    //public static void printMyName(String name){
        //System.out.print(name);
       // return ;

       //public static int calculateSum(int a,int b){
        //int sum= a+b;
        //return sum;

        //public static int productNo(int a , int b){
        //int product = a*b;
        //return product;

        public static void printFactorial(int n){
            int factorial =1;
            for(int i=n;i>=1;i--){
                factorial=factorial*i;
            }
            System.out.println(factorial);
            return;
       }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //String name= sc.next(); 
       // int a =sc.nextInt();
        //int b =sc.nextInt();
        int n = sc.nextInt();
        
       // printMyName(name);
      // int sum = calculateSum(a,b);
       //System.out.println(sum);

      // int product = productNo(a,b);
       //System.out.println(product);
       printFactorial(n);
    }}
