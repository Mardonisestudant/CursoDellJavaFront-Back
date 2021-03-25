package br.com.lead.controller;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.lead.modelo.Autor;
import br.com.lead.util.JPAUTIl;

@Controller
public class AutorController {

@RequestMapping(value = "/consultar-autor" , method = RequestMethod.GET)
@ResponseBody
public ModelAndView consultarAutor(@RequestParam Integer id) {
	
EntityManager em = JPAUTIl.getEntityManager();
	
	Autor autor  = em.find(Autor.class, id);
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("consultar-autor-view");
	modelAndView.addObject("nome" , autor.getNome());
	modelAndView.addObject("dataNascimento" , autor.getDataNascimento());
	
	return modelAndView;
}
		
}

