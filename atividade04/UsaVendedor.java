public class UsaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(0, 0, null, 0);

        v1.setNome("Fernando");
        v1.setVendas(2000);
        v1.setSalario(1000);
        v1.setFalta(3);

        v1.descontoFalta();
        v1.calcularComissao();
        v1.calcularSalario();

        v1.imprimeDados();

        

    }
}
