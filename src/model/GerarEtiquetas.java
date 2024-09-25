package model;

public class GerarEtiquetas {
    public static String gerarEtiquetas(Produto produto) {
        return "^XA\n" +
                "^CF0,60\n" +
                "^FO50,50^FD" + produto.getDescricao() + "^FS\n" +
                "^CF0,50\n" +
                "^FO50,200^FDLata R$" + String.format("%.2f", produto.getPrecoLata()) + "^FS\n" +
                "^FO50,280^FDCaixa R$" + String.format("%.2f", produto.getPrecoCaixa()) + "^FS\n" +
                "^BY5,2,270\n" +
                "^FO100,450^BC^FD" + produto.getCodigoBarras() + "^FS\n" +
                "^XZ";
    }
}
