package java8.methods;


/*
 *
 * baeldung.com/java-static-default-methods
 */
public interface MyInterface {
    int age = 5;

    static void myInterfaceStatic() {
        System.out.println("MyInterface Static");
    }

    default void defaultMethod() {
        System.out.println("MY Interfcace Default Method");
    }

    default void defaultMethodDiamond() {

    }
}
