package EcommereceOverriding;

public class Class3 extends Class2 {
    void cart()
    {
        super.cart();

    }
    void order()
    {   super.order();
        System.out.println("order placed succesfully");
    }
    void status()
    {
        System.out.println("check the status");
    }


}
