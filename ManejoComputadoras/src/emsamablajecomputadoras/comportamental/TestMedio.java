package emsamablajecomputadoras.comportamental;

public class TestMedio implements ITest{
	private ITest next;
	@Override
	public void handleValidation(Computador pc) {
		if (pc.getModelo()==null  || pc.getAlmacenamiento()<=0)
			{
			
			System.out.println("No hay modelo emsamblado o capacidad de almcenamiento \n No resulto exitosos el test Medio\n");
			
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

			