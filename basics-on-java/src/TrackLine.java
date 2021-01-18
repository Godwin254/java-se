import java.util.*;
/*
Program that calculates the number of track-line needed by a
railway station from a given newLine input
    **Required**
*Enter length of a newLine in miles
*convert the the length into metres
*calculate number of track sections needed for each new line
(each track section measures 7.84 metres//final track section can be fraction )
*display number of track sections needed for each line
* **/
public class TrackLine {
    //fields
    private static final Scanner input = new Scanner(System.in);

    //function to convert length to metres
    public static double milesToMetres(double newLength){

        //formula 1Mile - 1,609.344Metres
        double result = 0;

        if (newLength > 0) {
            result = newLength * 1609.344;
        }else{
            System.out.println("Enter a value greater than zero");
        }

        return  result;
    }

    //function to calculate number of track sections needed
    static double trackSections(double lengthInMetres){

        //formula: 1 trackSection ==  7.84Metres
        //trackSectionsNeeded = newLengthInMetres / 7.84 metres

        return lengthInMetres / 7.84;
    }

    //main function/method
    public static void main(String[] args){
        //input newLineLength(miles)
        System.out.print("Enter new Line Length(in miles): ");
        double newLineLength = input.nextDouble();

        //length int metres
        double lengthInMetres = milesToMetres(newLineLength);

        //track sections
        double trackSectionsNeeded = trackSections(lengthInMetres);

        //Display number of track sections for each Newline
        System.out.printf("%.3f Miles == %.3f Metres%n", newLineLength, lengthInMetres); //miscellaneous display
        System.out.printf("%.3f Metres makes %.3f Track sections%n", lengthInMetres, trackSectionsNeeded);
    }
}

class NewClass{
    public static void main(){

    }
}
