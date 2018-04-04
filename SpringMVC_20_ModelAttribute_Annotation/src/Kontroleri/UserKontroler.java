package Kontroleri;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;

@Controller
public class UserKontroler {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model mod) {
		//ZA POCETNU STRANU MORA DA SE UVEK DODA OVO
		mod.addAttribute("user", new User());//MORA DA POSTOJI OVA LINIJA KODA I PRAZAN KONSTRUKTOR KADA KORISTIMO TAG LIBS ZA SPRING FORM:FORM
		mod.addAttribute("welcome", "pozdrav dosli ste na stranicu za registraciju korisnika");
		return "register";
	}
	/*@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam("name")String ime,@RequestParam("age")int god,@RequestParam("country")String zemlja,@RequestParam("email")String mail) {
		User u=new User(ime, god, mail, zemlja);
		ModelAndView model=new ModelAndView("registerSuccess");
		model.addObject("user", u);
		return model;
	}*/
	/*@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam Map<String,String>mapa) {
		
		User u= new User(mapa.get("name"), Integer.parseInt(mapa.get("age")), mapa.get("email"), mapa.get("country"));
		ModelAndView model =new ModelAndView("registerSuccess");
		model.addObject("user", u);
		return model ;
	}*/
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String registerSuccess(@ModelAttribute("user")User user) {
		return "registerSuccess";
		//radilo je i kad je povratna vrednost metode bila modelandview a return value null
	}
	//da ne bi u svakom metodu dodavao porukicu za nesto  a to nesto je zajednicko mogu da stavim anotaciju @modelattribute i onda ce na svim jsp
	//na kojima uz el napisem porukica,da se deli podatak
	@ModelAttribute
	public void prikaziPoruku(Model model) {
		//String m1="danas je moj dan";
		LocalDate ll=LocalDate.now();
		String m1="Danas je: "+ll.getDayOfMonth()+"."+ll.getMonth()+" "+ll.getYear()+".godine, i trenutno je: "+LocalTime.now();
		model.addAttribute("porukica",m1);//ovo je isto kao da sam ovo dodao u registerSuccess method i u register metod
		
	}
}
