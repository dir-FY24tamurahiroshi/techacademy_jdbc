package dbSample.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManeger {
    //  データベース接続と結果取得のための変数
    private static Connection con;
    
    
    public static Connection gettConnection() throws SQLException,ClassNotFoundException{
        // 1.   ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.   DBと接続する
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
            "root",
            "SKTT1Fakerisgod"
         );
        
        
        return con;
    }


    public static void close() {
        // 7.   接続を閉じる
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 }
