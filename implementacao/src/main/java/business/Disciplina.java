package business;
import java.util.List;
import java.util.LinkedList;

public class Disciplina implements IObrigatorio, IAtivada,ISalvavel{
    private List<Aluno> Alunos = new LinkedList<Aluno>();
    private int maxAlunos;
    private String nome;
    private IAtivada ativada;
    private IObrigatorio obrigatoria=null;


    public List<Aluno> getAlunos() {
        return Alunos;
    }


    public Disciplina(int maxAlunos, String nome) {
        this.maxAlunos = maxAlunos;
        this.nome = nome;
        
    }


    public void addAlunos(Aluno aluno){
        Alunos.add(aluno);  
    }

    public void removeAlunos(Aluno aluno){
        getAlunos().remove(aluno);
    }


    public Disciplina(String nomeDisciplina) {
        setNome(nomeDisciplina);
    }


    public void setAlunos(List<Aluno> alunos) {
        Alunos = alunos;
    }


    public IAtivada getAtivada() {
        return ativada;
    }


    public void setAtivada(IAtivada ativada) {
        this.ativada = ativada;
    }


    public int getMaxAlunos() {
        return maxAlunos;
    }


    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public IObrigatorio getObrigatoria() {
        return obrigatoria;
    }


    public void setObrigatoria(IObrigatorio obrigatoria) {
        this.obrigatoria = obrigatoria;
    }


    @Override
    public String getDados(){
        return getNome() + ";" + getMaxAlunos() + ";" + getNome() + "\n";
    }

    @Override
    public String toString(){
        String obg = "Não";
        if(obrigatoria != null){
            obg = "Sim";
        }
        return ("Nome: "+nome+"\n"+"Maximo alunos: "+maxAlunos+"\n"+"É obrigatoria: "+obg+"\n\n");
    }
}