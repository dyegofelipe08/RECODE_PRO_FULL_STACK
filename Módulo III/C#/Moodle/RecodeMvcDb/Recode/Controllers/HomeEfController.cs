using Microsoft.AspNetCore.Mvc;
using Recode.Data;
using Recode.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Recode.Controllers
{
    public class HomeEfController : Controller
    {
        private CursoContext _context;
        public HomeEfController(CursoContext context)
        {
            _context = context;
        }

        public IActionResult Index()
        {
            var curso = _context.Cursos.ToList();
            return View(curso);
        }
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Create (CursoContext curso)
        {
            _context.Add(curso);
            _context.SaveChanges();
            return RedirectToAction("Index");
        }
        public IActionResult Edit(int id)
        {
            if(id == null)
            {
                return NotFound();
            }
            var curso = _context.Cursos.SingleOrDefault(a => a.ID == id);

            if (curso == null)
            {
                return NotFound();
            }
            return View(curso);
        }

        [HttpPost]
        public IActionResult Edit(int id, Curso curso)
        {
            if (id != curso.ID)
            {
                return NotFound();
            }
            if (ModelState.IsValid)
            {
                _context.Update(curso);
                _context.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(curso);
        }
        public IActionResult Delete(int id)
        {
            if (id == null)
            {
                return NotFound();
            }
            var curso = _context.Cursos.SingleOrDefault(a => a.ID == id);

            if (curso == null)
            {
                return NotFound();
            }
            return View(curso);
        }

        [HttpPost, ActionName("Delete")]
        public IActionResult DeleteConfirma(int id)
        {
            var curso = _context.Cursos.SingleOrDefault(a => a.ID == id);
            if (curso == null)
            {
                return NotFound();
            }
            _context.Cursos.Remove(curso);
            _context.SaveChanges();
            return RedirectToAction("Index");
        }
        public IActionResult Details(int id)
        {
            if (id==null)
            {
                return NotFound();

            }
            var curso = _context.Cursos.SingleOrDefault(a => a.ID == id);

            if (curso == null)
            {
                return NotFound();
            }
            return View(curso);
        }

    }

   
}
