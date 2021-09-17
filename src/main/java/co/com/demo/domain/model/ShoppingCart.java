package co.com.demo.domain.model;

public class ShoppingCart {

    // stateful -> que tiene por lo menos 1 atributo
    // stateless -> que tiene 0 atributos y por lo menos 1 método
    public static ShoppingCart create(){
        return new ShoppingCart();
    }

    public boolean isGreaterThan18(int age) {
        return age >= 18;
    }

    public String validateCardNumber(String card){
        if(card.trim().endsWith("4")){
            return card;
        }
        throw new IllegalArgumentException("La tarjeta es invalida");
    }
}
