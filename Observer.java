/**
 * Interface observer memiliki method yang mewakili hal-hal yang
 * dapat dilakukan oleh seorang Observer
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */
interface Observer {
    /**
     * Observer akan menerima notifikasi
     * 
     * @param message notifikasi yang akan didapatkan
     */
    public void notification(String message);

    /**
     * Nama Observer akan ditampilkan saat menerima
     * notifikasi
     * 
     * @return nama observer
     */
    public String getName();
}
