package bankcomposto;

public class TesteBanco {

    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.nome = "Diego";
        primeiroCliente.cpf = "222.222.222-22";
        primeiroCliente.profissao = "Desenvolvedor";
        
        conta contaDiego = new conta();
        contaDiego.titular = primeiroCliente;
        contaDiego.saldo = 100;
        System.out.println("Olá " + contaDiego.titular.nome);
        System.out.println("Seu saldo é " + contaDiego.saldo);
        
        conta contaRafael = new conta();
        contaRafael.deposita(1000);
        System.out.println(contaRafael.titular);
        if (contaRafael.titular == null) {
            System.out.println("Esta conta ainda não possui cliente!");
        } else {
            System.out.println("Olá " + contaRafael.titular.nome);
            System.out.println("Seu saldo é " + contaRafael.saldo);
        }
    }
    
}