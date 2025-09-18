import java.util.Scanner;

public class Assignment1Program1 {
  String userString;
  public String reverseText(String inputText){
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("[Please enter a 5-character number]: ");
    userString = scannerObject.nextLine();


    return userString;
  }

  public static void main(String[] args) {
    System.out.println(
      "LLL                AAA      \n" +
      "LLL               AAAAA     \n" +
      "LLL              AAA AAA    \n" +
      "LLL             AAA   AAA   \n" +
      "LLL            AAAAAAAAAAA  \n" +
      "LLLLLLLLLLL   AAA       AAA \n" +
      "LLLLLLLLLLL  AAA         AAA\n"
    );
}
}
