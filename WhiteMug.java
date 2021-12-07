/**
 * Class WhiteMug menggambarkan jenis mug yang belum memiliki
 * dekorasi apapun
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */
public class WhiteMug implements Mug {

    /**
     * Overrided method untuk menampilkan informasi
     * terkait jenis mug yang dibuat
     */
    @Override
    public void make() {
        System.out.println("This is Plain Mug (Without Any Design)");
    }

}
