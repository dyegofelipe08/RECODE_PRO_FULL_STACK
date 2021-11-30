using System;

namespace Fatorial
{
    class Fatorial
    {
        static void Main(string[] args)
        {
            // n! = (n-1) x n

            Console.WriteLine("Digite um número: ");
            int num = int.Parse(Console.ReadLine());
            int fat = 1;

            for (int i = 1; i <= num; i++)
            {
                fat *= i;
                Console.WriteLine($"{num}! = {i} x {i+1} ");
               
            }
            Console.WriteLine($"Fatorial de {num} = {fat}");
        }
    }
}
