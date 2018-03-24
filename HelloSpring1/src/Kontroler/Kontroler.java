package Kontroler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class Kontroler {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome() {
		//new ModelAndView(viewName, modelName, modelObject)
		return new ModelAndView("welcome","welcomeMessage","ovo je prva jsp strana u springu");
	}
}
