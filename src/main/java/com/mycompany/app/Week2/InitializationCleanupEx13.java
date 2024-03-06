package com.mycompany.app.Week2;

public class InitializationCleanupEx13 {
    static class Cup {
        Cup(int marker) {
            print("Cup(" + marker + ")");
        }

        void f(int marker) {
            print("f(" + marker + ")");
        }
    }

    static class Cups {
        static Cup cup1;
        static Cup cup2;

        static {
            cup1 = new Cup(1);
            cup2 = new Cup(2);
        }

        Cups() {
            print("Cups()");
        }
    }

    public static class ExplicitStatic {
        public static void main(String[] args) {
            print("Inside main()");
            Cups.cup1.f(99); // (1)
        }

        // static Cups cups1 = new Cups(); // (2)
        // static Cups cups2 = new Cups(); // (2)
    }

    static void print(String s) {
        System.out.println(s);
    }
}
