package texto;

public class Mensagens {

    public void cabecalho() {
        System.out.println("""
                ******************************************************
                                  CONVERSOR DE MOEDAS
                ******************************************************
                """);
    }

    public void menuPequeno() {
        System.out.println("""
                ------------------------------------------------------
                | NÚMERO |  CÓDIGO   |          DESCRIÇÃO:           |
                ------------------------------------------------------
                |   1    |    BRL    |   Real Brasileiro             |
                |   2    |    USD    |   Dólar Estados Unidos        |
                |   3    |    ARS	 |   Peso Argentino              |
                |   4    |    BOB    |   Boliviano                   |
                |   5    |    CLP    |   Peso Chileno                |
                |   6    |    EUR    |   Euro                        |
                |   999  |    XXX    |           Outros...           |
                ------------------------------------------------------
                """);
    }

    public void menuGrande() {
        System.out.println("""
                ------------------------------------------------------
                | NÚMERO |  CÓDIGO   |           DESCRIÇÃO:          |
                ------------------------------------------------------
                |   1    |    BRL    |   Real Brasileiro             |
                |   2    |    USD    |   Dólar Estados Unidos        |
                |   3    |    ARS	 |   Peso Argentino              |
                |   4    |    BOB    |   Boliviano                   |
                |   5    |    CLP    |   Peso Chileno                |
                |   6    |    EUR    |   Euro                        |
                |   7    |    AOA    |   Kwanza Angolano             |
                |   8    |    AED    |   Dirham                      |
                |   9    |    AUD    |   Dólar Australiano           |
                |   10   |    AWG    |   Florim de Aruba             |
                |   11   |    AZN    |   Manat Azerbaijano           |
                |   12   |    BAM    |   Marco Convertível           |
                |   13   |    BBD    |   Dólar de Barbados           |
                |   14   |    BDT    |   Taka de Bangladesh          |
                |   15   |    BGN    |   Lev Búlgaro                 |
                |   16   |    BHD    |   Dinar Bareinita             |
                |   17   |    BIF    |   Franco Burundiano           |
                |   18   |    BMD    |   Dólar Bermudense            |
                |   19   |    BND    |   Dólar de Brunei             |
                |   20   |    AFN    |   Afegane Afegão              |
                |   21   |    AMD    |   Dram Armênio                |
                |   22   |    BSD    |   Dólar das Bahamas           |
                |   23   |    BTN    |   Ngultrum Butanês            |
                |   24   |    BWP    |   Pula Botsuanense            |
                |   25   |    BYN    |   Rublo Bielorrusso           |
                |   26   |    BZD    |   Dólar do Belize             |
                |   27   |    CAD    |   Dólar Canadense             |
                |   28   |    CDF    |   Franco Congolês             |
                |   29   |    CHF    |   Franco Suíço                |
                |   30   |    ALL    |   Lek Albanês                 |
                |   31   |    CNY    |   Yuan Renminbi Chinês        |
                |   32   |    COP    |   Peso Colombiano             |
                |   33   |    CRC    |   Colón Costarriquenho        |
                |   34   |    CUP    |   Peso Cubano                 |
                |   35   |    CVE    |   Escudo Cabo-Verdiano        |
                |   36   |    CZK    |   Coroa Tcheca                |
                |   37   |    DJF    |   Franco Jibutiano            |
                |   38   |    DKK    |   Coroa Dinamarquesa          |
                |   39   |    DOP    |   Peso Dominicano             |
                |   40   |    DZD    |   Dinar Argelino              |
                |   41   |    EGP    |   Libra Egípcia               |
                |   42   |    ERN    |   Nakfa Eritreia              |
                |   43   |    ETB    |   Birr Etíope                 |
                |   44   |    ANG    |   Florim das Antilhas         |
                |   45   |    FJD    |   Dólar de Fiji               |
                |   46   |    FKP    |   Libra das Ilhas Falkland    |
                |   47   |    FOK    |   Coroa das Ilhas Feroe       |
                |   48   |    GBP    |   Libra Esterlina             |
                |   49   |    GEL    |   Lari Georgiano              |
                |   50   |    GGP    |   Libra de Guernsey           |
                |   51   |    GHS    |   Cedi Ganês                  |
                |   52   |    GIP    |   Libra de Gibraltar          |
                |   53   |    GMD    |   Dalasi Gambiano             |
                |   54   |    GNF    |   Franco Guineense            |
                |   55   |    GTQ    |   Quetzal Guatemalteco        |
                |   56   |    GYD    |   Dólar Guianense             |
                |   57   |    HKD    |   Dólar de Hong Kong          |
                |   58   |    HNL    |   Lempira Hondurenha          |
                |   59   |    HRK    |   Kuna Croata                 |
                |   60   |    HTG    |   Gourde Haitiano             |
                |   61   |    HUF    |   Forint Húngaro              |
                |   62   |    IDR    |   Rupia Indonésia             |
                |   63   |    ILS    |   Shekel Israelense           |
                |   64   |    IMP    |   Libra de Man                |
                |   65   |    INR    |   Rupia Indiana               |
                |   66   |    IQD    |   Dinar Iraquiano             |
                |   67   |    IRR    |   Rial Iraniano               |
                |   68   |    ISK    |   Coroa Islandesa             |
                |   69   |    JEP    |   Libra de Jersey             |
                |   70   |    JMD    |   Dólar Jamaicano             |
                |   71   |    JOD    |   Dinar Jordaniano            |
                |   72   |    JPY    |   Iene Japonês                |
                |   73   |    KES    |   Xelim Queniano              |
                |   74   |    KGS    |   Som Quirguiz                |
                |   75   |    KHR    |   Riel Cambojano              |
                |   76   |    KID    |   Dólar de Kiribati           |
                |   77   |    KMF    |   Franco Comoriano            |
                |   78   |    KRW    |   Won Sul-Coreano             |
                |   79   |    KWD    |   Dinar Kuwaitiano            |
                |   80   |    KYD    |   Dólar das Ilhas Cayman      |
                |   81   |    KZT    |   Tenge Cazaque               |
                |   82   |    LAK    |   Kip Laosiano                |
                |   83   |    LBP    |   Libra Libanesa              |
                |   84   |    LKR    |   Rupia do Sri Lanka          |
                |   85   |    LRD    |   Dólar Liberiano             |
                |   86   |    LSL    |   Loti do Lesoto              |
                |   87   |    LYD    |   Dinar Líbio                 |
                |   88   |    MAD    |   Dirham Marroquino           |
                |   89   |    MDL    |   Leu Moldávio                |
                |   90   |    MGA    |   Ariary Malgaxe              |
                |   91   |    MKD    |   Dinar Macedônio             |
                |   92   |    MMK    |   Kyat de Mianmar             |
                |   93   |    MNT    |   Tugrik Mongol               |
                |   94   |    MOP    |   Pataca de Macau             |
                |   95   |    MRU    |   Ouguiya da Mauritânia       |
                |   96   |    MUR    |   Rupia de Maurício           |
                |   97   |    MVR    |   Rufiyaa Maldivense          |
                |   98   |    MWK    |   Kwacha Malauiano            |
                |   99   |    MXN    |   Peso Mexicano               |
                |   100  |    MYR    |   Ringgit Malaio              |
                |   101  |    MZN    |   Metical Moçambicano         |
                |   102  |    NAD    |   Dólar Namibiano             |
                |   103  |    NGN    |   Naira Nigeriano             |
                |   104  |    NIO    |   Córdoba Nicaraguense        |
                |   105  |    NOK    |   Coroa Norueguesa            |
                |   106  |    NPR    |   Rupia Nepalesa              |
                |   107  |    NZD    |   Dólar Neozelandês           |
                |   108  |    OMR    |   Rial Omani                  |
                |   109  |    PAB    |   Balboa Panamenho            |
                |   110  |    PEN    |   Sol Peruano                 |
                |   111  |    PGK    |   Kina Papua-Nova-Guinense    |
                |   112  |    PHP    |   Peso Filipino               |
                |   113  |    PKR    |   Rupia Paquistanesa          |
                |   114  |    PLN    |   Złoty Polonês               |
                |   115  |    PYG    |   Guarani Paraguaio           |
                |   116  |    QAR    |   Rial Catariano              |
                |   117  |    RON    |   Leu Romeno                  |
                |   118  |    RSD    |   Dinar Sérvio                |
                |   119  |    RUB    |   Rublo Russo                 |
                |   120  |    RWF    |   Franco Ruandês              |
                |   121  |    SAR    |   Rial Saudita                |
                |   122  |    SBD    |   Dólar das Ilhas Salomão     |
                |   123  |    SCR    |   Rúpia Seichel               |
                |   124  |    SDG    |   Libra Sudanesa              |
                |   125  |    SEK    |   Coroa Sueca                 |
                |   126  |    SGD    |   Dólar de Singapura          |
                |   127  |    SHP    |   Libra de Santa Helena       |
                |   128  |    SLE    |   Sierra Leonean Leones       |
                |   129  |    SLL    |   Leona de Serra Leoa         |
                |   131  |    SOS    |   Xelim Somali                |
                |   132  |    SRD    |   Dólar do Suriname           |
                |   133  |    SSP    |   Libra Sul-Sudanesa          |
                |   134  |    STN    |   Dobra de São Tomé           |
                |   135  |    SYP    |   Libra Síria                 |
                |   136  |    SZL    |   Lilangeni Suazilândia       |
                |   137  |    THB    |   Baht Tailandês              |
                |   138  |    TJS    |   Somoni Tajiquistão          |
                |   139  |    TMT    |   Manat Turcomenistão         |
                |   140  |    TND    |   Dinar Tunisiano             |
                |   141  |    TOP    |   Pa'anga de Tonga            |
                |   142  |    TRY    |   Lira Turca                  |
                |   143  |    TTD    |   Dólar de Trinidad e Tobago  |
                |   144  |    TVD    |   Dólar de Tuvalu             |
                |   145  |    TWD    |   Novo Dólar de Taiwan        |
                |   146  |    TZS    |   Xelim Tanzaniano            |
                |   147  |    UAH    |   Hryvnia Ucraniana           |
                |   148  |    UGX    |   Xelim de Uganda             |
                |   149  |    UYU    |   Peso Uruguaio               |
                |   150  |    UZS    |   Som Uzbeque                 |
                |   151  |    VES    |   Bolívar Venezuelano         |
                |   152  |    VND    |   Dong Vietnamita             |
                |   153  |    VUV    |   Vatu de Vanuatu             |
                |   154  |    WST    |   Tala de Samoa               |
                |   155  |    XAF    |   África Central CFA Franc    |
                |   156  |    XCD    |   Dólar do Caribe Oriental    |
                |   157  |    XDR    |   Direitos Especiais de Saque |
                |   158  |    XOF    |   África Ocidental CFA Franc  |
                |   159  |    XPF    |   Franco CFP                  |
                |   160  |    YER    |   Rial Iemenita               |
                |   161  |    ZAR    |   Rand Sul-Africano           |
                |   161  |    ZMW    |   Kwacha Zambiano             |
                |   163  |    ZWL    |   Dólar do Zimbábue           |
                |   999  |    XXX    |           Outros...           |
                ------------------------------------------------------
                """);
    }

    public void valor() {
        System.out.println("Digite o valor que deseja converter:");
    }

    public void moedaOrigem() {
        System.out.println("Digite - Número ou Código da moeda de Origem:");
    }

    public void moedaDestino() {
        System.out.println("Digite - Número ou Código da moeda de Destino:");
    }

    public void resultado(String valor, String moedaOrigem, String moedaDestino, String resultado) {
        System.out.println(valor + " " + moedaOrigem + " = " + resultado + " " +moedaDestino);
    }

    public void posResultado() {
        System.out.println("""
                Deseja fazer uma nova conversão?
                1-SIM 2-NÃO
                Digite a opção desejada:
                """);
    }

    public void mensagemFinal() {
        System.out.println("Finalizado com sucesso!");
    }
}
