import java.util.Scanner;
import java.io.*;

class Residencia{

  
  public static void main(String[] args){
pessoa morador[]= new pessoa[100];  
 pessoa p1=new pessoa();  
int i=0;
//alxsy    007
    

 /*
    System.out.println("digite o nome de usuario!");
    Scanner sc = new Scanner(System.in);
    p1.setNome(sc.nextLine());
   
    System.out.println("digite a senha de usuario!");
*/
    Console console = System.console();
String username = console.readLine("Username: ");
char[] password = console.readPassword("Password: ");
    p1.setNome(username);
   morador[i]=p1;  

    p1.chk();
    
    //System.out.println("bem-vindo "+p1.getNome());
    
    //String input = console.readLine();
//char[] passString = cosole.readPassword();
  //  String pass = new String(passString );
    
    
    //Scanner sc2 = new Scanner(System.in);
   //p1.setSenha(sc2.nextLine());
  
    
    
   
    
    
    System.out.println(!(morador[0].getNome().equals(null))?"cheio":"vazio");
    System.out.println(morador[0].getNome());
    
    
    
    
    
    
    conta c1 = new conta();
    System.out.println("valor da conta de agua eh de "+c1.getAg());
    //System.out.println("tamanho do vetor"+morador.length);
    
    
  
    
    
    
   
  
    
    
    //System.out.println(p1.getNome());
   // System.out.println("bem-vindo(a) \""+morador[0].getNome()+"\" ao painel de configuracao");
   //  System.out.println("apenas "+p1.getQuant()+" registrada no momento");
    
  }}


