import java.util.ArrayList;
import java.util.List;
public class IterarArray {

    public static List<String> amigosEmComum(String[] amigosA, String[] amigosB){
        List<String> amigosComum = new ArrayList<>();
        for(String amigoA:amigosA){
            for(String amigoB:amigosB){
                if (amigoA.equals(amigoB)){ // tambem pode usar "amigoA == amigoB"
                    amigosComum.add(amigoA);
                } 
            }
        }
        return amigosComum;
    }

    public static void main(String[] args) {
        String[] amigosDoLuh = {"Laura", "Nath", "Lethicia", "Valadao"};
        String[] amigosDoKaique = {"João", "Valadao", "Kaian"};

        List<String> amigosComuns = amigosEmComum(amigosDoLuh, amigosDoKaique);
        System.out.println("Os amigos em comum são: "+ amigosComuns);

        int[] notas = {6, 7, 4, 2, 9, 10};
        for(int i = 0; i < notas.length; i++){ // i é o contador, "for" cria um loop onde, enquanto o i for menor que o length de notas, vai adicionar +1 
            System.out.println(notas[i]);
        }
        System.out.println("\n"+"Notas da turma"+"\n");
        for(int nota: notas){ // faz a mesma coisa que o de cima só com a criação de uma variável (no caso, contador) e ":"
        if(nota > 6){
            System.out.println(nota + " nota azul"+"\n");
        }else{
            System.out.println(nota + " nota vermelha"+"\n");
        }
        
        }

        List<String> nomes = new ArrayList<>(); // Cria uma lista array
        nomes.add("João"); // Adiciona nome João
        nomes.add("Luh"); // Adiciona nome Luh
        boolean contemJoao = nomes.contains("João"); // Cria uma variavel boolean que verifica se o nome contém João
        System.out.println("\n"+"Verificador de lista");
        System.out.println("\n"+"A lista contém João? "+contemJoao); // Imprime

        
    }
}

// Iterar um array é percorrer este array e fazer algo para cada elemento