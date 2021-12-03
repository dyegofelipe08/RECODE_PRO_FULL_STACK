using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria
{
    class Endereco
    {
        private string rua;
        private int numero;
        private string bairro;
        private string cep;
        private string uf;

        public string getRua()
        {
            return this.rua;
        }

        public void setRua(string rua)
        {
            this.rua = rua;
        }

        public int getNumero()
        {
            return this.numero;
        }

          public void setNumero(int numero)
        {
            this.numero = numero;
        }

        public string getBairro()
        {
            return this.bairro;
        }

        public void setBairro(string bairro)
        {
            this.bairro = bairro;
        }

        public string getCep()
        {
            return this.cep;
        }

        public void setCep(string cep)
        {
            this.cep = cep;
        }

        public string getUf()
        {
            return this.uf;
        }

        public void setUf(string uf)
        {
            this.uf = uf;
        }

        

    }
}
