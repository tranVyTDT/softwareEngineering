
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class addtwonumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the firts number : ");
        String number1 = sc.nextLine();
        System.out.print("enter the second number : ");
        String number2 = sc.nextLine();
        
        MyBigNumber mybignumber = new MyBigNumber();
        
        System.out.print(mybignumber.sum(number1, number2));
    }
    
}
