package Modulo_15;

import java.sql.*;
import java.util.Scanner;

public class DesafioAtualizar {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);


        Connection conexao = FabricaConexao.getConexao();


        String sqlSelecionar = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String sqlAtualizar = "UPDATE pessoas SET nome ? WHERE codigo = ?";

        System.out.print("Selecione o código da pessoa: ");
        int cod = entrada.nextInt();

        PreparedStatement stmtSelecionar = conexao.prepareStatement(sqlSelecionar);
        stmtSelecionar.setInt(1, cod);
        ResultSet selecionada = stmtSelecionar.executeQuery();

        if(selecionada.next()){

            Pessoa p = new Pessoa(selecionada.getInt(1), selecionada.getString(2));
            System.out.println("A pessoa selecionada é: " + p.getNome());

            entrada.nextLine();

            System.out.print("Novo nome: ");
            String novoNome = entrada.nextLine();

            stmtSelecionar.close();

            stmtSelecionar = conexao.prepareStatement(sqlAtualizar);
            stmtSelecionar.setString(1, novoNome);
            stmtSelecionar.setInt(2, cod);
            stmtSelecionar.execute();

            System.out.println("Nome atualizado com sucesso.");
        }

        conexao.close();
        entrada.close();
    }
}
