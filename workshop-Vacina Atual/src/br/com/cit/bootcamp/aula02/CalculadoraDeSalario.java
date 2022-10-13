package br.com.cit.bootcamp.aula02;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
    	
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorcento().calcula(funcionario);
        }
        if (Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {
        
            return new QuinzeOuVinteCincoPorcento().calcula(funcionario);

        }
       
        if (Cargo.ESTAGIARIO == funcionario.getCargo()) {
			return new TrintaOuQuarentaPorCento().calcula(funcionario);
		}
        
        throw new RuntimeException("funcionario inválido");
    }

}
