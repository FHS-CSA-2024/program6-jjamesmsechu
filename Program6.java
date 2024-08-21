//import stuff here!
import java.text.DecimalFormat;//Your code here
import java.util.Scanner;

public class Program6{
    public static void main(String[] args){

        //constants
        final double pi = 3.14;
        final DecimalFormat df = new DecimalFormat("#.000");

        Scanner scan = new Scanner(System.in);
        //gather user input
        System.out.print("Enter the radius : ");
        float radius = Float.parseFloat(scan.nextLine());

        // Calculate circumference, diameter and area
        String diameter = df.format(2*radius);
        String area = df.format(pi*(radius*radius));
        String circumference = df.format(2*(pi)*radius);

        System.out.print("The Radius of the circle : " + radius);
        System.out.print("\n \nThe Diameter of the circle = " + diameter);
        System.out.print("\n \nThe Area of the circle = " + area);
        System.out.print("\n \nThe Circumference of the circle = " + circumference);



        }

}
//Paste console output below:
/*


*/
