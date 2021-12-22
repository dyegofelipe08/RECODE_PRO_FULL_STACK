using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace LojaTesteMVC.Models
{
    public class Pedido
    {
        [Key] 
        [Required]
        public int idPedido { get; set; }
        [Required]
        public Cliente Cliente { get; set; }
        [Required]
        public Produto Produto { get; set; }

    }
}
