
package banco;

public class Principal {

    public static void main(String[] args) {
        Banco itau = new Banco();
        Funcionario devisson = new Funcionario();
        Cliente rf = new Cliente();
        itau.setNome("itau");
        itau.setCodBanco(1209);
        itau.setCliente(rf);
        itau.setFuncionario(devisson);
        devisson.setNome("devisson");
        devisson.setIdade(21);
        devisson.setCpf("12587456");
        devisson.setSetor("Caixa");
        devisson.setCodFuncionario(1234);
        devisson.setBanco(itau);
        rf.setNome("Ramalho");
        rf.setCpf("218712987");
        rf.setIdade(18);
        rf.setCredito(300.0);
        rf.setCodCliente(55555);
        rf.setBanco(itau);
        
        System.out.println(rf.getNome());
        System.out.println(rf.getIdade());
        System.out.println(rf.getCpf());
        System.out.println(rf.getCredito());
        System.out.println(rf.getCodCliente());
        System.out.println(rf.getBanco().getNome());
        System.out.println("----------------");
        
        System.out.println(devisson.getNome());
        System.out.println(devisson.getIdade());
        System.out.println(devisson.getCpf());
        System.out.println(devisson.getSetor());
        System.out.println(devisson.getCodFuncionario());
        System.out.println(devisson.getBanco().getNome());
        System.out.println("-------------------");
        
        System.out.println(itau.getNome());
        System.out.println(itau.getCodBanco());
        System.out.println(itau.getCliente().getNome());
        System.out.println(itau.getCliente().getCpf());
        System.out.println(itau.getFuncionario().getNome());
        System.out.println(itau.getFuncionario().getCpf());
    }
    
}
