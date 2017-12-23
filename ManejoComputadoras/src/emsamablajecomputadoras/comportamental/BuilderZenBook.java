package emsamablajecomputadoras.comportamental;

public class BuilderZenBook extends Builder{

	@Override
	public void buildComputer() {
		computador = new Computador(16,buildOS(),500,buildMainboard(),"Asus","Zenbook");
	}

	@Override
	public SistemaOperativo buildOS() {
		SistemaOperativo os = new SistemaOperativo("Windows 10",64, "Home");
		return os;
	}

	@Override
	public Mainboard buildMainboard() {
		Mainboard board = new Mainboard("Prime", "Z370");
		return board;
	}

}
