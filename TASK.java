/*

Print any given inputString in following format.
input --> "Hello"

Output

index:  0    1   2   3   4
chars:  H    e   l   l   o

Every character is separated by tab, use "\t" for inserting tab.
*/

import java.util.Scanner;

public class TASK {
    public static void main(String[] args){
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("input ---> ");
        String inputString=scannerObj.nextLine();
        scannerObj.close();

        System.out.println("Output");

        System.out.print("index: ");

        int lengthOfInputString=inputString.length();

        for (int i=0;i<lengthOfInputString;i++)
        {
            System.out.print(i);
            if(i!=lengthOfInputString-1){
                System.out.print("\t");
            }
        }

        System.out.println();
        System.out.print("chars: ");

        for (int j=0;j<lengthOfInputString;j++)
        {
            System.out.print(inputString.charAt(j));
            if(j!=lengthOfInputString-1){
                System.out.print("\t");
            }
        }
    }
}
