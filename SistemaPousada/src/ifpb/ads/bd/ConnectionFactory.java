package ifpb.ads.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public  class ConnectionFactory {
    private static final String USER = "postgres";
    private static final String PASS = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/db_pousada";
    
    public Connection initConection(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão. " + ex.getMessage());
        }
    }
    
    public void finallyConnection(Connection con, PreparedStatement pst){
        if(con != null && pst != null){
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão. " + ex.getMessage());
            }
            
        }
    }
    
    public void finallyConnection(Connection con, PreparedStatement pst, ResultSet rs){
        finallyConnection(con, pst);
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão. " + ex.getMessage());
            }
            
        }
    }
    
    private ConnectionFactory(){
        
    }
    
    private static volatile ConnectionFactory objConnection;
    
    public static ConnectionFactory returnInstance(){
        if(objConnection == null){
            synchronized(ConnectionFactory.class){
                if(objConnection == null){
                    objConnection = new ConnectionFactory();
                }
            }
        }
        return objConnection;
    }
}
