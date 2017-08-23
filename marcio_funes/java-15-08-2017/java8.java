/*8 - Faça um programa que calcule o IMC de uma pessoa 
**(IMC = peso / altura) e diga ao usuário o risco à saúde 
**de acordo com a tabela: 
**<18.5 Baixo, 
**18.5 até 24.9 Normal, 
**25 até 29.9 Acima, 
**> 30 Obeso. 
*/
import java.util.Scanner; 

class java8{
    
    public static String imc(double x, double y){
        
        double imc = x/(y*y); 

            if (imc<18.5)                       return String.format( "%.2f", imc ) + " : IMC Baixo";
            else if (18.5<=imc && imc<=24.9)    return String.format( "%.2f", imc ) + " : IMC Normal";
            else if (25<=imc && imc<=29.9)      return String.format( "%.2f", imc ) + " : IMC Acima";
            else if (imc>=30)                   return String.format( "%.2f", imc ) + " : IMC Acima";
            else                                return "Valores Inválidos";
        
    }
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Seu Peso: ");
        double peso = reader.nextDouble(); // Scans the next token of the input as an int.
        System.out.println("Sua Altura: ");
        double altura = reader.nextDouble();
        reader.close();
        
        System.out.println(imc(peso, altura));
    }
}