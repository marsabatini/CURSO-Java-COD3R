package Modulo_15;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        System.out.println(dao.incluir(sql, "Jo�o"));
        System.out.println(dao.incluir(sql, "Newton"));
        System.out.println(dao.incluir(sql, "Jos�"));

        dao.close();
    }
}
