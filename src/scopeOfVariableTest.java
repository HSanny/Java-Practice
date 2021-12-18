public class scopeOfVariableTest {
    static int x = 11;
    private int y = 33;

    public void method1(int x){
        scopeOfVariableTest t = new scopeOfVariableTest();
        this.x = 22;
        y = 44;

        System.out.println("Test.x : " + scopeOfVariableTest.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        scopeOfVariableTest t = new scopeOfVariableTest();
        t.method1(5);

        // loop variable (block scope)
        int x = 10;
        System.out.println(x);

        // for loop
        for(int y = 0; y < 4; y++){
            System.out.println(y);
        }
        // below will produce error, unless specify a y before the for loop
        // such as int y;
        // then for(int y ....)
        //System.out.println(y);


        for (int z = 1; z <= 10; z++){
            System.out.println(z);
        }
        int z = 20;
        System.out.println(z);
    }
}

// expected out put
// 22
// 22
// 33
// 44