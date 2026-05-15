package ProjSoftware;

public class TestaProj {
    public static void main(String[] args){

        Projeto proj1 = new Projeto();
        proj1.setId(1);
        proj1.setNomeProj("Sistema de Biblioteca");

        Programador p1 = new Programador(1, "Miguel", "Java");
        Programador p2 = new Programador(2, "Ana", "Python");

        proj1.ContratarProgramador(p1);
        proj1.ContratarProgramador(p2);

        System.out.println(proj1.VerificarProgramadores());

    }
}
