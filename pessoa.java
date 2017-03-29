import java.util.Scanner;
public class pessoa{
  
   int quant;
  String nome,senha;
  
  
  
  
  public void setSenha(String x){
    senha=x;
  }
  
  
  public String getSenha(){
    
   return senha; 
  }
  
  
  
  
  
  public int getQuant(){
 return quant++;
  }
  
  
  public void setNome(String x){
    nome=x;
    ++quant;
    
  }
  
  
  public String getNome(){
    return nome;
    
  }
  
  
  
  
  
 public void getMember(){
  

}
    
    
  
  
  
  
}