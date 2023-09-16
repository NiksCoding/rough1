package Java_package;

public class javaConstructor extends javaInheritance{
    int num;
    String name;

    javaConstructor(int nu,String name){
        num =nu;
        this.name = name;
    }
    void m1(){
        System.out.println(num + name);
    }

    public static void main(String[] args) {
        javaConstructor obj =new javaConstructor(5,"nik");
        obj.m1();
        javaInheritance obj2 = new javaInheritance();
        System.out.println(obj.m2());
        System.out.println(obj.m3());
        obj.setN1(7);
        System.out.println(obj.getN1());
    }
}
