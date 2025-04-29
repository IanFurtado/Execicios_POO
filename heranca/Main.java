public class Main {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa ("Ian", 18);
        Aluno a = new Aluno("Ian", 18, 2025);
        Professor pr = new Professor("Paduan", 45, "Programação");

        p.setNome("Ian");
        p.setIdade(18);
        a.setMatricula(2025);

        
        System.out.println(a.show());
        System.out.println(pr.show());
    }
}
