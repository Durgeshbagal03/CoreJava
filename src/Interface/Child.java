package Interface;

public class Child implements Grandparent,Parent{



    public static void main(String[] args) {
        Child obj = new Child();
        obj.G();
    }

    @Override
    public void G() {

    }
}
