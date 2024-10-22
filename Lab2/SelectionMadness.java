public class SelectionMadness {
    // no instance variables //
  
  public SelectionMadness() {}

  
  public String fortune() {
    int x = (int) ((Math.random()*5)+1);
    if (x==1) {
        return "You will have a very bad day today";
    } else if (x==2) {
        return "Better days are coming";
    } else if (x==3) {
        return "All your wishes will come true";
    } else if (x==4) {
        return "You will be fired from your job";
    } else {
        return "You will get hit by a truck sometime in the next 6 months";
    }
  }

  
  public int largest(int num1, int num2, int num3) {
     if (num1>=num2 && num1>=num3) {
        return num1;
     }
     if (num2>=num1 && num2>=num3) {
        return num2;
     }
     if (num3>=num2 && num3>=num1) {
        return num3;
     }
     return 7;
  }

  public boolean rightTriangle(int side1, int side2, int side3) {
    int c = largest(side1, side2, side3);
    int a;
    int b;
    if (c==side1) {
        a = side2;
        b = side3;
    } else if (c==side2) {
        a = side1;
        b = side3;
    } else {
        a = side1;
        b = side2;
    }
    double abCheck = (Math.pow(a,2)) + (Math.pow(b,2));
    double checkC = Math.pow(c,2);
    if (abCheck==checkC) {
        return true;
    } else {
        return false;
    }

    }
  }


