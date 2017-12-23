package emsamablajecomputadoras.creacional;

public abstract class Builder {
	
	protected Computador computador;
	
	public abstract void buildComputer();
	public abstract SistemaOperativo buildOS();
	public abstract Mainboard buildMainboard();
	
	public Computador getComputador(){
		return this.computador;
	}
	
}
