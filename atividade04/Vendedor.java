import javax.swing.JOptionPane;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    float desconto;
    float comissao;

    public Vendedor (float v, float s, String n, int f){
        vendas = v;
        salario = s;
        nome = n;
        falta = f;
    }

    public void setVendas(float v){
        this.vendas = v;
    }

    public float getVendas(){
        return vendas;
    }

    public void setSalario(float s){
        this.salario = s;
    }

    public float getSalario(){
        return salario;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setFalta(int f){
        this.falta = f;
    }

    public int getFalta(){
        return falta;
    }

    public float calcularComissao(){
        if (vendas >= 1000 && vendas < 2000) {
            comissao = vendas * 10/100;
        }
        else{
            if (vendas >= 2000) {
                comissao = vendas * 15/100;
            }
        }
        return comissao;
    }

    public void descontoFalta(){
        desconto = (salario/30)*falta;
    }

    public void calcularSalario(){
        salario = (salario + comissao - desconto);
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nComissão: " + comissao + "\nDesconto: " + desconto + "\nRecebeu o salário: " + salario);
    }
    
}
