package Java_package;

public class javaImplement implements javaInterface{
    @Override
    public int m5(int i) {
        // i=10;
        System.out.println(i + "  " + "Implementing interface");
        return i;
    }

    public static void main(String[] args) {
        javaImplement obj = new javaImplement();
        System.out.println(obj.m5(6));
    }
}
