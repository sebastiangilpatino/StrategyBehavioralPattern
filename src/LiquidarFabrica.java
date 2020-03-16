
public class LiquidarFabrica implements ILiquidar{

	@Override
	public String Pago(double bonus, int salary) {
		return Double.toString(salary*(1+0.3*bonus));
	}
}
