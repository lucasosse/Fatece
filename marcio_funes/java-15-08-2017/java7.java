/* 7 - A série fibonacci é uma sequência de números. 
** O primeiro elemento da série é 0 e o segundo é 1. 
** Os outros elementos são calculados somando os dois antecessores.
**
** 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...
**
** Crie um programa para imprimir os 30 primeiros números da série de fibonacci.
*/

class java7{
    
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]); takes user first arg*/
        int n = 30;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

}