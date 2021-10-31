package com.muhammedtopgul.javamasterclass.types_and_variables;

/**
 * @author muhammed-topgul created at 27/10/2021 21:22
 * we can define Local Varable name as same as Instance Variable name in Java
 * if the defined variable call in method, then Java call the 'Local Variable'. This is Shadowing
 */

public class Scope {

    private String name = "Muhammed in Instance Variable";

    public static void main(String[] args) {
      Scope scope = new Scope();
      scope.shadowing();
    }

    public void shadowing() {
        String name = "Muhammed in Local Variable";
        System.out.println(name); // Muhammed in Local Variable
        System.out.println(this.name); // Muhammed in Instance Variable
    }
}
