package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/cars")
public class StadiumController {

	@Resource
	private IStadiumDao stadiumDao;
	
	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/stadiums";
	}
	
	@RequestMapping(value="/stadiums", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("stadiums", stadiumDao.getAll());
		return "stadiumList";
	}
	
	@RequestMapping(value="/stadiums", method=RequestMethod.POST)
	public String add(Stadium stadium) {
		stadiumDao.add(stadium);
		return "redirect:/stadiums";
	}

	@RequestMapping(value="/stadiums/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("stadium", stadiumDao.get(id));
		return "stadiumDetail";
	}
	
	@RequestMapping(value="/stadiums/{id}", method=RequestMethod.POST)
	public String update(Stadium stadium, @PathVariable int id) {
		stadiumDao.update(id, stadium); // book.id already set by binding
		return "redirect:/stadiums";
	}
	
	@RequestMapping(value="/stadiums/delete", method=RequestMethod.POST)
	public String delete(int stadiumId) {
		stadiumDao.delete(stadiumId);
		return "redirect:/stadiums";
	}


//	@ExceptionHandler(value=NoSuchResourceException.class)
//	public ModelAndView handle(Exception e) {
//		ModelAndView mv = new ModelAndView();
//		mv.getModel().put("e", e);
//		mv.setViewName("noSuchResource");
//		return mv;
//	}
}
