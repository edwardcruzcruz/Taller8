package emsamablajecomputadoras.comportamental;

public class ZenBookGamer extends ComputadorDecorator{

	public ZenBookGamer(IComputador pc1) {
		super(pc1);
	}
	@Override
	public String especificacionesTecnicas() {
		
		return super.especificacionesTecnicas()+"\n"
				+"Memoria Adicional: 16gb";
	}
	

}
