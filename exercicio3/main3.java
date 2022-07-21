package exercicio3;

public class main3 {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = quadrilateroAtualizado.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = quadrilateroAtualizado.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = quadrilateroAtualizado.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
