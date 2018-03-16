public class Tire{
   private String brand;
   private int tommer;

   //constructor
   public Tire(String brand, int tommer){
      this.brand = brand;
      this.tommer = tommer;
   }
   
   public void print(){
      System.out.println("Dæk:");
      System.out.println("\tDæknavn: " + brand);
      System.out.println("\tStørrelse: " + tommer + "\"");
   }
}