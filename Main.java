public class Main {
    public static void main(String[] args) throws Exception {

        Observable machine = new Machine();
        Observer cust1 = new Customer("Mauriza");
        Observer cust2 = new Customer("Ihza");

        machine.addObserver(cust1);
        machine.addObserver(cust2);

        System.out.println("\n ============ Morija Printing ============\n");

        System.out.println("\t[[[" + cust1.getName() + "'s Order]]]");
        Mug papaMamaMug = new DecoratorPapaMama(new WhiteMug(), cust1);
        papaMamaMug.make();

        animation();

        System.out.println("\n");

        System.out.println("\t[[[" + cust2.getName() + "'s Order]]]");
        Mug ayamJagoMug = new DecoratorAyamJago(new WhiteMug(), cust2);
        ayamJagoMug.make();

        animation();
        clearScreen();

        System.out.println("\n\n\n~~~~ Notification from : Snappy Printing ~~~~\n");
        machine.notify(" Your Mug Has Been Printed <3");

    }

    public static void animation() throws Exception {
        String anim = "|/-\\";
        for (int x = 0; x <= 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
            System.out.write(data.getBytes());
            Thread.sleep(10);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
