//write a program to display the method names inside the class which is passed as a command line argument.

import java.lang.reflect.Method;

public class Question_6_ {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: MethodLister <class name>");
            return;
        }

        Class<?> clazz = Class.forName(args[0]);
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Methods in " + clazz.getName() + ":");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
