package application;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Gerson Pereira de Araujo, ";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets.";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("=========================================");
        aulas.remove(2);
        System.out.println(aulas);

    }


}
