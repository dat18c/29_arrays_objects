import java.util.Arrays;

public class ReverseArray
{
   public static void main(String[] args)
   {
      int[] tal = { 0, 1, 2, 3, 4, 5 };
      System.out.println(Arrays.toString(tal));
      
      for (int i=0; i<tal.length/2; i++)
      {
         //i er det ene element, der skal byttes
         //det andet element regnes ud vha. længde - i
         System.out.println(i + ", " + (tal.length - 1 - i));
         // byt de 2 elementer
         swap(tal, i, tal.length - 1 - i);
      }
      System.out.println(Arrays.toString(tal));
   }
   
   public static void swap(int[] tal, int indexa, int indexb)
   {
      //lav temp til at gemme den ene variabel midlertidigt
      int temp;
      temp = tal[indexa];
      tal[indexa] = tal[indexb];
      tal[indexb] = temp;
   }
   
}