import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Primeiro exemplo
            Carro carro1 = new Carro();
            carro1.setCombustivel("Gasolina");
            carro1.setPeso(1200.50);
            carro1.setMarca("Toyota");
            carro1.setAnoFabricacao(2020);

            //Segundo exemplo
            Carro carro2 = new Carro();
            System.out.println("qual de combustivel");
            String x = scanner.next();
            carro2.setCombustivel(x);

            System.out.println("Qual o peso");
            double c = scanner.nextDouble();
            carro2.setPeso(c);

            System.out.println("Qual a marca");
            String v = scanner.next();
            carro2.setMarca(v);

            System.out.println("que ano o  carro");
            int b = scanner.nextInt();
            carro2.setAnoFabricacao(b);

            System.out.println("Carro 1");
            System.out.println("Combustívão: " + carro1.getCombustivel());
            System.out.println("Peso: " + carro1.getPeso());
            System.out.println("Marca: " + carro1.getMarca());
            System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());

            System.out.println("Carro 2");
            System.out.println("Combustívão: " + carro2.getCombustivel());
            System.out.println("Peso: " + carro2.getPeso());
            System.out.println("Marca: " + carro2.getMarca());
            System.out.println("Ano de Fabricação: " + carro2.getAnoFabricacao());

        }
    }