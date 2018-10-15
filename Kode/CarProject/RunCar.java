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
      
      Engine minTredieMotor = new Engine("Ford", 1200, 95);
      Tire[] mineEkstraDaek = new Tire[ANTAL_DAEK];
      for (int i=0; i<ANTAL_DAEK-1; i++)
      {
         mineEkstraDaek[i] = new Tire("Michelin", 55);
      }
      mineEkstraDaek[ANTAL_DAEK-1] = new Tire("NoName", 55);
      
      Car minTredieBil = new Car("Ford", "Fiesta", minTredieMotor, mineEkstraDaek);
      
      //udskriv bil og motor
      System.out.println(minBil);
      System.out.println(minAndenBil);
      System.out.println(minTredieBil);
      
      //sammenlign biler

      //skift motor
      //skift daek  
   }
}