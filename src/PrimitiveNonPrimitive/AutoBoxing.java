package PrimitiveNonPrimitive;

public class AutoBoxing {
    //convert primitive datatype in non primitive datatype
    public static void main(String[] args) {
        int a=10;
        Integer b=new Integer(a);
        System.out.println(a+" "+b);

        double x= 10;
        Double y=new Double(x);
        System.out.println(x+" "+y);

        boolean q=true;
        Boolean w=new Boolean(q);

        char e='c';
        Character r= new Character(e);

        float u=50.2f;
        Float o=new Float(u);

        System.out.println(e+" "+r);
        System.out.println(u+" "+o);
        System.out.println(q+" "+w);

    }
}