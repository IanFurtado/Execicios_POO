public class Professor extends Pessoa {
    
    private String materia;

    public Professor (String nome, int idade, String materia) {
        super (nome, idade);
        this.materia = materia;
    }

    public void setMateria (String materia) {
        this.materia = materia;
    }

    @Override
    public String show() {
        return super.show() + "\nMatéria: " + materia;
    }
}