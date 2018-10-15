public class Tire
{
   private String brand;
   private int size;

   //constructors
   public Tire()
   {
      this.brand = "";
      this.size = 0;
   }
   
   public Tire(String brand, int size)
   {
      this.brand = brand;
      this.size = size;
   }
   
   //getters & setters
   public void setBrand(String brand)
   {
      this.brand = brand;
   }
   
   public void setSize(int size)
   {
      this.size = size;
   }
   
   public String getBrand()
   {
      return this.brand;
   }
   
   public int getSize()
   {
      return this.size;
   }
   
   public String toString()
   {
      String s="Dæk:";
      s+="\tDæknavn: " + getBrand();
      s+="\tStørrelse: " + getSize() + "\"";
      return s;
   }
   
   public boolean equals(Tire t)
   {
      if (this.getBrand().equals(t.getBrand())
         && this.getSize() == t.getSize())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}