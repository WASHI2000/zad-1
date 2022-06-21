import java.util.Scanner;
import java.util.Random;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
 
        System.out.println("Podaj liczbę losowań");
        int los = in.nextInt();
        int lDodatnie = 0;
        int lUjemne = 0;
        int min = 101; 
        int max = -101; 
        for(int i=0; i<los; i++){
            int liczba = r.nextInt(201)-100;
 
            
          if (liczba>0)
                lDodatnie++;
            else if (liczba<0)
                lUjemne++;
          
            if (liczba < min)
                min = liczba;
 
          max = liczba > max ? liczba : max;
        }
 
        double stosunek = lDodatnie / (float)lUjemne;
        System.out.println(stosunek +" "+ min +" "+ max);
 
    }
 
}
    