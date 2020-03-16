
public class LiquidarGerente implements ILiquidar {

	@Override
	public String Pago(double bonus, int salary) {
		return Double.toString(salary*(1+2*bonus));
	}
	
}
