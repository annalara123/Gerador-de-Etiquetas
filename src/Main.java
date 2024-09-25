import model.GerarEtiquetas;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("REFRIGERANTE DE CEREJA", 4.0, 32.0, "72843739");
        String etiquetaZPL1 = GerarEtiquetas.gerarEtiquetas(produto1);
        System.out.println(etiquetaZPL1);

        Produto produto2 = new Produto("CAFE DE CARAMELO", 7.0, 56.0, "3928432034");
        String etiquetaZPL2 = GerarEtiquetas.gerarEtiquetas(produto2);
        System.out.println(etiquetaZPL2);
    }
}
