import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GerenciadorAlunos {
    List<Aluno> alunos = new ArrayList<>();
    
    public boolean estaVazia(){
        return alunos.isEmpty();
    }
    
    public void cadastrarAluno(){
        Aluno a = new Aluno();
        a.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));
        a.setMatricula(JOptionPane.showInputDialog(null, "Digite a matricula do Aluno: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));
        alunos.add(a);
    }
    
    public String Listar(){
        String mensagem = "Cadastre antes de Listar";
        if(estaVazia()){
            JOptionPane.showMessageDialog(null, "Nada Cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            return mensagem;
        }
        return alunos.toString();
    }
    
    public boolean atualizar(){
        if(estaVazia()){
            JOptionPane.showMessageDialog(null, "Nada Cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String pesquisa = JOptionPane.showInputDialog(null, "Digite a matricula do Aluno que deseja Atualizar: ", "SUAP", JOptionPane.QUESTION_MESSAGE);
        for(int i = 0; i < alunos.size(); i++){
            Aluno a  = alunos.get(i);
            if(a.getMatricula().equals(pesquisa)){
                a.setNome(JOptionPane.showInputDialog(null, "Nome: "+a.getNome()+ "\nMatricula: "+a.getMatricula() + "\n\nDigite o novo nome: ", "ATUALIZAÇÃO", JOptionPane.QUESTION_MESSAGE));
                a.setMatricula(JOptionPane.showInputDialog(null, "Digite a nova Matricula: ", "ATUALIZAÇÃO", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "Pronto, confira em Listar os novos dados do Aluno.", "ATUALIZAÇÃO CONCLUÍDA",JOptionPane.INFORMATION_MESSAGE);
                return true;
            }     
        }
        JOptionPane.showMessageDialog(null, pesquisa + " não foi encontrado", "FALHA DE REMOÇÃO", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean remover(){
        if(estaVazia()){
            JOptionPane.showMessageDialog(null, "Nada Cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String pesquisa = JOptionPane.showInputDialog(null, "Digite a matricula do Aluno que deseja remover: ", "SUAP", JOptionPane.QUESTION_MESSAGE);
        for(int i = 0; i < alunos.size(); i++){
            Aluno p = alunos.get(i);
            
            if(p.getMatricula().equals(pesquisa)){
                alunos.remove(p);
                JOptionPane.showMessageDialog(null, "Removido com sucesso", "REMOÇÃO CONCLUÍDA", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }  
        }
        JOptionPane.showMessageDialog(null, pesquisa + " não foi encontrado", "FALHA DE REMOÇÃO", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean pesquisar(){
        if(estaVazia()){
                JOptionPane.showMessageDialog(null, "Nada Cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        
        String pesquisa = JOptionPane.showInputDialog(null, "Digite a matricula do Aluno para pesquisar: ", "PESqUISA", JOptionPane.QUESTION_MESSAGE);
        for(int i = 0; i < alunos.size(); i++){
            Aluno a = alunos.get(i);
            
            if(a.getMatricula().equals(pesquisa)){
                JOptionPane.showMessageDialog(null, "Nome: "+a.getNome()+"\nMatricula: "+a.getMatricula(), "PESQUISA",JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, pesquisa + " não foi encontrado", "FALHA DE PESQUISA", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}