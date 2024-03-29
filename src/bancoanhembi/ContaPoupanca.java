package bancoanhembi;

public class ContaPoupanca extends Conta { 
      
    
     public ContaPoupanca(int numeroConta, String nomeCliente, String cpf) {
        super(numeroConta, nomeCliente, cpf);      
    }
      
    public void calculaRendimento(float porcentagem){
        float rendimento;
        rendimento = super.getSaldo() * porcentagem;
        System.out.println("O rendimento eh de: " + rendimento);
    }    
    
    
    @Override
    public boolean sacar(float valor) {
        if ((super.getSaldo() - valor) >= 0) {
            super.sacar(valor);
            return true;
        } 
            return false;
    }

    @Override
    public boolean depositar(float valor) {
        if (valor >= 0) {
            super.depositar(valor);
            return true;
        } 
            return false;
    }

    @Override
    public String imprimir() {
        return "Titular: " + getNomeCliente() + "\nNÂº conta: " + getNumeroConta() + "\nCPF: " + getCpf() + "\nSaldo: " + getSaldo();
    }
}