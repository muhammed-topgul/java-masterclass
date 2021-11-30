package com.muhammedtopgul.javamasterclass.oop.advanced.innerClasses;

/**
 * @author muhammed-topgul created at 30/11/2021 10:13
 */

public class OuterClass {

    private String oPrivate;
    public String oPublic;
    private static String oStatic;

    class InnerClass {
        private String iPrivate;
        public String iPublic;

        public InnerClass(String iPrivate, String iPublic) {
            this.iPrivate = iPrivate;
            this.iPublic = iPublic;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "oPrivate from parent=" + oPrivate +
                    " iPrivate='" + iPrivate + '\'' +
                    ", iPublic='" + iPublic + '\'' +
                    '}';
        }
    }

    static class NestedClass {
        private String nPrivate;
        public String nPublic;

        public NestedClass(String nPrivate, String nPublic) {
            this.nPrivate = nPrivate;
            this.nPublic = nPublic;
        }

        @Override
        public String toString() {
            return "NestedClass{" +
                    "oStatic='" + oStatic + '\'' +
                    " nPrivate='" + nPrivate + '\'' +
                    ", nPublic='" + nPublic + '\'' +
                    '}';
        }
    }

    public void localClass(String name) {
        // name = "Java"; will not compile
        class LocalClass {
            public void doInLocalClass() {
                System.out.println("Name: " + name);
                System.out.println("In Local Class --> oPublic: " + oPublic + " --> oPrivate: " + oPrivate + " --> oStatic: " + oStatic);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.doInLocalClass();
    }

    public static void staticLocalClass() {
        class LocalClass {
            public void doInLocalClass() {
                System.out.println("In Static Local Class --> oStatic: " + oStatic);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.doInLocalClass();
    }

    public void anonymousInnerClass() {
        new MyInterface() {

            {
                System.out.println("Anonymous Inner Class initializer without constructor");
            }

            @Override
            public void print() {
                System.out.println("Print in Anonymous Inner Class");
            }
        }.print();
    }

    public OuterClass(String oPrivate, String oPublic, String oStatic) {
        this.oPrivate = oPrivate;
        this.oPublic = oPublic;
        OuterClass.oStatic = oStatic;
    }

    public InnerClass createInnerClass(String iPrivate, String iPublic) {
        return new InnerClass(iPrivate, iPublic);
    }

    public NestedClass createNestedClass(String nPrivate, String nPublic) {
        return new NestedClass(nPrivate, nPublic);
    }

    public static void createInStaticMethod() {
        OuterClass outerClass = new OuterClass("A", "B", "C");
        System.out.println(outerClass);

        // InnerClass innerClass = new InnerClass("D", "E"); will not compile
        InnerClass innerClass = outerClass.new InnerClass("D", "E");
        System.out.println(innerClass);

        NestedClass nestedClass = new NestedClass("F", "G");
        System.out.println(nestedClass);
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "oStatic='" + OuterClass.oStatic + '\'' +
                " oPrivate='" + oPrivate + '\'' +
                ", oPublic='" + oPublic + '\'' +
                '}';
    }
}
