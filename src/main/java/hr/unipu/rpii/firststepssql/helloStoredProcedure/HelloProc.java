package hr.unipu.rpii.firststepssql.helloStoredProcedure;

import hr.unipu.rpii.firststepssql.heloBikeStore.DbConfig;

import java.sql.*;

/**
 * Before running ensure you have created stored procedure on database:
 *
 * CREATE PROCEDURE GetShippedOrdersByCustomerId @CustomerId INT
 * AS
 *    select count(order_id) from sales.orders
 *    where shipped_date is not null
 *    and customer_id = @CustomerId
 * GO
 *
 * Test it with:
 *     EXEC GetShippedOrdersByCustomerId @CustomerId=1
 */
public class HelloProc {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DbConfig.url)) {

            String sql = "exec GetShippedOrdersByCustomerId @CustomerId=?";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            int customerId = 5;
            preparedStatement.setInt(1, customerId);


            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                int shippedOrdersNumber = result.getInt(1);

                System.out.println("Shipped order for one customer: " + shippedOrdersNumber);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
