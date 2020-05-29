package java8.methods;

public class MyClass implements MyInterface, YourInterface {


    public static void main(String[] args) {
        MyInterface m = new MyClass();
        m.defaultMethod();
        MyInterface.myInterfaceStatic();
        System.out.println(age); //age is final
    }

    @Override
    public void defaultMethodDiamond() {
        YourInterface.super.defaultMethodDiamond();

    }
}
