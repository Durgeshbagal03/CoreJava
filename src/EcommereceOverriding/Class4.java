package EcommereceOverriding;

public class Class4 extends Class3 {
    void cart()
    {
        super.cart();

    }
    void order()
    {   super.order();

    }
    void status()
    {
        super.status();
        System.out.println("order delivered");
    }

    public static void main(String[] args) {
        Class4 obj = new Class4();
        obj.cart();
        obj.order();
        obj.status();
    }




















}
