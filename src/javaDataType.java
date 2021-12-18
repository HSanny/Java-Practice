public class javaDataType {
    public static void main(String[] args) {
        boolean b = true;
        if (b){
            System.out.println("Hi, Geek!");
        }


        // byte data type : 8-bit signed two's complement integer
        // byte data type is useful for saving memory in large array
        byte byteVar;
        // size : 1 byte = 8 bits,
        // values : -128 ~ 127
        // default value : 0


        byte a = 126;
        // byte is a 8-bit value
        System.out.println(a);

        a++;
        System.out.println(a);

        // it overflows here because a byte can hold values
        // from -128 to 127
        a++;
        System.out.println(a);

        // looping back within the range
        a++;
        System.out.println(a);


        // short data type is a 16-bit signed two's complement interger
        // similar to byte, use a short to save memory in large arrays, in
        // situation where the memory savings actually matters

        // syntax : short shortVar;
        // size : 2 byte (16 bits)
        // values : -(32, 768) ~ (32, 767) (inclusive)
        // default value : 0

        // int --> 32-bit signed two's complement integer
        // size : 4 byte (32 bits)
        // values : -(2, 147, 483, 648) ~ (2, 147, 483, 647) (inclusive)

        // long --> 64-bit signed two's complement integer
        // size : 8 byte (64 bits)
        // values : -(9, 223, 372, 036, 854, 775, 808)
        // values : ~ (9, 223, 372, 036, 854, 775, 808)


    }

}


// majorly, there are 2 types of languages
// statically typed language : where each variable & expression type
    // is already known at compile time
    // e.g. C, C++, Java

// dynamically typed language : receive different data types over time
    // e.g. Ruby, Python



// Data Type

// - Class : a class is a user-defined blueprint / prototype from which objects
    // are created. It represents the set of properties / methods that are
    // common to all objects of one type.
    // In general, class declarations can include these components
    // (in order)
        // - Modifier : a class can be public / has default access
        // - Class Name : the name should begin with an initial letter
        //      (capitalized by convention)
        // - Superclass (if any) : the name of the class's parent
        //      , if any, preceded by the keyword extends
        //      , a class can only extend (subclass) 1 parent
        // - interface (if any) : a comma-separated list of interfaces
        //      implemented by the class, if any, preceded by the
        //      keyword implements. A class can implement >=1 interface
        //  - Body : the class body surrounded by braces, {};

// - Objects : a basic unit of object-oriented programming
    // an object consists of :
        // - state : it is represented by attributed of an object
        //      , it also reflects th properties of an object
        // - behavior : it is represented byu methods of an object
        //      , it also reflects the response of an object with other objects
        // - identity : it gives a unique name to an object
        //      , and enables one object to interact with other objects

// - Interface : like a class, an interface can have methods and variables
    // but the methods declared in an interface are by default abstract
    // (only method signature, nobody)

    // - interfaces specify what a class must do and not how
    //      ,  it is the blueprint of the class

    // - an interface is about capabilities
    //   e.g. a Player may be an interface
    //          , and any class implement Player must be able to
    //              or must implement move() --> the method
    //      so it specifies a set of methods that the class has to implement

    // - if a class implements an interface and does not provide method bodies
    //      for all functions specified in the interface
    //      , then the class must be declared abstract

    // - a Java library example is, Comparator Interface
    //  , if a class implement this interface
    //  , then it can be used to sort a collection

// - Array : an array is a group of like-typed variables
    // - In java, all arrays are dynamically allocated

    // - since arrays are objects in Java, we can find their length
    //  using member length. A java array variable can also be declared
    //  like other variables with [] after the data type. The variables
    //  in the array are ordered and each has an index beginning from 0.
    //  Java array can also be used as a static field
    // , a local variable or a method parameter.
    //   The size of an array must be specified by an int value
    // , Not long or short.

    //   The direct superclass of an array type is Object.
    //   Every array type implements the interfaces Cloneable & java.io.Serializable




class Test1
{
    public static void main(String[] args)
    {
        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("d" + d);
        System.out.println(a + b + c + d );

        //Arithmetic conversions are implicitly performed to
        // cast the values to a common type.
        // The compiler first performs integer promotion.
        // If the operands still have different types
        // , then they are converted to the type that
        // appears highest in the hierarchy.
    }
}








