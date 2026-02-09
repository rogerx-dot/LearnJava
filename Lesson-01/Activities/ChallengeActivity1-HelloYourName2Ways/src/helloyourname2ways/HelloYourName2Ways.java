/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author mafudge
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.Println ("Enter your first name: " + firstName);
        String firstName = sc.nextline();
        System.out.Println ("Enter your last name: " + lastName);
        String lastName = sc.nextline();
     
        System.out.println("Hello " + firstName + ", " + lastName + " !");
        System.out.println("or should I say: " + lastName + ", " + firstName);
        sc.close();// TODO code application logic here

    }
    
}
