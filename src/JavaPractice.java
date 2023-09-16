import java.io.InputStream;
import java.util.Scanner;


public class JavaPractice  {
    OopsConcept oopsConcept;
    public static void main(String[] args) {
        JavaPractice obj = new JavaPractice();
        //obj.click("clicks");
        obj.calculator();
       // obj.test();

    }


    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        double x = sc.nextInt();
        System.out.println("select 1 2 3 4  for + , - , * , /");
        int opt = sc.nextInt();
        System.out.println("operation  "+ opt);
        System.out.println("enter 2nd number");
        double y = sc.nextInt();

        double result =0;
        if(opt==1){
             result = x+y;
        }
        if(opt==2){
            result = x-y;
        }
        if(opt==3){
            result = x*y;
        }
        if(opt==4){
            result = x/y;
        }

        System.out.println("result = " + result);

    }
}
