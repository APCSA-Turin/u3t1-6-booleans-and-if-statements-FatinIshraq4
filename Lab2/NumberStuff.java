public class NumberStuff {

   public NumberStuff() { }


   public String positiveZeroOrNegative(int num) {
       if (num > 0) {
           return num + " is a positive number";
       }
       if (num == 0) {
           return num + " isn't positive or negative";
       }
       if (num < 0) {
           return num + " is a negative number";
       }
       return "";
   }

   public static void main(String[] args) {
    NumberStuff stuff = new NumberStuff();
    System.out.println(stuff.positiveZeroOrNegative(24));
    System.out.println(stuff.positiveZeroOrNegative(0));
    System.out.println(stuff.positiveZeroOrNegative(-13));
}
}

