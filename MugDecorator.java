/**
 * MugDecorator dapat melakukan penambahan dekorasi pada Mug
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */
public class MugDecorator implements Mug {
    // Objek mug
    protected Mug mug;

    /**
     * Method constructor untuk membuat sebuah objek mug
     * 
     * @param mug pembuatan objek mug
     */
    public MugDecorator(Mug mug) {
        this.mug = mug;
    }

    /**
     * Method untuk membangun/membuat sebuah mug
     */
    @Override
    public void make() {
        this.mug.make();
    }
}
