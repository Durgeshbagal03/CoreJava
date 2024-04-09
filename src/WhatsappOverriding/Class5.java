package WhatsappOverriding;

public class Class5 extends Class4 {

    void display()
    {
        super.display();
        System.out.println("blue tick");

    }
    void calling()
    {   super.calling();
        System.out.println("Call disconnected");
    }
    void status()
    {
        super.status();
        System.out.println("video uploade must be less thesn 30 sec");
    }

    public static void main(String[] args) {
        Class5 obj = new Class5();
        obj.display();
        obj.calling();
        obj.status();
    }
}
