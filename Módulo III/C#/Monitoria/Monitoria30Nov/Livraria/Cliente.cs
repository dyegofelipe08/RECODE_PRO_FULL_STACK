using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria
{
    class Cliente
    {
        private string nome;
        private string cpf;
        private Endereco endereco;

        public string getNome()
        {
            return this.nome;
        }

        public void setNome(string nome)
        {
            this.nome = nome;
        }

        public string getCpf()
        {
            return this.cpf;
        }

        public void setCpf(string cpf)
        {
            this.cpf = cpf;
        }

        public Endereco getEndereco()
        {
            return this.endereco;
        }

        public void setEndereco(Endereco endereco)
        {
            this.endereco = endereco;
        }

    }
}
