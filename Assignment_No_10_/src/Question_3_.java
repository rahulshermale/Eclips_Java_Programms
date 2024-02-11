//
//create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
//now define "Demo" class with main function. Inside main function create array of Object class 
//which will store instances of above mentioned classes. 
//Traverse through this array and call "Cfun()" of class C only.

class A {
    public void Afun() {
        System.out.println("Afun");
    }
}

class B {
    public void Bfun() {
        System.out.println("Bfun");
    }
}

class C {
    public void Cfun() {
        System.out.println("Cfun");
    }
}

class D {
    public void Dfun() {
        System.out.println("Dfun");
    }
}

public class Question_3_ {//Demo functoin
    public static void main(String[] args) {
        Object[] objs = new Object[4];
        objs[0] = new A();
        objs[1] = new B();
        objs[2] = new C();
        objs[3] = new D();

        for (Object obj : objs) {
            if (obj instanceof C) {
                C c = (C) obj;
                c.Cfun();
            }
        }
    }
}
