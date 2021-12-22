using Microsoft.EntityFrameworkCore;
using Recode.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Recode.Data
{
    public class CursoContext : DbContext
    {
        public CursoContext(DbContextOptions<CursoContext> options)
            : base(options)
        { }
        public DbSet<Curso> Cursos { get; set; }
    }
}
