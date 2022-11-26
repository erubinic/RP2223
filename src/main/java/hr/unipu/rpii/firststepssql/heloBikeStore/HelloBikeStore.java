package hr.unipu.rpii.firststepssql.heloBikeStore;

import java.sql.*;

public class HelloBikeStore {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DbConfig.url)) {
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM production.brands";

            ResultSet result = statement.executeQuery(sql);

            int rowCounter = 0;
            while (result.next()) {
                int id = result.getInt(1); // get by index
                String brandName = result.getString("brand_name"); // get by column name

                String output = "Result form row %d -> BrandId: %d, BrandName:%s";
                System.out.println(String.format(output, ++rowCounter, id, brandName));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
