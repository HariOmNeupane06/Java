
// ------------  Abstract  ------------------
// class Payment     abs method :- makePayement , showmessage      esewa & khalti
abstract class Payment {

    abstract void makePayment(double amount);

    void showMessage() {
        System.out.println("\nclsPayment is being processed ...");
    }

}

class Esewa extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Paid Rs:- " + amount + " using Esewa.");
        System.out.println("--------------------------------------------");
    }
}

class Khalti extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Paid Rs:- " + amount + " using Khalti.");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Esewa epay = new Esewa();
           epay.showMessage();
           epay.makePayment(1000);

        Khalti kpay = new Khalti();
           kpay.showMessage();
           kpay.makePayment(2000);
    }
}
