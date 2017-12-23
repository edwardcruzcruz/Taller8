package emsamablajecomputadoras.creacional;

public interface ITest {
	public void handleValidation(Computador pc);
	public ITest getNextTest();
	public void setNextTest(ITest nextTest);
}
