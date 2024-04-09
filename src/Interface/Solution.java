package Interface;

public class Solution implements Employee,EXemp{

    @Override
    public void year() {
        System.out.println("2024");
    }

    @Override
    public void id() {
        System.out.println("123456");

    }

    @Override
    public void name() {
        System.out.println("abhiiii");

    }

    @Override
    public void salary() {
        System.out.println("500000");

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.id();
        obj.name();
        obj.salary();
        obj.year();
    }
}
