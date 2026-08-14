package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

import static utility.DataBaseConnectivity.*;
import static utility.ReadProperties.getProperty;

public class MyConnection {
    public static void main(String[] args) throws SQLException {


        Connection connection = getConnection(getProperty("database_url"), getProperty("database_username"), getProperty("database_password"));

        // Check if connection is null
        if (connection == null) {
            System.out.println("Failed to connect to database!");
            return;
        }
        System.out.println("MySQL Connected Successfully!");

        // 2. Create statement
        Statement statement = getStatement(connection);

        // Check if statement is null
        if (statement == null) {
            System.out.println("Failed to create statement!");
            connection.close();
            return;
        }

        // 3. Execute SQL query
        String query = "SELECT * FROM emp";

        ResultSet resultSet = getResultSet(statement, query);

        // Check if resultSet is null
        if (resultSet == null) {
            System.out.println("Failed to execute query!");
            statement.close();
            connection.close();
            return;
        }

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
                Object value = resultSet.getObject(i);

                // Stream filter with proper value comparison (handles nulls)
                Stream.ofNullable(value)
                    .filter(e -> e.equals(7369))
                    .forEach(e -> System.out.println("Found: " + e));

                System.out.print(value + " | ");
            }

            System.out.println();
        }
        // 5. Close connection
        resultSet.close();
        statement.close();
        connection.close();
    }
}
