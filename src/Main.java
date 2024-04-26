import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import texto.Mensagens;
import conversor.Converter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

//@SerializedName(x) esse aqui serve para mudar o apontador, exemplo em um codigo eu tenho
//nome, mas no json tem titulo, que seria o equivalente, neste caso ele converte

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
    }
}