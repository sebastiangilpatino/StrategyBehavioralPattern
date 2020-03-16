
public class LiquidarAdministrativo implements ILiquidar {

	@Override
	public String Pago(double bonus, int salary) {
		return Double.toString(salary*(1+0.5*bonus));
	}

}
