package calc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorServer {
	@WebMethod float sum(float num1, float num2);
	@WebMethod float subtract(float num1, float num2);
	@WebMethod float multiplies(float num1, float num2);
	@WebMethod float divide(float num1, float num2);
}
