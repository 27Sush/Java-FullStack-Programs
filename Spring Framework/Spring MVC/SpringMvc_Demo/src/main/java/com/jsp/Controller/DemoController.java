package com.jsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	// Handler method or API to return (ONLY) view
	
	@RequestMapping("/hi")
	public String get() 
	{
		return "index";
	}
	
	
	// Handler Method to binding(linking) data/object(Model) to JSP file and return only VIEW
	@RequestMapping("/info")
	public String getMessage(Model model)
	{
		model.addAttribute("myname","My name is Sushant");
		return "view";
	}
	
	
	// Display as it is given in return
	
	@RequestMapping("/data")	
	@ResponseBody
	public String getData()
	{
		return "Direct message from controller without using JSP";
	}
	
	
	// Handler Method to return Model and View at a time.
	
	@RequestMapping("/abc")
	public ModelAndView getModelView()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","I am learning Advance Java...");
		mv.setViewName("display");
		return mv;
	}
}
