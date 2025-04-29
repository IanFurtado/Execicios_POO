public class Aluno extends Pessoa {
    
    private int matricula;

    public Aluno (String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String show () {
        super.show();
        return super.show() + "\nFui matriculado em: " + matricula;
    }
}
