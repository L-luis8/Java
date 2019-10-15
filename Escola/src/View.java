import javax.swing.*;
public class View {
    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        
        Object[] op = {" ", "1 - Cadastrar", "2 - Remover", "3 - Atualizar", "4 - Pesquisar", "5 - Listar", "6 - Sair"};
        Object selected = op[0];
        while(!selected.toString().equals("6 - Sair")){
            selected = JOptionPane.showInputDialog(null, "Escolha uma opção abaixo: "
                    , " SUAP ", JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
            switch(selected.toString()){
                case "1 - Cadastrar":                    
                    gerenciador.cadastrarAluno();
                break;
                
                case "2 - Remover":
                    gerenciador.remover();
                break;
                
                case "3 - Atualizar":
                    gerenciador.atualizar();
                break;
                
                case "4 - Pesquisar":
                    gerenciador.pesquisar();
                break;
                
                case "5 - Listar":
                    JOptionPane.showMessageDialog(null, gerenciador.Listar(), "Listar Alunos", JOptionPane.INFORMATION_MESSAGE);
                break;
                
                case "6 - Sair":
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso Sistema, Boas Férias.", "ESCOLA", JOptionPane.INFORMATION_MESSAGE);
                break;
                
                default:
                   JOptionPane.showMessageDialog(null, "Selecione uma opção válida.", "ESCOLA", JOptionPane.INFORMATION_MESSAGE); 
                break;
            }
        }
    }
}