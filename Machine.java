
/**
 * Class Machine merupakan observable atau subject pada kasus yang digunakan. 
 * Class ini dapat menambahkan dan menghapus observer, serta mengirim 
 * notifikasi bagi setiap observer yang telah di tambahkan sebelumnya 
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */
import java.util.ArrayList;

public class Machine implements Observable {
    // menyimpan observer
    private ArrayList<Observer> customers = new ArrayList<>();

    /**
     * Method untuk menambahkan observer dan disimpan kedalam
     * arraylist customer
     * 
     * @param observer objek observer yang ditambahkan
     */
    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    /**
     * Method untuk menghapus observer
     * 
     * @param observer objek observer yang akan dihapus
     */
    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    /**
     * Method untuk mengirimkan pesan kepada setiap observer
     * 
     * @param message pesan yang akan dikirimkan
     */
    @Override
    public void notify(String message) {
        for (Observer customer : customers) {
            customer.notification(message);
        }
    }
}
