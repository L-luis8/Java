/**
 * @author 20181094040020
 */
import javax.swing.JOptionPane;

public class Conta {
    private int numConta;
    private double saldo;
    
    public Conta(double saldo, int numConta){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public void sacar(int valor){
        if(this.saldo < valor || this.saldo == 0){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar saque.\nSaldo Atual: "
                    + this.saldo + ".\nVocê precisa de " +  (valor - this.saldo)
                    + " para sacar.\n" ,"Sistema de Banco", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.saldo -= valor;
        }
    }
    
    public void depositar(int valor){
        this.saldo += valor;
    }
    
    public boolean transferir(Conta contaDestino, float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
        return false;
    }
}
