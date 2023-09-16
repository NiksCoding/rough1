package Java_package;

public class javaInheritance  {

    private int n1;
    private String s2;
     String m2(){
        String s1 ="This is java inheritance";
        return s1;
    }
    int m3(){
        System.out.println("This is m3");
        return 7;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }
    private void setS21(String s2) {
        this.s2 = s2;
    }

    private String gets2() {
        return s2;
    }

    public static void main(String[] args) {
        System.out.println("This is java inheritance class");
        javaInheritance obj1 = new javaInheritance();
        //obj1.getN1();
        //obj1.setN1(5);
        System.out.println(obj1.getN1());

    }
}
