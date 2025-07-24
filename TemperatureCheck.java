import java.util.*;
public class TemperatureCheck{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Check Temperature");
        int temp= sc.nextInt();
        if(temp>30){
            System.out.println("It's hot!");
        }
        else if(temp>=20&&temp<=30){
            System.out.println("It's warm");
        }
        else if (temp>=10&&temp<=20){
            System.out.println("It's cool");
        }
        else{
            System.out.println("It's cold");
        }
    }
}