package bank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo); 
		primeiraConta.saldo+=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

        System.out.println("Vamos comparar pra ver se as contas são iguais:");
        if (primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        } else {
            System.out.println("São diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        // segundaConta = primeiraConta; são 2 referências e 2 objetos!!
        // e por isso tem valores diferentes
    }

}
      
