package impar_par;

public class Impar_par {

    public static void main(String[] args)
    {  
     // descubra quais são os n° de 1000 a 1500 que são impares ou pares.   
     double result; 
          
     int ini = 1000;
     int fim = 1500;
     System.out.println("Os respectivos número são:");   
     
     for(int i = 1000; i <= fim ; i++)
     {
      ini = 1+ini; 
      result = ini % 2;
      
      if(result == 0)
      {
      System.out.println(i + ": " +" Par");
      }
      else
      {
      System.out.println(i + ": " +" Impar");
      }
     }
    }
    
}
