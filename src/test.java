public class test {
    public static void foo(boolean a, boolean b)
    {if(a)
    {
        System.out.println("A");
    }
    else if (a && b){
        System.out.println("A && B");
    }

    else {
        if (!b){
            System.out.println("not B");
        }
        else {
            System.out.println("Else");
        }
    }


    }

    public static void main(String[] args) {
        foo(false,true
        );
    }

}
