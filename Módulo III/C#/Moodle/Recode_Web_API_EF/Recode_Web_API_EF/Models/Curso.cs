using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Recode_Web_API_EF.Models
{
    [Table("Curso")]
    public class Curso
    {
        [Key]
        public int Id { get; set; }
        [Required(ErrorMessage = "Informe a descrição do curso!")]
        [StringLength(50)]
        public string Descricao { get; set; }
        [Required(ErrorMessage ="Informe a carga horária!")]
        public int cargaHoraria { get; set; }

    }
}
