/**
  * Merupakan Class yang akan menjalankan seluruh program yang telah dibangun sebelumnya 
  *
  * @author Mauriza Humaira
  * @version 1.0
  */
public class Main {
    /**
      * Method yang menjalankan seluruh program
      * @param args mengambil argumen yang diberikan melalui commadnline
      */
    public static void main(String[] args) throws Exception {
    
        // pembuatan objek observable dan observer
        Observable machine = new Machine();
        Observer cust1 = new Customer("Mauriza");
        Observer cust2 = new Customer("Ihza");
        
        // menambahkan data observer
        machine.addObserver(cust1);
        machine.addObserver(cust2);

        System.out.println("\n ============ Morija Printing ============\n");
        
        System.out.println("\t[[[" + cust1.getName() + "'s Order]]]");
        // membuat objek dekorasi mug bertipe papa mama
        Mug papaMamaMug = new DecoratorPapaMama(new WhiteMug(), cust1);
        papaMamaMug.make();
        
        // menampilkan animasi load
        animation();

        System.out.println("\n");

        System.out.println("\t[[[" + cust2.getName() + "'s Order]]]");
        // membuat dekorasi bertipe ayam jago
        Mug ayamJagoMug = new DecoratorAyamJago(new WhiteMug(), cust2);
        ayamJagoMug.make();
        
        // menampilkan animasi load
        animation();
        // menghapus layar
        clearScreen();
        
        // menampilkan notifikasi
        System.out.println("\n\n\n~~~~ Notification from : Snappy Printing ~~~~\n");
        machine.notify(" Your Mug Has Been Printed <3");

    }
    
    /**
      * method untuk menjalankan animasi loading 
      */
    public static void animation() throws Exception {
        String anim = "|/-\\";
        for (int x = 0; x <= 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
            System.out.write(data.getBytes());
            Thread.sleep(10);
        }
    }
    
    /**
      * method yang digunakan untuk mengapus layar
      */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
