import java.util.Scanner;

public class Assignment1Program1 {
  String reverseChars = "";
  Double celciusConv;
  public void reverseText(String inputText){
    for(int  z = (inputText.length() - 2); z >= 1; z--){
      reverseChars = reverseChars + inputText.charAt(z);
    }
    //System.out.println(reverseChars); (Testing)
  }
  public void fahrenToCelcius(double inputFahren){
    celciusConv = ((inputFahren - 32.0)/1.8);
  }
  public static void main(String[] args){
    Assignment1Program1 apObjectOne = new Assignment1Program1();
    System.out.println(
      "LLL                AAA      \n" +
      "LLL               AAAAA     \n" +
      "LLL              AAA AAA    \n" +
      "LLL             AAA   AAA   \n" +
      "LLL            AAAAAAAAAAA  \n" +
      "LLLLLLLLLLL   AAA       AAA \n" +
      "LLLLLLLLLLL  AAA         AAA\n"
    );
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("[Please enter a 5-character string]: ");
    String userString = scannerObject.nextLine();
    apObjectOne.reverseText(userString);
    System.out.println("[Please enter a number in Fahrenheit ]: ");


}
}
