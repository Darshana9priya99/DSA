import java.util.*;
public class GradingSystem{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter your exam score(0-100):");
        int score = sc.nextInt();
        if (score<0||score>100){
            System.out.println("Invalid score input");
            return;
        }
        switch (score/10){
            case 10:
                case 9:
                    System.out.println("Grade:A(Excellent)");
                    break;
                    case 8:
                        System.out.println("Grade :B(Very Good)");
                        break;
                        case 7:
                            System.out.println("Grade:C(Good)");
                            break;
                            case 6:
                                System.out.println("Grade:D(Satisfactory)");
                                break;
                                default:
                                    System.out.println("Grade:F(Fail)");
        }
    }
}