package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculatorServer")
public class CalculatorServerImpl implements CalculatorServer {

	@Override
	public float soma(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float subtrai(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float multiplica(float num1, float num2) {
	return num1 * num2;
	}

	@Override
	public float divide(float num1, float num2) {
		return num1 / num2;
	}

}

//Exec: javac calc/*java

