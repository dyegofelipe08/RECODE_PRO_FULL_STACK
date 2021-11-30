using System;

namespace teste
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.Write("Dig. um texto: ");
            string texto = Console.ReadLine();
            int contNros = 0;
            int contLetras = 0;
            Console.WriteLine($"Total de caracteres do texto: {texto.Length}");
            for (int i = 0; i < texto.Length; i++)
            {
                char caractere = texto[i];
                for (int j = 48; (j <= 57) && (j <= 122); j++)
                {
                    char nro = (char)j;
                    if (nro == caractere)
                    {
                        contNros++;
                    }
                    if (nro )
                    {

                    }
                }
            }
    }
}
