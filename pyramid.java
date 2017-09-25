import java.io.Console;

class Pyramid {
  public static void main(String [] args){
    Console console = System.console();
    String userInput = console.readLine("Please enter a number: ");
    int userNumber = Integer.parseInt(userInput);
    int x = 1;
    int y = 1;
    int lastLine = lastLineSize(userNumber);
    while (x <= userNumber) {
      int spaces = (lastLine - y)/2;
      printSpace(spaces);
      printX(y);
      y = y + 2;
      x++;
      System.out.print("\n");
    }
  }

  private static int lastLineSize(int x){
    return x + (x-1);
  }

  private static void printX(int times){
    int x = 0;
    while (x < times){
      System.out.print("*");
      x++;
    }
  }

  private static void printSpace(int times){
    int x = 0;
    while (x < times){
      System.out.print(" ");
      x++;
    }
  }
}
