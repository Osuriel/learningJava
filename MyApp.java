import java.io.Console;

class MyApp {
  public static void main(String [] args){
    Console console = System.console();
    String userInput = console.readLine("Please enter a number");
    int userNumber = Integer.parseInt(userInput);
    int x = 0;
    while (x <= userNumber) {
      printX(x);
      x++;
    }
  }

  private static void printX(int times){
    int x = 0;
    while (x < times){
      System.out.print("*");
      x++;
    }
    System.out.print("\n");
  }
}
