using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace Recode.Models
{
    public class Curso
    {
        [Key]
        [Required]
        public int ID { get; set; }
        [Required(ErrorMessage = "Informe a descrição do curso!")]
        [StringLength(50)]
        public string Descricao { get; set; }
        [Required(ErrorMessage = "Informe a carga horária!")]
        public int CargaHoraria { get; set; }
    }
}
