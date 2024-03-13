package com.mycompany.app.Week3;
interface MyInterface {
    class NestedClass {
        static void staticMethod(MyInterface myInterface) {
            // Call methods of the interface
            System.out.println("Calling methods of the interface from static method in nested class:");
            myInterface.interfaceMethod1();
            myInterface.interfaceMethod2();
        }
    }

    // Interface methods
    void interfaceMethod1();
    void interfaceMethod2();
}

// Implementation of the interface
class MyInterfaceImpl implements MyInterface {
    @Override
    public void interfaceMethod1() {
        System.out.println("Implementation of interfaceMethod1");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("Implementation of interfaceMethod2");
    }
}
public class InterfacesExercise21 {
    public static void main(String[] args) {
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        
        // Call static method of the nested class passing an instance of the implementation
        MyInterface.NestedClass.staticMethod(myInterfaceImpl);
    }
}
