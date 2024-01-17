package addressbook.Tests;

import addressbook.model.GroupData;
import addressbook.model.Groups;
import org.junit.Test;

import java.sql.*;

import static javax.swing.UIManager.getInt;


public class DbConnectionTest {

    //Инициализация драйвера
    public class LoadDriver {
        public static void main(String[] args) {
            try {


                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            } catch (Exception ex) {

            }
        }
    }

    @Test

//Тест что БД подключена
    public void testDbConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?user=root&password=");
            //Получение информации из БД
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select group_id,group_name,group_header,group_footer from group_list ");

            //Получение информации из столбцов
            Groups groups = new Groups();
            while (rs.next()) {
                groups.add(new GroupData().withId(rs.getInt("group_id")).withName(rs.getString("group_name"))
                        .withHeader(rs.getString("group_header")).withFooter(rs.getString("group_footer")));
            }
            //Завершение работы с БД
            rs.close();
            st.close();
            conn.close();

            System.out.println(groups);

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
