package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
//        final String url = "jdbc:mysql://localhost:33066?verifyServerCertificate=false&useSSL=true";
//        final String usuario = "admin";
//        final String senha = "admin";
//
//        Connection conexao = DriverManager
//                .getConnection(url, usuario, senha);

        Connection conexao = FabricaConexao.getConexao();

        Statement stmt = conexao.createStatement();

        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
