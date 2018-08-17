package com.zensar.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class HelloController {
	private static final Logger logger = Logger.getLogger(HelloController.class);
	
	/*@RequestMapping("/hello/{id}")*/
	/*public String sayHello(@PathVariable("id")String myId)
	{
		System.out.println(myId);
		return "hello";
	}*/
	
	//automatic conversion is taking place
	public String sayHello(@PathVariable("id")int myId)
	{
		System.out.println(myId);
		return "hello";
	}
	/*@RequestMapping("/hello/3")
	public String sayHi(@PathVariable("id")int myId)
	{
		System.out.println(myId);
		return "hello";
	}*/
	/*@RequestMapping("/hello/{id}/Ram")
	public String sayHi(@PathVariable int id)
	{
		System.out.println(id);
		return "hello";
	}*/
	
	/*@RequestMapping("/hello/{id}/{name}/{age}")
	public String sayHi(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("age") int age)
	{
		System.out.println("Ram");
		System.out.println("Your id is:"+id+",And your name is :"+name+",And your age is :"+age);
		return "hello";
	}*/
	
	@RequestMapping("/hello/{id}/{name}/{age}")
	public String sayHi(@PathVariable Map<String,String> pathVars)
	{
		String id=pathVars.get("id");
		String name=pathVars.get("name");
		String age=pathVars.get("age");
		System.out.println("Your id is:"+id+",And your name is :"+name+",And your age is :"+age);
		return "hello";
	}
	/*@RequestMapping("/greet/{name}")
	public String greet(@PathVariable String name,Model modelToReturnDataOnJspPage)
	{
		if(logger.isDebugEnabled()){
			logger.debug("greet is executed!");
		}
		modelToReturnDataOnJspPage.addAttribute("name", name);
		return "greet";
	}*/
	
	@RequestMapping("/greet/{name}")
	public ModelAndView greet(@PathVariable String name)
	{
		/*ModelAndView modelAndView=new ModelAndView("greet");
		modelAndView.addObject("name", name);*/
		ModelAndView modelAndView=new ModelAndView("greet","name",name);
		return modelAndView;
		
	}
	
	
	
}


