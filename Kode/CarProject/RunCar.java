public class RunCar{

   public static void main(String[] args){
      //lav motor
      Engine motor = new Engine("Ferrari", 6000, 355);
      //lav dæk
      //Tire mitDaek = new Tire("Pirrelli", 38);
      Tire[] mitDaek = new Tire[5];
      for (int i=0; i<mitDaek.length; i++){
         mitDaek[i] = new Tire("Michelin", 65);
      }
      
      //lav bil
      //Car minBil = new Car("Ferrari", "Testarossa", "Ferrari", 6000, 355);
      Car minBil = new Car("Ferrari", "Testarossa", motor, mitDaek);
      //udskriv bil og motor
      minBil.print();
   
   }
}