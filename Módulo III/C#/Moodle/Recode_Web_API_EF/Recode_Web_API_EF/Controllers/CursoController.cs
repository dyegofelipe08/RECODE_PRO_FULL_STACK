using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Recode_Web_API_EF.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Recode_Web_API_EF.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CursoController : ControllerBase
    {

        private readonly CursoDbContext _context;

        public CursoController(CursoDbContext context)
        {
            _context = context;
        }
        //GET: api/cursos - Lista todos os cursos
        [HttpGet]
        public IEnumerable<Curso> GetCurso()
        {
            return _context.curso;
        }
        [HttpGet("{Id}")]
        public IActionResult GetCursoPorId(int Id)
        {
            Curso curso = _context.curso.SingleOrDefault(m => m.Id == Id);
            if (curso == null)
            {
                return NotFound();
            }
            return new ObjectResult(curso);

        }
        [HttpPost]
        public IActionResult CriarCurso([FromBody] Curso item)
        {
            if (item == null)
            {
                return BadRequest();
            }
            _context.curso.Add(item);
            _context.SaveChanges();

            return CreatedAtAction("GetCursos", new { id = item.Id }, item);
        }
        [HttpPut("{id}")]
        public ActionResult AtualizaCurso(int id, [FromBody] Curso item)
        {
            if(id != item.Id)
            {
                return BadRequest();
            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();
            return new NoContentResult();
        }
        [HttpDelete("{id}")]
        public IActionResult DeletarCurso(int id)
        {
            var curso = _context.curso.SingleOrDefault(m => m.Id == id);

            if(curso == null)
            {
                return BadRequest();
            }
            _context.curso.Remove(curso);
            _context.SaveChanges();

            return Ok(curso);
        }

    }
}
