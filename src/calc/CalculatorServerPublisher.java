package calc;

import javax.xml.ws.Endpoint;

public class CalculatorServerPublisher {

	public static void main (String args []) {
		Endpoint.publish("http://127.0.0.1:9876/calc", new CalculatorServerImpl());
	}
}

/*Exec prompt 1: 
	javac calc/CalculatorServerPublisher.java
	java calc.CalculatorServerPublisher

Access:
	http://127.0.0.1:9876/calc?wsdl
*/