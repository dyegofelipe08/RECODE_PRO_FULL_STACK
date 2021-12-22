using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploDbLocal.Models
{
    public class Pessoa
    {
        
        public int Id { get; set; } //Utilizando o tipo int atrelado ao nome de variável Id, não é necessário indicar que é uma primary key, a IDE já faz o reconhecimento.
        [Required(ErrorMessage ="Digite o campo nome!")]
        public string Nome { get; set; }
        public string Cpf { get; set; }
        public string Contato { get; set; }
        
    }
}
