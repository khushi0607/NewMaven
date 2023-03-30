package com.nagarro.Assign3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Controller {
	
	@GetMapping("/add")
	public int add(@RequestParam int num1, @RequestParam int num2)
	{
		return (num1+num2);
	}
	@GetMapping("/sub")
	public int sub(@RequestParam int num1, @RequestParam int num2)
	{
		return (num1-num2);
	}
	@GetMapping("/mul")
	public int mul(@RequestParam int num1, @RequestParam int num2)
	{
		return (num1*num2);
	}
	@GetMapping("/div")
	public int div(@RequestParam int num1, @RequestParam int num2)
	{
		return (num1/num2);
	}

}
