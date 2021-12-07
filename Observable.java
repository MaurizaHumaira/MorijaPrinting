/**
 * Interface observer memiliki method yang mewakili hal-hal yang
 * dapat dilakukan oleh Subject atau Observable
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */
interface Observable {

    /**
     * Menambahkan observer
     * 
     * @param observer objek observer yang ditambahkan
     */
    public void addObserver(Observer observer);

    /**
     * Menghapus observer
     * 
     * @param observer objek observer yang akan dihapus
     */
    public void removeObserver(Observer observer);

    /**
     * Mengirim notifikas
     * 
     * @param message pesan yang akan dikirimkan
     */
    public void notify(String message);
}
