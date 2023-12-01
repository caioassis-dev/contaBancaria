package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {
    private Connection conexao;

    public conexaoBanco(String nomeBanco, String usuario, String senha) {
        try {
            conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + "main", "guilherme_bahia", "mZAnq7261fj#");
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            throw new IllegalStateException("Não foi possível conectar ao banco de dados", e);
        }
    }

    public Connection getConexao() {
        return conexao;
    }
}