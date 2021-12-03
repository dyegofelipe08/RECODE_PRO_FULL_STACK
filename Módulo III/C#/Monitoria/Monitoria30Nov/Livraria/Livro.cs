using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria
{
    class Livro
    {
        private string nome;
        private string autor;
        private int numPaginas;
        private double preco;

        public void setNome(string nome)
        {
            this.nome = nome;
        }

        public string getNome()
        {
            return this.nome;
        }

         public void setAutor(string autor)
        {
            this.autor = autor;
        }

        public string getAutor()
        {
            return this.autor;
        }

          public void setNumPaginas(int numPaginas)
        {
            this.numPaginas = numPaginas;
        }

        public int getNumPaginas()
        {
            return this.numPaginas;
        }

         public void setPreco(double preco)
        {
            this.preco = preco;
        }

        public double getNumPaginas()
        {
            return this.preco;
        }
      



        
    }


}
