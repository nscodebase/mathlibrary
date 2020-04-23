package org.ns;

import java.security.Provider.Service;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/v1/")
public class MathController {
	
	@Autowired
	MathService service;
	
	@GetMapping("/add/{number1}/{number2}")
	public Double add(@PathVariable("number1") Double number1, @PathVariable("number2") Double number2)
	{
		return service.add(number1, number2);
	}
	
	@GetMapping("/subtract/{number1}/{number2}")
	public Double subtract(@PathVariable("number1") Double number1, @PathVariable("number2") Double number2)
	{
		return service.subtract(number1, number2);
	}
	
	@GetMapping("/multiply/{number1}/{number2}")
	public Double multiply(@PathVariable("number1") Double number1, @PathVariable("number2") Double number2)
	{
		return service.multiply(number1, number2);
	}
	
	@GetMapping("/divide/{number1}/{number2}")
	public Double divide(@PathVariable("number1") Double number1, @PathVariable("number2") Double number2)
	{
		return service.divide(number1, number2);
	}
}
