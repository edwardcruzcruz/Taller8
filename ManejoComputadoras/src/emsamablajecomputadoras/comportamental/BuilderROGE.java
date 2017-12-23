package emsamablajecomputadoras.creacional;

public class BuilderROGE extends Builder{

	@Override
	public void buildComputer() {
		computador = new Computador(32,buildOS(),1000,buildMainboard(),"Asus","ROGE");
	}

	@Override
	public SistemaOperativo buildOS() {
		SistemaOperativo os = new SistemaOperativo("Windows 10",64, "PRO");
		return os;
	}

	@Override
	public Mainboard buildMainboard() {
		Mainboard board = new Mainboard("Strix", "x99");
		return board;
	}

}
