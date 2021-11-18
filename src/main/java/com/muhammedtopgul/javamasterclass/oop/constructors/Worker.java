package com.muhammedtopgul.javamasterclass.oop.constructors;

/**
 * @author muhammed-topgul created at 18/11/2021 09:25
 */

public class Worker extends Employee {

   public static String CLASS_NAME = "Worker.java";
   public static String developer;

   static {
      System.out.println("In Worker static {}");
   }

   {
      System.out.println("In Worker {}");
   }

   private String profession;

   public Worker(int id, String name, String department, String profession) {
      super(id, name, department);
      this.profession = profession;
      System.out.println("In Worker");
   }

   public String getProfession() {
      return profession;
   }

   public void setProfession(String profession) {
      this.profession = profession;
   }
}
