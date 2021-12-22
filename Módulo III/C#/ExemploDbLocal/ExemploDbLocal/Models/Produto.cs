using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploDbLocal.Models
{
    public class Produto
    {
        public int Id { get; set; }
        public string nomeProduto { get; set; }
        public decimal preco { get; set; }
        public Pessoa pessoa { get; set; }


    }
}
