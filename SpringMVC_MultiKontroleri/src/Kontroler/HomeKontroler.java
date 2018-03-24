package Kontroler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeKontroler {

	@RequestMapping(method=RequestMethod.GET)
	public String visit() {
		return "home";
	}
}
