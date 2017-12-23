package emsamablajecomputadoras.creacional;

public class TestCompleto implements ITest{
	private ITest next;
	@Override
	public void handleValidation(Computador pc) {
		if (pc.getPlaca()==null  || pc.getRam()<=0)
			{
			
			System.out.println("No hay Mainboard emsamblada o capacidad de memoria \n No resulto exitosos el test Completo\n");
			
           }

	}
	@Override
	public ITest getNextTest() {
		return next;
	}
	@Override
	public void setNextTest(ITest nextTest) {
		this.next = nextTest;
		
	}

}