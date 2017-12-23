package emsamablajecomputadoras.creacional;


public class TestInicial implements ITest{
	private ITest next;
	@Override
	public void handleValidation(Computador pc) {
		if (pc.getMarca()==null  || pc.getOs()==null)
			{
			
			System.out.println("No hay Sistema Operatvo o Marca emsamblada\n No resulto exitosos el test Inicial\n");
			
           }
          else{
        	  next.handleValidation(pc);
          };

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
