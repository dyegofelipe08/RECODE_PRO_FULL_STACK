using System;

namespace ImparPar
{
    class ImparPar
    {
        static void Main(string[] args)
        {
            Console.Write("Digite um número: ");
            int num = int.Parse(Console.ReadLine());

            while (num < 1000)
            {
                if (num%2 == 0)
                {
                    num += 5;
                }
                else
                {
                    num *= 2;
                }
                Console.WriteLine(num);
            }
            
        }
    }
}
