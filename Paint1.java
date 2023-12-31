// Christopher Burkett 
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
       
        do {
            System.out.println("Enter wall height in feet: ");

            
            if(!scnr.hasNextDouble()) {
            	scnr.next();
            	continue;
            }

            wallHeight = scnr.nextDouble();

            // no paint
            if(!(wallHeight > 0))
               continue;
            
            break;
         } while(true);


        do {
            System.out.println("Enter wall width in feet: ");

            if(!scnr.hasNextDouble()) {
               scnr.next();
               continue;
            }

            wallWidth = scnr.nextDouble();

            if(!(wallWidth > 0))
               continue;
            
            break;
         } while(true);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        //Cans Needed
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansPaintNeeded + " can(s)");

    }
}
