package model;

public class Faculty {
   private String name;

   public Faculty(String name) {
      this.name = name;
   }

   public void showFaculty(){
      System.out.println("This faculty is " + this.name);
   }
}
