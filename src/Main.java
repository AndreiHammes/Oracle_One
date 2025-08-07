//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Fallen Angels");

        int ano = 1995;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;
        System.out.println("A nota do filme é: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme do diretor Wong Kar-Wai,
                fala sobre um matador de aluguel cria desejos pela sua parceira de crime.
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}