package emsamablajecomputadoras.comportamental;

public interface ITest {
	public void handleValidation(Computador pc);
	public ITest getNextTest();
	public void setNextTest(ITest nextTest);
}
