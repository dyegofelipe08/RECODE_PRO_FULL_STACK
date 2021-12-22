using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace LojaMVC2.Models
{
    public class Pedido
    {
        [Key]
        [Required]
        public int idPedido { get; set; }

        //Criação da Fk Cliente
        [Required]
        public int ClienteidCliente { get; set; }
        public Cliente Cliente { get; set; }


        [Required]
        public int ProdutoIdProduto { get; set; }
        public Produto Produto { get; set; }
    }
}
