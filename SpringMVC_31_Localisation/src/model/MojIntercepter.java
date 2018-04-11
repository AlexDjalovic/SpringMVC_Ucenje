package model;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MojIntercepter  extends HandlerInterceptorAdapter{

	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		LocalDate danas=LocalDate.now();
		int mesec=danas.getMonthValue();
		long start=System.currentTimeMillis();
		request.setAttribute("start", start);
		if(mesec==5) {
			response.getWriter().write("sajt ne radi u aprilu,DANAS JE "+mesec);
			return false;
		}
		return true;
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("u okviru afterCompletion metode sam");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		long start=(long) request.getAttribute("start");
		long kraj=System.currentTimeMillis();
		long razlika=kraj-start;
		System.out.println("u okviru postHandle metode prikazujemo razliku u trajanju jer od prehandle do postHandle prodje "+ razlika);
	}
	
	
	
}
