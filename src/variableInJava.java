// variable in Java is a data container that saves the data values during java program execution.



public class variableInJava {
    float simpleInterest;
    // declaring float variable
    int time = 10, speed = 20;
    // declaring and initializing integer variable
    char var = 'h';
    // declaring and initializing character variable

    // types of variables in Java
    // 1. local variables
    // a variable defined within a block or method or constructor
        // these variables are created when the block is entered, or the function is called
        // and these variables are destroyed
        // after exiting from the block / when the call returns from the function

        // the scope of these variables exists only within the block in which the variable is declared
        // i.e. we can access these variables only within that block

        // initialization of the local variables is mandatory before using it in the defined scope
    // 2. instance variables
    // non-static variables
    // are declared in a class outside any method, constructor, block
        // are declared in a class, these variables are created when an object of the class is created
        // and destroyed when the object is destroyed

        // unlike local variable, we may use access specifiers, for instance, variables.
        // if we do not use any access specifier, then the default access specifier will be used

        // initialization of instance variable is not mandatory, its default value is 0

        // instance variable can be accessed only by creating objects
    // 3. static variables
    // also known as class variables
        // these variables are declared similarly as instance variables.
        // the difference is that static variables are declared using the static keyword within a class
        // outside any method, constructor, block

        // unlike instance variable, we can only have 1 copy of a static variable per class,
        // irrespective of how many objects we create

        // static variables are created at the start of program execution and
        // destroyed automatically when execution ends

        // initialization of static variable is not mandatory, default value is 0
        // if we access the static variable like instance variable(through an object), the compiler will
        // show warning message, which won't halt the program. The compiler will replace the object name
        // with the class name automatically
        // if we access the static variable without class name,
        // the compiler will automatically append the class name

    // 4.Differences between the Instance variable Vs. the Static variables
    //
    //
    //Each object will have its copy of the instance variable, whereas
    //We can only have one copy of a static variable per class irrespective of how many objects we create.

    //Changes made in an instance variable using one object will not be reflected in other objects
    // as each object has its own copy of the instance variable.
    // In the case of static, changes will be reflected in other objects
    // as static variables are common to all objects of a class.

    //We can access instance variables through object references,
    // and Static Variables can be accessed directly using the class name.
}

class GFG{
    // static variable
    static int a;

    // instance variable
    int b;
}





























