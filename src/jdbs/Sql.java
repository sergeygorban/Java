package jdbs;

import java.sql.*;

public class Sql {

    private static final String SQL_SELECT = "select * from sakila.customer";
    private static final String SQL_INSERT =
            "INSERT INTO `sakila`.`customer`(customer_id, store_id, first_name, last_name, email, address_id, active, create_date, last_update)" +
                    "VALUES(?,?,?,?,?,?,?,?,?)";


    public static void main(String[] args) {

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306","root", "19867150")){

            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select * from sakila.customer");
            res.next();
            System.out.println(res.getDate("create_date"));
            System.out.println(res.getString("customer_id"));

            ResultSet statement = con.prepareStatement(SQL_SELECT).executeQuery();
            statement.next();
            System.out.println(statement.getString("create_date"));

            PreparedStatement st1 = con.prepareStatement(SQL_INSERT);
            st1.setInt(1,755);
            st1.setInt(2,2);
            st1.setString(3,"Test");
            st1.setString(4,"Test_1");
            st1.setString(5,null);
            st1.setInt(6,599);
            st1.setInt(7,1);
            st1.setString(8,null);
            st1.setString(9,null);

            st1.executeUpdate();





        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
