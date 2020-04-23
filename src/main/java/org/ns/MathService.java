package org.ns;

import org.springframework.stereotype.Service;

@Service
public class MathService {

	public Double add(Double number1, Double number2) {
		return number1 + number2;
	}
	
	public Double subtract(Double number1, Double number2) {
		if(number1>=number2)
			return number1 - number2;
		else
			return number2 - number1;
	}
	
	public Double multiply(Double number1, Double number2) {
		return number1 * number2;
	}
	
	public Double divide(Double number1, Double number2) {
		if(number2==0)
			return 0.0;
		else 
			return number1/number2;
	}

}
