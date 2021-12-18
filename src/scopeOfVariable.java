// Scope of Variables in Java

// Scope of a variable is the part of the program where the variable is accessible. Like C/C++,
// in Java, all identifiers are lexically (or statically) scoped,
// i.e.scope of a variable can determined at compile time and independent of function call stack.
// Java programs are organized in the form of classes.
// Every class is part of some package. Java scope rules can be covered under following categories.

// Member Variables (Class Level Scope)

// these variables must be declared inside class(outside any function)
// they can be directly accessed anywhere in class

public class scopeOfVariable {
    // All variables defined directly inside a class are member variables
    int a;
    private String b;
    //void method1() {};
    //void method2() {};
    char c;

    // we can declare class variables anywhere in class, but outside methods
    // access specified member variables does Not affect scope of them within a class
    // member variables can be accessed outside a class with following rules

    // accessible form of public, private, protected, default variables
    // modifiers    package     sub-class   world      class
    //  public        yes           yes      yes        yes
    //  protected     yes           yes       no        yes
    //  default       yes            no       no        yes
    //  (no modifier)
    //   private       no            no       no        yes


// Local Variables (Method Level Scope)

// these variables are declared inside a method, cannot be accessed outside the method

    void method1() {
        // Local Variables
        int x;
    }

    // note, local variables does NOT exist after the method's execution is over.
}

// another Example of a local variable

class Test{
    private int x;
    public void setX(int x){
        this.x = x;
        // here the variable is passed in as a parameter to the method
        // this --> a keyword to differentiate between the local and class variables

    }
}





