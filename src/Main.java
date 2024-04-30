import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import texto.Mensagens;
import conversor.Converter;

public class Main {
    static List<String> minhaLista = new ArrayList<>();
    public static class MyMainClass {
        public void processList(List<String> myList) {
            for (int i = 0; i < myList.size(); i++) {
                if (minhaLista.isEmpty() && i == 0) {
                    minhaLista.add(0, "\n");
                }

                minhaLista.add(myList.get(i));

                if ((i + 1) % 4 == 0) {
                    minhaLista.add("\n");
                }
            }
        }
    }

    public static String envioMoeda1 = "";
    public static String envioMoeda2 = "";

    public static void main(String[] args) throws IOException, InterruptedException {

        int chaveInt = 0;
        String chaveTexto;
        Mensagens mensagens = new Mensagens();
        mensagens.cabecalho();
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        while (chaveInt != 2) {
            mensagens.menuPequeno();
            int contador = 0;

            while (true) {
                switch (contador) {
                    case 0:
                        mensagens.moedaOrigem();
                        break;
                    case 1:
                        mensagens.moedaDestino();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                if (scanner.hasNextInt()) {
                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            envioMoeda1 = "BRL";
                            contador++;
                            break;
                        case 2:
                            envioMoeda1 = "USD";
                            contador++;
                            break;
                        case 3:
                            envioMoeda1 = "ARS";
                            contador++;
                            break;
                        case 4:
                            envioMoeda1 = "BOB";
                            contador++;
                            break;
                        case 5:
                            envioMoeda1 = "CLP";
                            contador++;
                            break;
                        case 6:
                            envioMoeda1 = "EUR";
                            contador++;
                            break;
                        case 7:
                            envioMoeda1 = "AOA";
                            contador++;
                            break;
                        case 8:
                            envioMoeda1 = "AED";
                            contador++;
                            break;
                        case 9:
                            envioMoeda1 = "AUD";
                            contador++;
                            break;
                        case 10:
                            envioMoeda1 = "AWG";
                            contador++;
                            break;
                        case 11:
                            envioMoeda1 = "AZN";
                            contador++;
                            break;
                        case 12:
                            envioMoeda1 = "BAM";
                            contador++;
                            break;
                        case 13:
                            envioMoeda1 = "BBD";
                            contador++;
                            break;
                        case 14:
                            envioMoeda1 = "BDT";
                            contador++;
                            break;
                        case 15:
                            envioMoeda1 = "BGN";
                            contador++;
                            break;
                        case 16:
                            envioMoeda1 = "BHD";
                            contador++;
                            break;
                        case 17:
                            envioMoeda1 = "BIF";
                            contador++;
                            break;
                        case 18:
                            envioMoeda1 = "BMD";
                            contador++;
                            break;
                        case 19:
                            envioMoeda1 = "BND";
                            contador++;
                            break;
                        case 20:
                            envioMoeda1 = "AFN";
                            contador++;
                            break;
                        case 21:
                            envioMoeda1 = "AMD";
                            contador++;
                            break;
                        case 22:
                            envioMoeda1 = "BSD";
                            contador++;
                            break;
                        case 23:
                            envioMoeda1 = "BTN";
                            contador++;
                            break;
                        case 24:
                            envioMoeda1 = "BWP";
                            contador++;
                            break;
                        case 25:
                            envioMoeda1 = "BYN";
                            contador++;
                            break;
                        case 26:
                            envioMoeda1 = "BZD";
                            contador++;
                            break;
                        case 27:
                            envioMoeda1 = "CAD";
                            contador++;
                            break;
                        case 28:
                            envioMoeda1 = "CDF";
                            contador++;
                            break;
                        case 29:
                            envioMoeda1 = "CHF";
                            contador++;
                            break;
                        case 30:
                            envioMoeda1 = "ALL";
                            contador++;
                            break;
                        case 31:
                            envioMoeda1 = "CNY";
                            contador++;
                            break;
                        case 32:
                            envioMoeda1 = "COP";
                            contador++;
                            break;
                        case 33:
                            envioMoeda1 = "CRC";
                            contador++;
                            break;
                        case 34:
                            envioMoeda1 = "CUP";
                            contador++;
                            break;
                        case 35:
                            envioMoeda1 = "CVE";
                            contador++;
                            break;
                        case 36:
                            envioMoeda1 = "CZK";
                            contador++;
                            break;
                        case 37:
                            envioMoeda1 = "DJF";
                            contador++;
                            break;
                        case 38:
                            envioMoeda1 = "DKK";
                            contador++;
                            break;
                        case 39:
                            envioMoeda1 = "DOP";
                            contador++;
                            break;
                        case 40:
                            envioMoeda1 = "DZD";
                            contador++;
                            break;
                        case 41:
                            envioMoeda1 = "EGP";
                            contador++;
                            break;
                        case 42:
                            envioMoeda1 = "ERN";
                            contador++;
                            break;
                        case 43:
                            envioMoeda1 = "ETB";
                            contador++;
                            break;
                        case 44:
                            envioMoeda1 = "ANG";
                            contador++;
                            break;
                        case 45:
                            envioMoeda1 = "FJD";
                            contador++;
                            break;
                        case 46:
                            envioMoeda1 = "FKP";
                            contador++;
                            break;
                        case 47:
                            envioMoeda1 = "FOK";
                            contador++;
                            break;
                        case 48:
                            envioMoeda1 = "GBP";
                            contador++;
                            break;
                        case 49:
                            envioMoeda1 = "GEL";
                            contador++;
                            break;
                        case 50:
                            envioMoeda1 = "GGP";
                            contador++;
                            break;
                        case 51:
                            envioMoeda1 = "GHS";
                            contador++;
                            break;
                        case 52:
                            envioMoeda1 = "GIP";
                            contador++;
                            break;
                        case 53:
                            envioMoeda1 = "GMD";
                            contador++;
                            break;
                        case 54:
                            envioMoeda1 = "GNF";
                            contador++;
                            break;
                        case 55:
                            envioMoeda1 = "GTQ";
                            contador++;
                            break;
                        case 56:
                            envioMoeda1 = "GYD";
                            contador++;
                            break;
                        case 57:
                            envioMoeda1 = "HKD";
                            contador++;
                            break;
                        case 58:
                            envioMoeda1 = "HNL";
                            contador++;
                            break;
                        case 59:
                            envioMoeda1 = "HRK";
                            contador++;
                            break;
                        case 60:
                            envioMoeda1 = "HTG";
                            contador++;
                            break;
                        case 61:
                            envioMoeda1 = "HUF";
                            contador++;
                            break;
                        case 62:
                            envioMoeda1 = "IDR";
                            contador++;
                            break;
                        case 63:
                            envioMoeda1 = "ILS";
                            contador++;
                            break;
                        case 64:
                            envioMoeda1 = "IMP";
                            contador++;
                            break;
                        case 65:
                            envioMoeda1 = "INR";
                            contador++;
                            break;
                        case 66:
                            envioMoeda1 = "IQD";
                            contador++;
                            break;
                        case 67:
                            envioMoeda1 = "IRR";
                            contador++;
                            break;
                        case 68:
                            envioMoeda1 = "ISK";
                            contador++;
                            break;
                        case 69:
                            envioMoeda1 = "JEP";
                            contador++;
                            break;
                        case 70:
                            envioMoeda1 = "JMD";
                            contador++;
                            break;
                        case 71:
                            envioMoeda1 = "JOD";
                            contador++;
                            break;
                        case 72:
                            envioMoeda1 = "JPY";
                            contador++;
                            break;
                        case 73:
                            envioMoeda1 = "KES";
                            contador++;
                            break;
                        case 74:
                            envioMoeda1 = "KGS";
                            contador++;
                            break;
                        case 75:
                            envioMoeda1 = "KHR";
                            contador++;
                            break;
                        case 76:
                            envioMoeda1 = "KID";
                            contador++;
                            break;
                        case 77:
                            envioMoeda1 = "KMF";
                            contador++;
                            break;
                        case 78:
                            envioMoeda1 = "KRW";
                            contador++;
                            break;
                        case 79:
                            envioMoeda1 = "KWD";
                            contador++;
                            break;
                        case 80:
                            envioMoeda1 = "KYD";
                            contador++;
                            break;
                        case 81:
                            envioMoeda1 = "KZT";
                            contador++;
                            break;
                        case 82:
                            envioMoeda1 = "LAK";
                            contador++;
                            break;
                        case 83:
                            envioMoeda1 = "LBP";
                            contador++;
                            break;
                        case 84:
                            envioMoeda1 = "LKR";
                            contador++;
                            break;
                        case 85:
                            envioMoeda1 = "LRD";
                            contador++;
                            break;
                        case 86:
                            envioMoeda1 = "LSL";
                            contador++;
                            break;
                        case 87:
                            envioMoeda1 = "LYD";
                            contador++;
                            break;
                        case 88:
                            envioMoeda1 = "MAD";
                            contador++;
                            break;
                        case 89:
                            envioMoeda1 = "MDL";
                            contador++;
                            break;
                        case 90:
                            envioMoeda1 = "MGA";
                            contador++;
                            break;
                        case 91:
                            envioMoeda1 = "MKD";
                            contador++;
                            break;
                        case 92:
                            envioMoeda1 = "MMK";
                            contador++;
                            break;
                        case 93:
                            envioMoeda1 = "MNT";
                            contador++;
                            break;
                        case 94:
                            envioMoeda1 = "MOP";
                            contador++;
                            break;
                        case 95:
                            envioMoeda1 = "MRU";
                            contador++;
                            break;
                        case 96:
                            envioMoeda1 = "MUR";
                            contador++;
                            break;
                        case 97:
                            envioMoeda1 = "MVR";
                            contador++;
                            break;
                        case 98:
                            envioMoeda1 = "MWK";
                            contador++;
                            break;
                        case 99:
                            envioMoeda1 = "MXN";
                            contador++;
                            break;
                        case 100:
                            envioMoeda1 = "MYR";
                            contador++;
                            break;
                        case 101:
                            envioMoeda1 = "MZN";
                            contador++;
                            break;
                        case 102:
                            envioMoeda1 = "NAD";
                            contador++;
                            break;
                        case 103:
                            envioMoeda1 = "NGN";
                            contador++;
                            break;
                        case 104:
                            envioMoeda1 = "NIO";
                            contador++;
                            break;
                        case 105:
                            envioMoeda1 = "NOK";
                            contador++;
                            break;
                        case 106:
                            envioMoeda1 = "NPR";
                            contador++;
                            break;
                        case 107:
                            envioMoeda1 = "NZD";
                            contador++;
                            break;
                        case 108:
                            envioMoeda1 = "OMR";
                            contador++;
                            break;
                        case 109:
                            envioMoeda1 = "PAB";
                            contador++;
                            break;
                        case 110:
                            envioMoeda1 = "PEN";
                            contador++;
                            break;
                        case 111:
                            envioMoeda1 = "PGK";
                            contador++;
                            break;
                        case 112:
                            envioMoeda1 = "PHP";
                            contador++;
                            break;
                        case 113:
                            envioMoeda1 = "PKR";
                            contador++;
                            break;
                        case 114:
                            envioMoeda1 = "PLN";
                            contador++;
                            break;
                        case 115:
                            envioMoeda1 = "PYG";
                            contador++;
                            break;
                        case 116:
                            envioMoeda1 = "QAR";
                            contador++;
                            break;
                        case 117:
                            envioMoeda1 = "RON";
                            contador++;
                            break;
                        case 118:
                            envioMoeda1 = "RSD";
                            contador++;
                            break;
                        case 119:
                            envioMoeda1 = "RUB";
                            contador++;
                            break;
                        case 120:
                            envioMoeda1 = "RWF";
                            contador++;
                            break;
                        case 121:
                            envioMoeda1 = "SAR";
                            contador++;
                            break;
                        case 122:
                            envioMoeda1 = "SBD";
                            contador++;
                            break;
                        case 123:
                            envioMoeda1 = "SCR";
                            contador++;
                            break;
                        case 124:
                            envioMoeda1 = "SDG";
                            contador++;
                            break;
                        case 125:
                            envioMoeda1 = "SEK";
                            contador++;
                            break;
                        case 126:
                            envioMoeda1 = "SGD";
                            contador++;
                            break;
                        case 127:
                            envioMoeda1 = "SHP";
                            contador++;
                            break;
                        case 128:
                            envioMoeda1 = "SLE";
                            contador++;
                            break;
                        case 129:
                            envioMoeda1 = "SLL";
                            contador++;
                            break;
                        case 131:
                            envioMoeda1 = "SOS";
                            contador++;
                            break;
                        case 132:
                            envioMoeda1 = "SRD";
                            contador++;
                            break;
                        case 133:
                            envioMoeda1 = "SSP";
                            contador++;
                            break;
                        case 134:
                            envioMoeda1 = "STN";
                            contador++;
                            break;
                        case 135:
                            envioMoeda1 = "SYP";
                            contador++;
                            break;
                        case 136:
                            envioMoeda1 = "SZL";
                            contador++;
                            break;
                        case 137:
                            envioMoeda1 = "THB";
                            contador++;
                            break;
                        case 138:
                            envioMoeda1 = "TJS";
                            contador++;
                            break;
                        case 139:
                            envioMoeda1 = "TMT";
                            contador++;
                            break;
                        case 140:
                            envioMoeda1 = "TND";
                            contador++;
                            break;
                        case 141:
                            envioMoeda1 = "TOP";
                            contador++;
                            break;
                        case 142:
                            envioMoeda1 = "TRY";
                            contador++;
                            break;
                        case 143:
                            envioMoeda1 = "TTD";
                            contador++;
                            break;
                        case 144:
                            envioMoeda1 = "TVD";
                            contador++;
                            break;
                        case 145:
                            envioMoeda1 = "TWD";
                            contador++;
                            break;
                        case 146:
                            envioMoeda1 = "TZS";
                            contador++;
                            break;
                        case 147:
                            envioMoeda1 = "UAH";
                            contador++;
                            break;
                        case 148:
                            envioMoeda1 = "UGX";
                            contador++;
                            break;
                        case 149:
                            envioMoeda1 = "UYU";
                            contador++;
                            break;
                        case 150:
                            envioMoeda1 = "UZS";
                            contador++;
                            break;
                        case 151:
                            envioMoeda1 = "VES";
                            contador++;
                            break;
                        case 152:
                            envioMoeda1 = "VND";
                            contador++;
                            break;
                        case 153:
                            envioMoeda1 = "VUV";
                            contador++;
                            break;
                        case 154:
                            envioMoeda1 = "WST";
                            contador++;
                            break;
                        case 155:
                            envioMoeda1 = "XAF";
                            contador++;
                            break;
                        case 156:
                            envioMoeda1 = "XCD";
                            contador++;
                            break;
                        case 157:
                            envioMoeda1 = "XDR";
                            contador++;
                            break;
                        case 158:
                            envioMoeda1 = "XOF";
                            contador++;
                            break;
                        case 159:
                            envioMoeda1 = "XPF";
                            contador++;
                            break;
                        case 160:
                            envioMoeda1 = "YER";
                            contador++;
                            break;
                        case 161:
                            envioMoeda1 = "ZAR";
                            contador++;
                            break;
                        case 162:
                            envioMoeda1 = "ZMW";
                            contador++;
                            break;
                        case 163:
                            envioMoeda1 = "ZWL";
                            contador++;
                            break;
                        case 999:
                            mensagens.menuGrande();
                            break;
                        default:
                            mensagens.erroMoeda();
                    } //talvez fazer uma classe para receber os switchs?
                } else { //parando para pensar agora eu não tenho nenhum lugar que armazene o nome das moedas para apresentar depois, seria interessante?
                    String input = scanner.next().toUpperCase();
                    switch (input) {
                        case "BRL":
                            envioMoeda1 = "BRL";
                            contador++;
                            break;
                        case "USD":
                            envioMoeda1 = "USD";
                            contador++;
                            break;
                        case "ARS":
                            envioMoeda1 = "ARS";
                            contador++;
                            break;
                        case "BOB":
                            envioMoeda1 = "BOB";
                            contador++;
                            break;
                        case "CLP":
                            envioMoeda1 = "CLP";
                            contador++;
                            break;
                        case "EUR":
                            envioMoeda1 = "EUR";
                            contador++;
                            break;
                        case "AOA":
                            envioMoeda1 = "AOA";
                            contador++;
                            break;
                        case "AED":
                            envioMoeda1 = "AED";
                            contador++;
                            break;
                        case "AUD":
                            envioMoeda1 = "AUD";
                            contador++;
                            break;
                        case "AWG":
                            envioMoeda1 = "AWG";
                            contador++;
                            break;
                        case "AZN":
                            envioMoeda1 = "AZN";
                            contador++;
                            break;
                        case "BAM":
                            envioMoeda1 = "BAM";
                            contador++;
                            break;
                        case "BBD":
                            envioMoeda1 = "BBD";
                            contador++;
                            break;
                        case "BDT":
                            envioMoeda1 = "BDT";
                            contador++;
                            break;
                        case "BGN":
                            envioMoeda1 = "BGN";
                            contador++;
                            break;
                        case "BHD":
                            envioMoeda1 = "BHD";
                            contador++;
                            break;
                        case "BIF":
                            envioMoeda1 = "BIF";
                            contador++;
                            break;
                        case "BMD":
                            envioMoeda1 = "BMD";
                            contador++;
                            break;
                        case "BND":
                            envioMoeda1 = "BND";
                            contador++;
                            break;
                        case "AFN":
                            envioMoeda1 = "AFN";
                            contador++;
                            break;
                        case "AMD":
                            envioMoeda1 = "AMD";
                            contador++;
                            break;
                        case "BSD":
                            envioMoeda1 = "BSD";
                            contador++;
                            break;
                        case "BTN":
                            envioMoeda1 = "BTN";
                            contador++;
                            break;
                        case "BWP":
                            envioMoeda1 = "BWP";
                            contador++;
                            break;
                        case "BYN":
                            envioMoeda1 = "BYN";
                            contador++;
                            break;
                        case "BZD":
                            envioMoeda1 = "BZD";
                            contador++;
                            break;
                        case "CAD":
                            envioMoeda1 = "CAD";
                            contador++;
                            break;
                        case "CDF":
                            envioMoeda1 = "CDF";
                            contador++;
                            break;
                        case "CHF":
                            envioMoeda1 = "CHF";
                            contador++;
                            break;
                        case "ALL":
                            envioMoeda1 = "ALL";
                            contador++;
                            break;
                        case "CNY":
                            envioMoeda1 = "CNY";
                            contador++;
                            break;
                        case "COP":
                            envioMoeda1 = "COP";
                            contador++;
                            break;
                        case "CRC":
                            envioMoeda1 = "CRC";
                            contador++;
                            break;
                        case "CUP":
                            envioMoeda1 = "CUP";
                            contador++;
                            break;
                        case "CVE":
                            envioMoeda1 = "CVE";
                            contador++;
                            break;
                        case "CZK":
                            envioMoeda1 = "CZK";
                            contador++;
                            break;
                        case "DJF":
                            envioMoeda1 = "DJF";
                            contador++;
                            break;
                        case "DKK":
                            envioMoeda1 = "DKK";
                            contador++;
                            break;
                        case "DOP":
                            envioMoeda1 = "DOP";
                            contador++;
                            break;
                        case "DZD":
                            envioMoeda1 = "DZD";
                            contador++;
                            break;
                        case "EGP":
                            envioMoeda1 = "EGP";
                            contador++;
                            break;
                        case "ERN":
                            envioMoeda1 = "ERN";
                            contador++;
                            break;
                        case "ETB":
                            envioMoeda1 = "ETB";
                            contador++;
                            break;
                        case "ANG":
                            envioMoeda1 = "ANG";
                            contador++;
                            break;
                        case "FJD":
                            envioMoeda1 = "FJD";
                            contador++;
                            break;
                        case "FKP":
                            envioMoeda1 = "FKP";
                            contador++;
                            break;
                        case "FOK":
                            envioMoeda1 = "FOK";
                            contador++;
                            break;
                        case "GBP":
                            envioMoeda1 = "GBP";
                            contador++;
                            break;
                        case "GEL":
                            envioMoeda1 = "GEL";
                            contador++;
                            break;
                        case "GGP":
                            envioMoeda1 = "GGP";
                            contador++;
                            break;
                        case "GHS":
                            envioMoeda1 = "GHS";
                            contador++;
                            break;
                        case "GIP":
                            envioMoeda1 = "GIP";
                            contador++;
                            break;
                        case "GMD":
                            envioMoeda1 = "GMD";
                            contador++;
                            break;
                        case "GNF":
                            envioMoeda1 = "GNF";
                            contador++;
                            break;
                        case "GTQ":
                            envioMoeda1 = "GTQ";
                            contador++;
                            break;
                        case "GYD":
                            envioMoeda1 = "GYD";
                            contador++;
                            break;
                        case "HKD":
                            envioMoeda1 = "HKD";
                            contador++;
                            break;
                        case "HNL":
                            envioMoeda1 = "HNL";
                            contador++;
                            break;
                        case "HRK":
                            envioMoeda1 = "HRK";
                            contador++;
                            break;
                        case "HTG":
                            envioMoeda1 = "HTG";
                            contador++;
                            break;
                        case "HUF":
                            envioMoeda1 = "HUF";
                            contador++;
                            break;
                        case "IDR":
                            envioMoeda1 = "IDR";
                            contador++;
                            break;
                        case "ILS":
                            envioMoeda1 = "ILS";
                            contador++;
                            break;
                        case "IMP":
                            envioMoeda1 = "IMP";
                            contador++;
                            break;
                        case "INR":
                            envioMoeda1 = "INR";
                            contador++;
                            break;
                        case "IQD":
                            envioMoeda1 = "IQD";
                            contador++;
                            break;
                        case "IRR":
                            envioMoeda1 = "IRR";
                            contador++;
                            break;
                        case "ISK":
                            envioMoeda1 = "ISK";
                            contador++;
                            break;
                        case "JEP":
                            envioMoeda1 = "JEP";
                            contador++;
                            break;
                        case "JMD":
                            envioMoeda1 = "JMD";
                            contador++;
                            break;
                        case "JOD":
                            envioMoeda1 = "JOD";
                            contador++;
                            break;
                        case "JPY":
                            envioMoeda1 = "JPY";
                            contador++;
                            break;
                        case "KES":
                            envioMoeda1 = "KES";
                            contador++;
                            break;
                        case "KGS":
                            envioMoeda1 = "KGS";
                            contador++;
                            break;
                        case "KHR":
                            envioMoeda1 = "KHR";
                            contador++;
                            break;
                        case "KID":
                            envioMoeda1 = "KID";
                            contador++;
                            break;
                        case "KMF":
                            envioMoeda1 = "KMF";
                            contador++;
                            break;
                        case "KRW":
                            envioMoeda1 = "KRW";
                            contador++;
                            break;
                        case "KWD":
                            envioMoeda1 = "KWD";
                            contador++;
                            break;
                        case "KYD":
                            envioMoeda1 = "KYD";
                            contador++;
                            break;
                        case "KZT":
                            envioMoeda1 = "KZT";
                            contador++;
                            break;
                        case "LAK":
                            envioMoeda1 = "LAK";
                            contador++;
                            break;
                        case "LBP":
                            envioMoeda1 = "LBP";
                            contador++;
                            break;
                        case "LKR":
                            envioMoeda1 = "LKR";
                            contador++;
                            break;
                        case "LRD":
                            envioMoeda1 = "LRD";
                            contador++;
                            break;
                        case "LSL":
                            envioMoeda1 = "LSL";
                            contador++;
                            break;
                        case "LYD":
                            envioMoeda1 = "LYD";
                            contador++;
                            break;
                        case "MAD":
                            envioMoeda1 = "MAD";
                            contador++;
                            break;
                        case "MDL":
                            envioMoeda1 = "MDL";
                            contador++;
                            break;
                        case "MGA":
                            envioMoeda1 = "MGA";
                            contador++;
                            break;
                        case "MKD":
                            envioMoeda1 = "MKD";
                            contador++;
                            break;
                        case "MMK":
                            envioMoeda1 = "MMK";
                            contador++;
                            break;
                        case "MNT":
                            envioMoeda1 = "MNT";
                            contador++;
                            break;
                        case "MOP":
                            envioMoeda1 = "MOP";
                            contador++;
                            break;
                        case "MRU":
                            envioMoeda1 = "MRU";
                            contador++;
                            break;
                        case "MUR":
                            envioMoeda1 = "MUR";
                            contador++;
                            break;
                        case "MVR":
                            envioMoeda1 = "MVR";
                            contador++;
                            break;
                        case "MWK":
                            envioMoeda1 = "MWK";
                            contador++;
                            break;
                        case "MXN":
                            envioMoeda1 = "MXN";
                            contador++;
                            break;
                        case "MYR":
                            envioMoeda1 = "MYR";
                            contador++;
                            break;
                        case "MZN":
                            envioMoeda1 = "MZN";
                            contador++;
                            break;
                        case "NAD":
                            envioMoeda1 = "NAD";
                            contador++;
                            break;
                        case "NGN":
                            envioMoeda1 = "NGN";
                            contador++;
                            break;
                        case "NIO":
                            envioMoeda1 = "NIO";
                            contador++;
                            break;
                        case "NOK":
                            envioMoeda1 = "NOK";
                            contador++;
                            break;
                        case "NPR":
                            envioMoeda1 = "NPR";
                            contador++;
                            break;
                        case "NZD":
                            envioMoeda1 = "NZD";
                            contador++;
                            break;
                        case "OMR":
                            envioMoeda1 = "OMR";
                            contador++;
                            break;
                        case "PAB":
                            envioMoeda1 = "PAB";
                            contador++;
                            break;
                        case "PEN":
                            envioMoeda1 = "PEN";
                            contador++;
                            break;
                        case "PGK":
                            envioMoeda1 = "PGK";
                            contador++;
                            break;
                        case "PHP":
                            envioMoeda1 = "PHP";
                            contador++;
                            break;
                        case "PKR":
                            envioMoeda1 = "PKR";
                            contador++;
                            break;
                        case "PLN":
                            envioMoeda1 = "PLN";
                            contador++;
                            break;
                        case "PYG":
                            envioMoeda1 = "PYG";
                            contador++;
                            break;
                        case "QAR":
                            envioMoeda1 = "QAR";
                            contador++;
                            break;
                        case "RON":
                            envioMoeda1 = "RON";
                            contador++;
                            break;
                        case "RSD":
                            envioMoeda1 = "RSD";
                            contador++;
                            break;
                        case "RUB":
                            envioMoeda1 = "RUB";
                            contador++;
                            break;
                        case "RWF":
                            envioMoeda1 = "RWF";
                            contador++;
                            break;
                        case "SAR":
                            envioMoeda1 = "SAR";
                            contador++;
                            break;
                        case "SBD":
                            envioMoeda1 = "SBD";
                            contador++;
                            break;
                        case "SCR":
                            envioMoeda1 = "SCR";
                            contador++;
                            break;
                        case "SDG":
                            envioMoeda1 = "SDG";
                            contador++;
                            break;
                        case "SEK":
                            envioMoeda1 = "SEK";
                            contador++;
                            break;
                        case "SGD":
                            envioMoeda1 = "SGD";
                            contador++;
                            break;
                        case "SHP":
                            envioMoeda1 = "SHP";
                            contador++;
                            break;
                        case "SLE":
                            envioMoeda1 = "SLE";
                            contador++;
                            break;
                        case "SLL":
                            envioMoeda1 = "SLL";
                            contador++;
                            break;
                        case "SOS":
                            envioMoeda1 = "SOS";
                            contador++;
                            break;
                        case "SRD":
                            envioMoeda1 = "SRD";
                            contador++;
                            break;
                        case "SSP":
                            envioMoeda1 = "SSP";
                            contador++;
                            break;
                        case "STN":
                            envioMoeda1 = "STN";
                            contador++;
                            break;
                        case "SYP":
                            envioMoeda1 = "SYP";
                            contador++;
                            break;
                        case "SZL":
                            envioMoeda1 = "SZL";
                            contador++;
                            break;
                        case "THB":
                            envioMoeda1 = "THB";
                            contador++;
                            break;
                        case "TJS":
                            envioMoeda1 = "TJS";
                            contador++;
                            break;
                        case "TMT":
                            envioMoeda1 = "TMT";
                            contador++;
                            break;
                        case "TND":
                            envioMoeda1 = "TND";
                            contador++;
                            break;
                        case "TOP":
                            envioMoeda1 = "TOP";
                            contador++;
                            break;
                        case "TRY":
                            envioMoeda1 = "TRY";
                            contador++;
                            break;
                        case "TTD":
                            envioMoeda1 = "TTD";
                            contador++;
                            break;
                        case "TVD":
                            envioMoeda1 = "TVD";
                            contador++;
                            break;
                        case "TWD":
                            envioMoeda1 = "TWD";
                            contador++;
                            break;
                        case "TZS":
                            envioMoeda1 = "TZS";
                            contador++;
                            break;
                        case "UAH":
                            envioMoeda1 = "UAH";
                            contador++;
                            break;
                        case "UGX":
                            envioMoeda1 = "UGX";
                            contador++;
                            break;
                        case "UYU":
                            envioMoeda1 = "UYU";
                            contador++;
                            break;
                        case "UZS":
                            envioMoeda1 = "UZS";
                            contador++;
                            break;
                        case "VES":
                            envioMoeda1 = "VES";
                            contador++;
                            break;
                        case "VND":
                            envioMoeda1 = "VND";
                            contador++;
                            break;
                        case "VUV":
                            envioMoeda1 = "VUV";
                            contador++;
                            break;
                        case "WST":
                            envioMoeda1 = "WST";
                            contador++;
                            break;
                        case "XAF":
                            envioMoeda1 = "XAF";
                            contador++;
                            break;
                        case "XCD":
                            envioMoeda1 = "XCD";
                            contador++;
                            break;
                        case "XDR":
                            envioMoeda1 = "XDR";
                            contador++;
                            break;
                        case "XOF":
                            envioMoeda1 = "XOF";
                            contador++;
                            break;
                        case "XPF":
                            envioMoeda1 = "XPF";
                            contador++;
                            break;
                        case "YER":
                            envioMoeda1 = "YER";
                            contador++;
                            break;
                        case "ZAR":
                            envioMoeda1 = "ZAR";
                            contador++;
                            break;
                        case "ZMW":
                            envioMoeda1 = "ZMW";
                            contador++;
                            break;
                        case "ZWL":
                            envioMoeda1 = "ZWL";
                            contador++;
                            break;
                        case "XXX":
                            mensagens.menuGrande();
                            break;
                        default:
                            mensagens.erroMoeda();
                    }
                }
                if (contador == 1) {
                    envioMoeda2 = envioMoeda1;
                } else if (contador >= 2) {
                    break;
                }
            }

            converter.ativarFuncao(envioMoeda1, envioMoeda2);
            converter.converterValor();

            Converter.MyListClass myListClass = new Converter.MyListClass();
            MyMainClass myMainClass = new MyMainClass();
            List<String> myList = myListClass.createList();
            myMainClass.processList(myList);

            mensagens.posResultado();
            if (scanner.hasNextInt()) {
                chaveInt = scanner.nextInt();
                switch (chaveInt) {
                    case 1:
                        break;
                    case 2:
                        mensagens.mensagemFinal();
                        break;
                    case 3:
                        chaveInt = 1;
                        mensagens.Log();
                        System.out.println(minhaLista);
                        break;
                    default:
                        mensagens.erroMoeda();
                }
            } else {
                chaveTexto = scanner.next().toUpperCase();
                switch (chaveTexto) {
                    case "SIM":
                        chaveInt = 1;
                        break;
                    case "NÃO":
                    case "NAO":
                        chaveInt = 2;
                        mensagens.mensagemFinal();
                        break;
                    case "LOG":
                    case "LOGS":
                        chaveInt = 1;
                        mensagens.Log();
                        System.out.println(minhaLista);
                        break;
                    default:
                        mensagens.erroMoeda();
                }
            }
        }
        scanner.close();
    }
}