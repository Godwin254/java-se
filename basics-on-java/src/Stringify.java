
public class Stringify {
    public static void main(String[] args){
        String s1 = "Hello World!"; //String
        String s2 = "Happy Birthday";
        String s3 = "  space  ";
        String s4 = "happy birthday";

        System.out.printf("to replace l - L: %s%n", s1.replace('l','L')); //replace()
        System.out.printf("convert to capital letters: %s%n", s4.toUpperCase()); //toUpperCase()
        //System.out.printf("s1 equals Hello world : %b%n", s1.equals("Hello World!") ); //equals()
        //System.out.printf("Compare s2 and s4 ignoring case: %s%n", s2.equalsIgnoreCase(s4)); //equalsIgnoreCase
        System.out.printf("CompareTo: %s%n", s2.compareTo(s4)); //compareTo()
        System.out.printf("Region matchesA: %s%n", s2.regionMatches(0, s4, 0, 5)); //regionMatches()
        System.out.printf("Region matches B: %b%n", s2.regionMatches(true,0, s4, 0, 5));
        System.out.printf("to replace l - L: %s%n", s3.trim()); //trim()


        char[] charArray = new char[5]; //character array object
        char[] array1 = s1.toCharArray();

        for (int i = 0; i < array1.length; i++){
            System.out.printf("%d: %s%n", i, array1[i]);
        }

        System.out.printf("String1 = %s%n", s1);
        System.out.printf("String1 length = %s%n", s1.length());

        //iterate through the string characters
        //print out character elements
        for (int i = 0; i < s1.length(); i++){
            System.out.printf("%s, ", s1.charAt(i));
        }

        System.out.println();

        //copy string characters into character array
        s1.getChars(0,5,charArray,0);

        //loop through character array
        for (char letter:charArray
        ) {
            System.out.println(letter);
        }

        System.out.println();

        //print character elements in reverse
        for (int i = s1.length() -1; i >= 0; i--){
            System.out.printf("%s", s1.charAt(i));
        }



    }
}
