package Kontroler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class VisestrukiKontroler {
	
@RequestMapping(value="/UPIS")
	public ModelAndView upisi() {
		return  new ModelAndView("insert","insertPoruka","INSERT INTO employee(id,name)VALUES(1,'ACA');");
	}
@RequestMapping(value="/BRISANJE")
	public ModelAndView obrisi() {
		return  new ModelAndView("delete","deletePoruka","Delete From employee WHERE id=1;");
	}
	
	
}
