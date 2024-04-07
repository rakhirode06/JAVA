
class Parent {
    void displayParent() {
        System.out.println("Inside Parent class");
    }
}

interface InterfaceA {
    void methodA();
}


interface InterfaceB {
    void methodB();
}

class Child extends Parent implements InterfaceA, InterfaceB {
    
    public void methodA() {
        System.out.println("Inside methodA");
    }

    
    public void methodB() {
        System.out.println("Inside methodB");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.displayParent(); 

        child.methodA(); 
        child.methodB(); 
    }
}

