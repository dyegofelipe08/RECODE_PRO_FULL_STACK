using System.Collections.Generic;
using Filmes.Data;
using Filmes.Models;
using Microsoft.AspNetCore.Mvc;

namespace Filmes.Controllers
{
    public class FilmeController : Controller
    {
        private readonly FilmeContext _context;

        public FilmeController(FilmeContext context){
            _context = context;
        }

        public IActionResult Index(){
            IEnumerable<Filme> Lista = _context.Filmes;
            return View(Lista);
        }

        public IActionResult FilmesNext(){
            return View();
        }
    }
}