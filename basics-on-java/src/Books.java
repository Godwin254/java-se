import java.util.EnumSet;
public enum  Books {
    //enum constants
    HTPJ("How To Program in Java", "2015"),
    OOP("Object Oriented Programming", "2020"),
    JSR("Javascript Recipes", "2005"),
    HkPJ("How To Program in Java", "2015"),
    OOPL("Object Oriented Programming", "2020"),
    JSRL("Javascript Recipes", "2005"),
    HTPJK("How To Program in Java Easy", "2045"),
    OOPT("Object Oriented Programming T.", "2000"),
    JSRS("Javascript Recipes", "2015");

    //enum fields
    private final String title;
    private final String copyright;

    //enum constructor
    Books(String title,String copyright){
        this.title = title;
        this.copyright = copyright;
    }

    //enum methods
    public String getTitle(){
        return title;
    }
    //enum method
    public String getCopyright(){
        return copyright;
    }

    public static void main(String[] args){
        System.out.printf("%-8s%-30s%-20s%n", "Book", "Title", "Copyright");
        System.out.println("----------------------------------------------");

        for (Books book : Books.values()
             ) {
            System.out.printf("%-8s%-30s%-20s%n", book, book.getTitle(), book.getCopyright());
        }

        System.out.printf("%n%n%-8s%-30s%-20s%n", "Book", "Title", "Copyright");
        System.out.println("----------------------------------------------");

        for (Books book : EnumSet.range(Books.JSRL,Books.OOPT)
        ) {
            System.out.printf("%-8s%-30s%-20s%n", book, book.getTitle(), book.getCopyright());

        }
    }
}
