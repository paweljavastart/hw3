
public class Customer {

    private final String cardNr;

    public Customer(String cardNr) {
        this.cardNr = cardNr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cardNr='" + cardNr + '\'' +
                '}';
    }
}
