public class Engine{
   
   private String brand;
   private int cubik;
   private int hk;

   //constructor
   public Engine(String brand, int cubik, int hk){
      this.brand = brand;
      this.cubik = cubik;
      this.hk = hk;
   }
   
   //getters and setters
   public void setEngine(String brand, int cubik, int hk){
      this.brand = brand;
      this.cubik = cubik;
      this.hk = hk;
   }
   
   public void print(){
      System.out.println("Motor");
      System.out.println("\tMærke:" + brand);
      System.out.println("\tCubik: " + cubik);
      System.out.println("\tHk: " + hk);
      
   }

}