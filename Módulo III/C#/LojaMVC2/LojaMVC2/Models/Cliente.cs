using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace LojaMVC2.Models
{
    public class Cliente
    {
        [Key]
        [Required]
        public int idCliente { get; set; }
        [Required(ErrorMessage = "Informe seu nome!")]
        public string Nome { get; set; }
        [Required(ErrorMessage = "Informe seu CPF!")]
        public string Cpf { get; set; }
    }
}
