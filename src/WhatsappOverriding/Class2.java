package WhatsappOverriding;

public class Class2 extends Class1 {
    void display()
    {
        super.display();
        System.out.println("Double tick");

    }
    void calling()
    {
        System.out.println("voice call");
    }
}
