import java.util.Scanner;

public class Magic8Ball {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
     double x = ((Math.random()*5)+0.05);
     if (x>= 0.05 && x<=0.83) {
        System.out.println("It is certain");
     } else if (x> 0.83 && x<=1.66) {
        System.out.println("No");
     } else if (x> 1.66 && x<=2.49) {
        System.out.println("Yes");
     } else if (x> 2.49 && x<=3.32) {
        System.out.println("Ask again later");
     } else if (x> 3.32 && x<=4.15) {
        System.out.println("Cannot predict now");
     } else {
        System.out.println("Very doubtful");
     }
     
   }
}
