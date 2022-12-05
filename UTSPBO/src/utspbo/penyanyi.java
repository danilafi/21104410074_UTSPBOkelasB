package utspbo;

/**
 *
 * @author Lenovo
 */

public class penyanyi extends Pop{
    public static void main(String[]args) {
        Pop pop = new Pop ("Blackpink", "How You Like That");
        Dangdut dangdut = new Dangdut ();
    
        pop.singer ("Eclat Story");
        pop.song ("Bentuk Cinta");
        pop.cetakLabel();
    
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
    }  
}
