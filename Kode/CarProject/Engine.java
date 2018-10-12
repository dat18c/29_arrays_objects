public class Engine{
   
   private String brand;
   private int cubik;
   private int hk;

   //constructors
   public Engine()
   {
      this.brand = "";
      this.cubik = 0;
      this.hk = 0;
   }

   public Engine(String brand, int cubik, int hk){
      this.brand = brand;
      this.cubik = cubik;
      this.hk = hk;
   }
   
   //getters and setters
   public void setBrand(String brand){
      this.brand = brand;
   }

   public void setCubik(int cubik){
      this.cubik = cubik;
   }

   public void setHk(int hk){
      this.hk = hk;
   }
   
   public String getBrand()
   {
      return this.brand;
   }
   
   public int getCubik()
   {
      return this.cubik;
   }
   
   public int getHk()
   {
      return this.hk;
   }
   
   public String toString(){
      String s = "Motor";
      s += "\tMærke:" + brand;
      s += "\tCubik: " + cubik;
      s += "\tHk: " + hk;
      return s;
   }

   public boolean equals(Engine eng)
   {
      if (this.getBrand().equals(eng.getBrand())
         && this.getCubik() == eng.getCubik()
         && this.getHk() == eng.getHk())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}