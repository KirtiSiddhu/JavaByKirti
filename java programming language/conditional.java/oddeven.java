// import java.util.*;
// public class oddeven{
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int number = sc.nextInt();
//        if (number%2==0){
//         System.out.println("even");
    
//        } 
//        else{
//         System.out.println("odd");
//        }
//     }
// }
import java.util.*;
public class oddeven{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String ReportCard = (number>=33)?"Pass":"Fail";
    System.out.println(ReportCard);

  }
} 