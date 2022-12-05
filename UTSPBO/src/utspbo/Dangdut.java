package utspbo;

/**
 *
 * @author Lenovo
 */
public class Dangdut {
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }

    void song(String via_Vallen, String kopi_Dangdut) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}