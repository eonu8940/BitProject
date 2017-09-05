package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class tempController {
		
	
	@RequestMapping("productPage.do")
	public ModelAndView productPage() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("productPage");
		
		return mav;
	}
	
	@RequestMapping("dibsCheck.do")
	public ModelAndView dibsCheck() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dibsCheck");
		
		return mav;
	}
	
	@RequestMapping("shoppingBasketCheck.do")
	public ModelAndView shoppingBasketCheck() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("shoppingBasketCheck");
		
		return mav;
	}
}
