package objetos;

public class Celular {

    String marca;
    String modelo;
    int bateria = 100; // Bateria inicia com 100%

    public void usarCelular() {
        if (bateria <= 0) {
            System.out.println("O celular descarregou! Carregue para voltar a usar.");
        } else {
            bateria -= 10;
            if (bateria < 0) {
                bateria = 0;
            }
            System.out.println("Você usou o celular. Bateria atual: " + bateria + "%");
        }
    }

    public void carregar() {
        if (bateria == 100) {
            System.out.println("A bateria já está totalmente carregada (100%)!");
        } else {
            bateria = 100;
            System.out.println("Celular carregado com sucesso! Bateria: 100%");
        }
    }

    public void exibirBateria() {
        System.out.println("\n--- STATUS DA BATERIA ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Nível da Bateria: " + bateria + "%");
        System.out.println("-------------------------\n");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}