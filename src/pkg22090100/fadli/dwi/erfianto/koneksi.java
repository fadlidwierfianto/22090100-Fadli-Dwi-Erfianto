package pkg22090100.fadli.dwi.erfianto;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
        public static Connection sambung_ke_db(){
    try{
    MysqlDataSource M = new MysqlDataSource();
    M.setUser("root");
    M.setPassword("");
    M.setDatabaseName("project_1");
    M.setServerName("localhost");
    M.setPortNumber(3306);
    M.setServerTimezone("Asia/Jakarta");
    
    Connection C = M.getConnection();
    System.out.println("SUKSES TERHUBUNG KE DATABASE");
    return C;
    }catch (SQLException e){
    System.out.println("GAGAL TERHUBUNG KE DATABASE");
    System.out.println("Error: " + e.getMessage());
    }
    return null;
    }
    
}
