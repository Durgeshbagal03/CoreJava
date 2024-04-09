package PrimitiveNonPrimitive;

public class AutoUnboxing {
    public static void main(String[] args) {

        Integer a=new Integer(20);
        int b=a;

        Float q= new Float(99);
        float e=q;

        System.out.println(a+" "+b);
        System.out.println(q+" "+e);
    }
}
