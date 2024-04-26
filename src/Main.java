import java.io.IOException;
import java.util.Scanner;

import texto.Mensagens;
import conversor.Converter;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        int chave = 0;

        Mensagens mensagens = new Mensagens();
        mensagens.cabecalho();

        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter();

        while (chave != 2) {
            mensagens.menuPequeno();
            converter.converterValor();
            mensagens.posResultado();
            chave = scanner.nextInt();
            switch (chave) {
                case 1:
                    break;
                case 2:
                    mensagens.mensagemFinal();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}