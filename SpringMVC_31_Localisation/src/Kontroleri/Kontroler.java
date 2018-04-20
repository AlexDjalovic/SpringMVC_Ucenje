package Kontroleri;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class Kontroler {

	@ModelAttribute()
	public void prikazPodataka(Model model) {
		model.addAttribute("headerPoruka", "Dobrodosli na aca.com");
		
		List<String>techList=new ArrayList<>();
		techList.add("Spring");
		techList.add("Hibernate");
		techList.add("Angular");
		
		List<String>cities=new ArrayList<>();
		cities.add("Beograd");
		cities.add("Novi Sad");
		cities.add("NIs");
		cities.add("KraGujevac");
		
		List<String>genderList=new ArrayList<>();
		genderList.add("muski");
		genderList.add("zenski");
		
		model.addAttribute("genderList", genderList);
		model.addAttribute("cities", cities);
		model.addAttribute("techList", techList);
	}
	
	//@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST,value="/registerSuccess")
	public String registerSuccess(@ModelAttribute("student")Student student,BindingResult rezultat) {
		if(rezultat.hasErrors()) {
			return"register";
		}
		return "registerSuccess";
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("student", new Student());//MORA DA SE POSTAVI PRAZAN KONSTRUKTOR DA BI MOGLO DA SE KORISTI @ModelAttribute
		String greska="NullPointerException";
	/*	if(greska.equals("NullPointerException")) {
			throw new NullPointerException();
		}*/
		return"register";
	}
	/*
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException() {
		return "NullPointerException";
	}*/
}
