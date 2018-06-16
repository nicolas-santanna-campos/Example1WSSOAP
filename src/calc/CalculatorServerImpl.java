package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculatorServer")
public class CalculatorServerImpl implements CalculatorServer {

	@Override
	public float sum(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float multiplies(float num1, float num2) {
	return num1 * num2;
	}

	@Override
	public float divide(float num1, float num2) {
		return num1 / num2;
	}

}

//Exec: javac calc/*java

