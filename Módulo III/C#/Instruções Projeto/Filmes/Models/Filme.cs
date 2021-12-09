using System.ComponentModel.DataAnnotations;

namespace Filmes.Models
{
    public class Filme
    {
        [Key]
        [Required]
        public int Id { get; set; }
        [Required]
        public string Nome { get; set; }
        [Required]
        public string Genero { get; set; }
         
    }
}