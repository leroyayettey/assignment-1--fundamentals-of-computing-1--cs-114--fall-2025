import java.util.Scanner;

public class Assignment1Program2 {
  public int maxFourDigRep(int base){
    int maxInt;
    maxInt = (int)(((base - 1) * Math.pow(base, 0)) + ((base - 1) * Math.pow(base, 1)) + ((base - 1) * Math.pow(base, 2)) + ((base - 1) * Math.pow(base, 3)));
    return maxInt;
  }


  public static void main(String[] args) {
    Assignment1Program2 a1p2Object = new Assignment1Program2();
    Scanner scannerTool = new Scanner(System.in);
    System.out.println("[ BASE CONVERSION PROGRAM ]\n[ Please enter a base (2 - 9) ]: ");
    int userChosenBase = scannerTool.nextInt();
    System.out.println("[The maximum 4-digit base 10 number in base " + userChosenBase + " is [ " + a1p2Object.maxFourDigRep(userChosenBase) + " ].\n[ Enter a base 10 number in the range (0 to " + userChosenBase + ") to convert: ");
    int userBaseTen = scannerTool.nextInt();
    System.out.println("");





  }
}
