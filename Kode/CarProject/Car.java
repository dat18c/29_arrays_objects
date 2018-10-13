public class Car{

   private String brand;
   private String model;
   //motor
   private Engine motor;
   
   //daek
   private Tire[] daek;
   
   //constructor
   
   public Car()
   {
      this.brand = "";
      this.model = "";
      //motor
      //daek
   }
   
   public Car(String brand, String model)
   {
      this.brand = brand;
      this.model = model;
      //motor
      //daek
   }
   
   //set & get metoder
   public void setBrand(String brand)
   {
      this.brand = brand;
   }
   
   public void setModel(String model)
   {
      this.model = model;
   }
   
   public String getBrand()
   {
      return this.brand;
   }
   
   public String getModel()
   {
      return this.model;
   }
   
   //motor
   //daek
   
   //toString metode
   public String toString()
   {
      String s= "Bil:";
      s += "\tBilmærke: " + this.getBrand();
      s += "\tBilmodel: " + this.getModel();

      //motor
      //daek

      return s;
   }
   
   //equals checker på brand og model
   public boolean equals(Car bil)
   {
      if (this.getBrand().equals(bil.getBrand())
         && this.getModel().equals(bil.getModel()))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}