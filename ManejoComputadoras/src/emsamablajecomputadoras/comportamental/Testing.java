package emsamablajecomputadoras.comportamental;


public class Testing implements ITest{
	protected ITest nextTest;
	
	
	@Override
	public ITest getNextTest() {
		
		return nextTest;
	}
	@Override
	public void setNextTest(ITest nextTest) {
		this.nextTest=nextTest;
		
	}
	@Override
	public void handleValidation(Computador pc) {
		TestInicial Inicial  = new TestInicial();
		this.setNextTest(Inicial);
		TestMedio Medio  = new TestMedio();
		Inicial.setNextTest(Medio);
		TestCompleto Completo  = new TestCompleto();
		Medio.setNextTest(Completo);
		nextTest.handleValidation(pc) ;
	}
	
}

