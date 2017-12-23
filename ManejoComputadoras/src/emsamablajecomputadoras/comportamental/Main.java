package emsamablajecomputadoras.creacional;

public class Main {

	public static void main(String[] args) {
		Testing testValidacion  = new Testing();
		Computador pc1=new Computador();
		System.out.println(pc1.especificacionesTecnicas());
		/*Probando sin un computador sin compontes pasa la prueba*/
		testValidacion.handleValidation(pc1);
		
		Builder b1 = new BuilderZenBook();
		b1.buildComputer();
		System.out.println(b1.getComputador().getModelo());
		
		/*Probando si un computador de modelo Zenbook normal pasa la prueba*/
		testValidacion.handleValidation(b1.getComputador());
		
		IComputador[] arreglo = {b1.getComputador(),new ZenBookGamer(b1.getComputador())};
		for (IComputador unArreglo : arreglo) {
			System.out.println(unArreglo.especificacionesTecnicas());
			testValidacion.handleValidation(b1.getComputador());
            System.out.print("\n");
        }
		
		Builder b2 = new BuilderROGE();
		b2.buildComputer();
		System.out.println("\n"+b2.getComputador().especificacionesTecnicas());
		/*Probando si un computador de modelo ROGE  pasa la prueba*/
			
		testValidacion.handleValidation(b2.getComputador());
	}

}
