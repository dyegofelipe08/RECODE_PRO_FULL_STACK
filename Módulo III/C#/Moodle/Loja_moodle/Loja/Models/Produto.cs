using System.ComponentModel.DataAnnotations;

namespace Loja.Models{

    public class Loja{
        [Key]
        [Required]
        public int id {get; set;}

        [Required]
        public string nome{get; set;}
    }

}