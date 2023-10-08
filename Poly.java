// class Helper {
//     static int Multiply(int a, int b) {
//         return a * b;
//     }

//     static int Multiply(int a, int b, int c) {
//         return a * b * c;
//     }
// }

// class Poly {
//     public static void main(String[] args) {
//         System.out.println(Helper.Multiply(2, 4));
//         System.out.println(Helper.Multiply(2, 7, 3));
//     }
// }

class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {
    void Print() {
        System.out.println("subclass2");
    }
}

class Poly {
    public static void main(String[] args) {
        Parent a;
        a = new Parent();
        a.Print();
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}
