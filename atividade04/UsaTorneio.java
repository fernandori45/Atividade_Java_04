
public class UsaTorneio {
    public static void main(String[] args) {
        Torneio t1 = new Torneio(null, 0);

        t1.setNome("Fernando");
        t1.setIdade(25);
        t1.verificaCategoria();
        t1.imprimeDados();
    }
}
