public class RunCar{

   public static void main(String[] args){
      final int ANTAL_DAEK = 5;
      //lav motor - match klassediagram
      Engine motor = new Engine("Fiat", 600, 55);
      
      //lav daek - match klassediagram
      Tire[] mineDaek = new Tire[ANTAL_DAEK];
      for (int i=0; i<ANTAL_DAEK; i++)
      {
         mineDaek[i] = new Tire("Pirelli", 45);
      }
      
      //lav biler med constructor
      Car minBil = new Car("Fiat", "Punto", motor, mineDaek);
      
      Car minAndenBil = new Car();
      
      minAndenBil.setBrand("Audi");
      minAndenBil.setModel("A6");
      minAndenBil.setMotor(new Engine("VW", 1600, 155));
      Tire[] mineAndreDaek = new Tire[ANTAL_DAEK];
      for (int i=0; i<ANTAL_DAEK; i++)
      {
         mineAndreDaek[i] = new Tire("Alpine", 60);
      }
      minAndenBil.setDaek(mineAndreDaek);
      
      //udskriv bil og motor
      System.out.println(minBil);
      System.out.println(minAndenBil);
      
      //sammenlign biler

      //skift motor
      //skift daek  
   }
}