/*10 - Faça um programa que converta a temperatura de 
** Celsius para Fahrenheit. 
** A fórmula de conversão é F = (9*C+160)/5.
**
** PASSE CELSIUS COMO ARGUMENTO!
*/

class javaC2F{
    
    public static void main(String[] args){
        int c = Integer.parseInt(args[0]); //primeiro argumento pega celcius
        int f = (9*c+160);
        System.out.println(f/5);
    }
}

/* Main HAS to be void!
**
** Error: Main method must return a value of type void in class javaC2F, 
** please define the main method as:
**   public static void main(String[] args)
*/