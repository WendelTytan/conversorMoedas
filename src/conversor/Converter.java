package conversor;

import texto.Requisicao;
import texto.Mensagens;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    Mensagens mensagens = new Mensagens();
    Scanner scanner = new Scanner(System.in);
    Requisicao taxadeCambio = new Requisicao();

    String valorDecimal;
    String finalDecimal;
    double valorUS;

    public void converterValor() throws IOException, InterruptedException {

        mensagens.valor();
        double valor = scanner.nextDouble();

        DecimalFormat formatoDecimal = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        valorUS = Double.parseDouble(formatoDecimal.format(valor));

        mensagens.moedaOrigem();
        String moedaOrigem = scanner.next().toUpperCase();

        mensagens.moedaDestino();
        String moedaDestino = scanner.next().toUpperCase();
        double taxa = taxadeCambio.requisicao(moedaOrigem, moedaDestino);
        double valorConvertido = valorUS * taxa;

        DecimalFormat formatoDecimal2 = new DecimalFormat("#,##0.00");

        valorDecimal = formatoDecimal2.format(valorUS);
        finalDecimal = formatoDecimal2.format(valorConvertido);

        mensagens.resultado(valorDecimal, moedaOrigem, moedaDestino, finalDecimal);

    }
}
