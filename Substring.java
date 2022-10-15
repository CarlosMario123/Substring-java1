import java.util.Scanner;

public class Substring
{
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String cadena = "aaaabbbcccc]]@@@]";
    System.out.println("ingrese el string");
    cadena = entrada.nextLine();
    String sub =""+cadena.charAt(0);
    int i =0;
    int c =0;
    int c1=0;
    while(i < cadena.length()){
        
        if(cadena.charAt(i) == sub.charAt(c)){
          c1++;
          i++;
        }
        
        c++;
        if(c == sub.length()){
            c = 0;
            
            if(c1 == 0)
            sub = sub + cadena.charAt(i);

            c1 = 0;
          }
        }
   System.out.println(sub);
}
}