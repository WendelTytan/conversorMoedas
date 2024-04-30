package conversor;

import texto.Requisicao;
import texto.Mensagens;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Converter {
    Mensagens mensagens = new Mensagens();
    Scanner scanner = new Scanner(System.in);
    Requisicao taxadeCambio = new Requisicao();

    static String valorDecimal;
    static String finalDecimal;
    double valorUS;
    double valor = 0.0;

    static String valorRecebido1;
    static String valorRecebido2;

    public void ativarFuncao(String valor1, String valor2) {
        this.valorRecebido1 = valor1;
        this.valorRecebido2 = valor2;
    }
    //tirar esse List<String> e colocar void, para que?
    public List<String> converterValor() throws IOException, InterruptedException {
        mensagens.valor();
        while (true) {
            try {
                valor = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                mensagens.erroEntrada();
            }
        }

        String formatoDecimal = String.valueOf(valor).replace(",", ".");
        valorUS = Double.parseDouble(formatoDecimal);

        String moedaOrigem = valorRecebido1;
        String moedaDestino = valorRecebido2;
        double taxa = taxadeCambio.requisicao(moedaOrigem, moedaDestino);
        double valorConvertido = valorUS * taxa;

        DecimalFormat formatoDecimal2 = new DecimalFormat("#,##0.00");

        valorDecimal = formatoDecimal2.format(valorUS);
        finalDecimal = formatoDecimal2.format(valorConvertido);

        mensagens.resultado(valorDecimal, moedaOrigem, moedaDestino, finalDecimal);

        MyListClass myListObject = new MyListClass();
        return myListObject.createList();
    }

    public static class MyListClass {
        public List<String> createList() {
            List<String> myList = new ArrayList<>();
            myList.add(valorDecimal);
            myList.add(valorRecebido1);
            myList.add(valorRecebido2);
            myList.add(finalDecimal);
            return myList;
        }
    }
}