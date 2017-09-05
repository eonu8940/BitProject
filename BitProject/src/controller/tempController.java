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
	
	
	@RequestMapping("productDibs.do")
	public ModelAndView productDibs(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("productDibs");		
		return mav;		
	}
	
	@RequestMapping("productBasket.do")
	public ModelAndView productBsket(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("productBasket");		
		return mav;		
	}
	
	@RequestMapping("modify_MemberInfoForm.do")
	public ModelAndView modify_MemberInfoForm(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modify_MemberInfoForm");		
		return mav;		
	}
	
	
}
