package ex2;

public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super();// chama construtor da super classe
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    @Override //anulação de método
    public void codar(){
        System.out.println("Junior desenvolvendo código com mentoria de: " + this.mentor);
    }

    public String getMentor() {
        return this.mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
