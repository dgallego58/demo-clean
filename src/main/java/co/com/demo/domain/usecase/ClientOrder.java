package co.com.demo.domain.usecase;

public class ClientOrder {

    private int age;
    private String cardNumber;
    private String productName;

    public int getAge() {
        return age;
    }

    public ClientOrder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public ClientOrder setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public ClientOrder setProductName(String productName) {
        this.productName = productName;
        return this;
    }
}
