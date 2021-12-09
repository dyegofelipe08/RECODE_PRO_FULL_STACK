using System.ComponentModel.DataAnnotations;

namespace Filmes.Models
{
    public class Filmes
    {
        [Key]
        [Required]
        public int ID { get; set; }

        [Required]
        public string Nome { get; set; }
        
        [Required]
        public string Genero { get; set; }
        
        

        
        
    }
}