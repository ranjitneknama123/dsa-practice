package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static utility.DataBaseConnectivity.*;
import static utility.ReadProperties.getProperty;

public class MyConnection {
    public static void main(String[] args) throws SQLException {


        Connection connection = getConnection(getProperty("database_url"), getProperty("database_username"), getProperty("database_password"));
        System.out.println("MySQL Connected Successfully!");

        // 2. Create statement
        Statement statement = getStatement(connection);

        // 3. Execute SQL query
        String query = "SELECT * FROM emp";

        ResultSet resultSet = getResultSet(statement, query);

        /*// 4. Print all rows and columns
        while (resultSet.next()) {

            System.out.println(
                    resultSet.getInt("empno") + " | " +
                            resultSet.getString("ename") + " | " +
                            resultSet.getString("job") + " | " +
                            resultSet.getObject("mgr") + " | " +
                            resultSet.getDate("hiredate") + " | " +
                            resultSet.getBigDecimal("sal") + " | " +
                            resultSet.getObject("comm") + " | " +
                            resultSet.getInt("deptno")
            );
        }*/


        // print without column names
        /*ResultSet resultSet =
                statement.executeQuery("SELECT * FROM emp");*/

        int columnCount =
                resultSet.getMetaData().getColumnCount();

        while (resultSet.next()) {

            for (int i = 1; i <= columnCount; i++) {

                System.out.print(
                        resultSet.getObject(i) + " | "
                );
            }

            System.out.println();
        }
        // 5. Close connection
        resultSet.close();
        statement.close();
        connection.close();
    }
}
