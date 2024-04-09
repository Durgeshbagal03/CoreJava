package EcommereceOverriding;

public class Class2 extends CLass1 {
    void cart()
    {
        super.cart();
        System.out.println("Select the product from cart");
    }
    void order()
    {
        System.out.println("complete the order process");
    }

}
