package edu.rpg.personal;
public class GenderClass {
   public static GenderClass MALE = new Gender2("男");
   public static GenderClass FEMALE = new Gender2("女");
   private String name;
   /**人口*/
   private int count;
   private GenderClass(String name) {
         this.name = name;
   }
   public String getName() {
      return this.name;
   }
   public int getCount() {
     return count;
   }
   public void setCount(int count) {
    this.count = count;
   }
}