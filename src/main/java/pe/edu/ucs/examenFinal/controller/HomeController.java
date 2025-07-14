package pe.edu.ucs.examenFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.ucs.examenFinal.entity.Categoria;
import pe.edu.ucs.examenFinal.service.ICategoria;

@Controller
public class HomeController {

	@Autowired
	private ICategoria icategoria;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("categorias", icategoria.readAll());
		return "index";
	}
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		return "form";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute Categoria categoria,Model model) {
		try {
			icategoria.create(categoria);
			return "redirect:/";
		} catch (Exception e) {
			// TODO: handle exception
			return "/nuevo";
		}
		
		
	}
	
}
