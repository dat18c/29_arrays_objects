import java.util.Arrays;

public class Car
{

   private String brand;
   private String model;
   //motor
   private Engine motor;
   
   //daek
   private Tire[] daek;
   private final int ANTAL_DAEK = 5;
   
   //constructor
   
   public Car()
   {
      this.brand = "";
      this.model = "";
      //motor
      this.motor = new Engine();
      //daek
      // opret et array af Tire
      this.daek = new Tire[ANTAL_DAEK];
      
      for (int i=0; i<ANTAL_DAEK; i++)
      {
         //put et nyt dæk i element i
         this.daek[i] = new Tire();
      }
   }
   
   public Car(String brand, String model, Engine motor, Tire[] daek)
   {
      this.brand = brand;
      this.model = model;
      //motor
      this.motor = motor;
      
      //daek
      this.daek = daek;
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
   public void setMotor(Engine motor)
   {
      this.motor = motor;
   }
   
   public Engine getMotor()
   {
      return this.motor;
   }
   
   //daek
   public void setDaek(Tire[] daek)
   {
      this.daek = daek;
   }
   
   public Tire[] getDaek()
   {
      return this.daek;
   }
   
   //toString metode
   public String toString()
   {
      String s= "Bil:";
      s += "\tBilmærke: " + this.getBrand();
      s += "\tBilmodel: " + this.getModel();

      //motor
      s += this.getMotor().toString();
      
      //daek
      for (int i=0; i<ANTAL_DAEK; i++)
      {
         s += this.daek[i].toString();
      }

      return s;
   }
   
   //equals checker på brand og model
   public boolean equals(Car bil)
   {
      if (this.getBrand().equals(bil.getBrand())
         && this.getModel().equals(bil.getModel())
         && this.getMotor().equals(bil.getMotor())
         && Arrays.equals(this.getDaek(), bil.getDaek())
         )
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}