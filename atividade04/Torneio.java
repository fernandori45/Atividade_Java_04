import javax.swing.JOptionPane;

public class Torneio {
    private String nome;
    private int idade;

    public Torneio(String n, int i){
        nome = n;
        idade = i;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String verificaCategoria(){
        String categoria;
        if (idade >= 5 && idade <=7) { 
            categoria = "Infantil";
        }
        else{
            if (idade >= 8 && idade <= 10) {
                categoria = "Juvenil";
            }
            else{
                if (idade >= 11 && idade <= 15) {
                    categoria = "Adolescente";
                }
                else{
                    if (idade >= 16 && idade <= 30) {
                        categoria = "Adulto";
                    }
                    else{
                        categoria = "Senior";
                    }
                }
            }
        }
        return categoria;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nCategoria: " + verificaCategoria());
    }
    
}