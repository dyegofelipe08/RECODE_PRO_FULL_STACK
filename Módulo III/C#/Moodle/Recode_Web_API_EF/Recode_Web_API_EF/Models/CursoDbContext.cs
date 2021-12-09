using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Recode_Web_API_EF.Models
{
    public class CursoDbContext : DbContext 
    {
        public CursoDbContext(DbContextOptions<CursoDbContext> options) :
            base(options)
        { }

        public DbSet<Curso> curso { get; set; }

    }
}
