
public class Cliente {
	private int Bono;
	private int Salario;
	
	public Cliente(int bono) {
		this.Bono=bono;
	}
	
	public String LiquidacionEmpleado(int empleado) {
		if(empleado == 0) {
			Salario = 2000000;
			Contexto contexto = new Contexto(new LiquidarGerente()); //set estrategia
			return (contexto.EjecutarEstrategia(Bono, Salario));
		}
		else if (empleado == 1) {
			Salario = 1200000;
			Contexto contexto = new Contexto(new LiquidarAdministrativo());
			return (contexto.EjecutarEstrategia(Bono, Salario));
		}
		else if (empleado == 2) {
			Salario = 800000;
			Contexto contexto = new Contexto(new LiquidarFabrica());
			return (contexto.EjecutarEstrategia(Bono, Salario));
		}
		else if (empleado == 3) {
			Salario = 600000;
			Contexto contexto = new Contexto(new LiquidarOtro());
			return (contexto.EjecutarEstrategia(Bono, Salario));
		}
		else {
			System.out.println("Dato Erroneo");
			return null;
		}
		
	}
	
}

	
