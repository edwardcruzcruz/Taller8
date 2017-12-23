package emsamablajecomputadoras.comportamental;

public class ComputadorDecorator implements IComputador{
	private IComputador pc;
	public ComputadorDecorator(IComputador pc1) {
		this.pc=pc1;
	}

	@Override
	public String especificacionesTecnicas() {
		
		return this.pc.especificacionesTecnicas();
	}
	
	

}
