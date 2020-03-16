
public class Contexto {

	private ILiquidar liquidacion;
	
	public Contexto(ILiquidar liquidacion) {
		this.liquidacion=liquidacion;
	}
	
	public String EjecutarEstrategia(double bonus, int salary) {
		return liquidacion.Pago(bonus, salary);
	}
}
