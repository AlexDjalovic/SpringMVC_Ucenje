package Kontroleri;

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
}
