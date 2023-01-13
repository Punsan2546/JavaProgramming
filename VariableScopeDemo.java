import java.rmi.ConnectIOException;

public class VariableScopeDemo {
    public int i; //object variable



    public void method1(){
        int j = 4; //local variable
        int k = 2; //another local variable
    }

    public void method2(){
        int j = 0; //local variable
        System.out.println(i);
        //calling an object variable
        //System.out.printlt
    }
        
}
