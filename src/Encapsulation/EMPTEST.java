package Encapsulation;

public class EMPTEST {
    public static void main(String[] args) {
        getset obj = new getset();
        obj.setId(2546);
        obj.setName("Abhii");
        obj.setSalary(50000545);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
//        obj.setAge(20);
//        System.out.println(obj.getAge());
    }
}
