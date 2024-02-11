/*Define a class “MyClass”. Define a class “Everything” and define a member 
 * function with variable no. of argument inside it. Define  a class Demo1 
 *  and define main function in it. From main function , call the function of 
 *  class Everything and make sure you can pass any arguments , it will take and display. 
 *  It should even take instance of “MyClass” and display.
 */



class MyClass {
	private int val;
//
    public MyClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

class Everything {
    public void myFunction(Object... args) {
        for (Object arg : args) {
            System.out.println(arg.toString());
        }
    }
}

class Demo1 {
    public static void main(String[] args) {
        Everything obj = new Everything();
        obj.myFunction("Hello", "world", 123, new MyClass(456));
    }
}

