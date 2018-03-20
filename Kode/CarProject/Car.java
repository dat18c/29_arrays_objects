public class Car{

   private String brand;
   private String model;
   private Engine motor;
   private Tire[] daek;
   
   //constructor
   //public Car(String brand, String model, String engineBrand, int engineCubik, int engineHk){
   public Car(String brand, String model, Engine motor, Tire[] daek){
      this.brand = brand;
      this.model = model;
      //motor = new Engine(engineBrand, engineCubik, engineHk);
      this.motor = motor;
      this.daek = daek;
   }
   
   //set method
   public void setEngine(Engine nyMotor){
      this.motor = nyMotor;
   }
   
   public void setTires(Tire[] daek){
      this.daek = daek;
   }
   
   //print metode
   public void print(){
      System.out.println("Bil:");
      System.out.println("\tBilmærk: " + brand);
      System.out.println("\tBilmodel: " + model);
      motor.print();
      
      //daek.print();
      //length
      for (int i=0; i<daek.length; i++){
         daek[i].print();
      }
      
   }
}