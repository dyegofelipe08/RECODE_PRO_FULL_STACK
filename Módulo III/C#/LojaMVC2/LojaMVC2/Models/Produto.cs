using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace LojaMVC2.Models
{
    public class Produto
    {
        [Key]
        public int IdProduto { get; set; }
        [Required]
        public string nomeProduto { get; set; }
        [Required]
        public decimal precoUnitario { get; set; }
        public string Url { get; set; }
    }
}
