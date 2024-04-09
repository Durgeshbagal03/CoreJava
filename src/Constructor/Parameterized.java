package Constructor;

import java.sql.SQLOutput;

public class Parameterized {
    float c;
    Parameterized(float a, float b)
    {
        c = a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Parameterized p = new Parameterized(5,5.2f);

    }
}
