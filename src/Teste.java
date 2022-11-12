package src;

public class Teste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}
