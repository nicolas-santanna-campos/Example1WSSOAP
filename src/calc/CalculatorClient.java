package calc;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculatorClient {

	public static void main(String[] args) throws Exception {
		URL   url 	= new URL  ("http://127.0.0.1:9876/calc?wsdl");
		QName qname = new QName("http://calc/", "CalculatorServerImplService");
		
		Service ws = Service.create(url, qname);
		CalculatorServer calculator = ws.getPort(CalculatorServer.class);
		
		System.out.println("Somando (12+3): " + calculator.sum(12, 3));
		System.out.println("Subtraindo (12-3): " + calculator.subtract(12, 3));
		System.out.println("Multiplicando (12*3): " + calculator.multiplies(12, 3));
		System.out.println("Dividindo (12/3): " + calculator.divide(12, 3));
	}
}

/*Exec prompt 2: 
	javac calc/CalculatorClient.java
	java calc.CalculatorClient
*/