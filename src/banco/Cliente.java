
package banco;

public class Cliente extends Pessoa {
   int codCliente;
   double credito;
   Banco banco;
   
   public void setCodCliente(int codCliente){
   this.codCliente = codCliente;
   }
   public int getCodCliente(){
   return codCliente;
   }
   public void setCredito(double credito){
   this.credito = credito;
   }
   public Double getCredito(){
   return credito;
   }
   public void setBanco(Banco banco){
   this.banco = banco;
   }
   public Banco getBanco(){
   return banco;
   }
}
