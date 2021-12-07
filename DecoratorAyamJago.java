/**
 * Class DecoratorAyamJago merupakan salah satu jenis dekorasi pada Mug
 * 
 * @author Mauriza Humaira
 * @version 1.0
 */

public class DecoratorAyamJago extends MugDecorator {
    Observer customer;

    /**
     * Method constructor yang akan membuat objek dari mug dan
     * observer
     * 
     * @param mug  untuk membuat objek mug
     * @param cust untuk membuat objek observer
     */
    public DecoratorAyamJago(Mug mug, Observer cust) {
        super(mug);
        this.customer = cust;
    }

    /**
     * Method untuk membuat design Ayam Jago pada Mug
     * hanya akan menampilkan pesan bahwa design sedang di tambahkan
     * pada mug
     */
    @Override
    public void make() {
        super.make();
        System.out.print("=======\n\tAdding Ayam Jago Design On " + customer.getName() + "'s Mug");
    }
}
