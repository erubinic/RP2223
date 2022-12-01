package hr.unipu.rpii.firststepssql.heloBikeStore;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class HelloBikeStore2 {
    public static void main(String[] args) {
        SQLServerDataSource sqlDs = new SQLServerDataSource();
        sqlDs.setIntegratedSecurity(false);
        sqlDs.setUser("rpuser");
        sqlDs.setPassword("1234");
        sqlDs.setDatabaseName("BikeStores");
        sqlDs.setPortNumber(1433);
        sqlDs.setEncrypt(false);

        try (Connection conn = sqlDs.getConnection()) {
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
