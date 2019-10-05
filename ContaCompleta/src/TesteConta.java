import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
//        Conta c1 = new Conta("Luis", "703.656", 686, 100);
        Conta[] contas = new Conta[2];
        contas[0] = new Conta(1000, 01);
        contas[1] = new Conta(500, 02);

        Object[] op = {" ", "1 - Depositar", "2 - Transferir", "3 - Sacar", "4 - Sair"};
        Object selected = op[1];
        while(!selected.toString().equals("4 - Sair")){
            selected = JOptionPane.showInputDialog(null, "Saldo atual:\n\nConta 01: "+contas[0].getSaldo()
                + "\nConta 02: "+contas[1].getSaldo()
                + "\n\nEscolha um opção: ", "Sistema de Banco", JOptionPane.INFORMATION_MESSAGE, null, op, op[0]); // Terminei essa parte HEHE
            switch(selected.toString()){
                case "1 - Depositar":
                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: ",
                            "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                    if(num == 01){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[0].depositar(valor);
                    }
                    else if(num == 02){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: ",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[1].depositar(valor);
                    }
                break;
                case "2 - Transferir":
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da conta: ",
                            "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                    if(num2 == 01){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor a ser transferido: ",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[0].transferir(contas[1], valor);
                    }
                    else if(num2 == 02){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor a ser transferido",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[1].transferir(contas[0], valor);
                    }
                break;
                
                case "3 - Sacar":
                    int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta: ",
                            "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                    if(num3 == 01){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor a ser sacado: ",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[0].sacar(valor);
                    }
                    else if(num3 == 02){
                        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor a ser sacado: ",
                                "Sistema de Banco", JOptionPane.QUESTION_MESSAGE));
                        contas[1].sacar(valor);
                    }
                break;
            }
        }
    }
}