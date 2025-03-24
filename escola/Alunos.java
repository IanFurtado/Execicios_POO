package escola;

public class Alunos {
    
    private String materia;
    private String nome;
    private byte idade;
    private double nota;

    public Alunos (String materia, String nome, byte idade, double nota) {
        this.materia = materia;
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getMateria () {
        return materia;
    }

    public void setMateria (String materia) {
        this.materia = materia;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public byte getIdade () {
        return idade;
    }

    public void setIdade (byte idade) {
        this.idade= idade;
    }

    public double getNota () {
        return nota;
    }

    public void setNota (double nota) {
        this.nota = nota;
    }

    public void exibirInfo () {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nMédia anual do aluno em " + materia + ": " + nota);
    }

}
