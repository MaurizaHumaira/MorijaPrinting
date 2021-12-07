/**
 * Class Customer merupakan class yang mengimplementasikan interface Observer.
 * Class ini akan menginisialisasikan nama customer dan notifikasi yang
 * didapatkan
 * oleh customer ketika mug yang dipesan selesai di cetak
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */

public class Customer implements Observer {
    // atribut nama customer
    private String name;

    /**
     * Method constructor untuk objek Customer yang akan menginisialisasikan nama
     * customer
     * 
     * @param name nama dari customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Method yang digunakan untuk menampilkan nama dari customer
     * 
     * @return nama dari customer
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Method yang menampilkan pesan kepada customer
     * 
     * @param message pesan yang akan ditampilkan
     */
    @Override
    public void notification(String message) {
        System.out.println("Hai, " + this.name + "." + message);
        System.out.println();
    }
}
