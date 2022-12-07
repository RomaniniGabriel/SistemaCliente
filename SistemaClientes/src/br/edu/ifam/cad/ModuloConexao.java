package br.edu.ifam.cad;
import java.sql.*; //o * indica que todas as ferramentas da biblioteca "java.sql" serão importadas
public class ModuloConexao {
    
    public static Connection conector(){  //O método conector é o responsável por estabelecer a conexão entre o java e o Banco de Dados
        java.sql.Connection conexao = null;  //"conexao" é um objeto. "Connection" é uma classe
        //O obejto precisa estar vazio para receber valores/conexões.
        
        String driver = "com.mysql.cj.jdbc.Driver"; //A variável "driver" aponta para o driver mysql-connector
        
        String url = "jdbc:mysql://localhost:3306/dbsistema"; //Endereço local do XAMPP (servidor local)
        
        String user = "root"; //Usuário do xampp (Usuário "Deus"/god)
        
        String password = ""; //Senha do usuário do XAMPP, que está em branco.
        
        //Acima foram criadas 4 variáveis.
        
        
        try {
            
            Class.forName(driver); //Essa linha vai executar o driver criado na linha 9.
            conexao = DriverManager.getConnection(url, user, password); //Captura as informações de url, usuário e senha do Xampp
            return conexao; //Retorna a conexão.
            
        } catch (Exception e) {
            
            //Os comandos abaixo servem de apoio para esclarecer o erro.
            
            System.out.println(e);
            return null;
            
        }
        
    }
}
