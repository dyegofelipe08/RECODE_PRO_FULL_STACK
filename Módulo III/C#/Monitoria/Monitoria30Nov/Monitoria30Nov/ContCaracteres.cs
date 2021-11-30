using System;

namespace Monitoria30Nov
{
    class ContCaracteres
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
                for (int j = 48; j <= 57; j++)
                {
                    char nro = (char)j;
                    if (nro == caractere)
                    {
                        contNros++;
                    }
                }
                for (int k = 65; k <= 122; k++)
                {
                    char letras = (char)k;
                    if (letras == caractere)
                    {
                        contLetras++;
                    }

                }
                
            }
            Console.WriteLine($"Quantidade de digitos: {contNros}");
            Console.WriteLine($"Quantidade de letras: {contLetras}");

        }
    }
}
