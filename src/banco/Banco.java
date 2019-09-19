
package banco;

public class Banco {
    String nome;
    int codBanco;
    Funcionario funcionario;
    Cliente cliente;
    
    public void setNome(String nome){
    this.nome = nome;
    }
    public String getNome(){
    return nome;
    }
    public void setCodBanco(int codBanco){
    this.codBanco = codBanco;
    }
    public int getCodBanco(){
    return codBanco;
    }
    public void setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
    }
    public Funcionario getFuncionario(){
    return funcionario;
    }
    public void setCliente(Cliente cliente){
    this.cliente = cliente;
    }
    public Cliente getCliente(){
    return cliente;
    }
}
