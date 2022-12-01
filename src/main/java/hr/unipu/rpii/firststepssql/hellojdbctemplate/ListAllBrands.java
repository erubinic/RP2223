package hr.unipu.rpii.firststepssql.hellojdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.List;

public class ListAllBrands {
    public static void main(String[] args) {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        dataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=BikeStores;encrypt=false;");
        dataSource.setUsername("rpuser");
        dataSource.setPassword("1234");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "SELECT * FROM production.brands";

        List<Brand> allBrands = jdbcTemplate.query(sql, new BrandRowMapper());

        for (Brand brand : allBrands) {
            System.out.println(brand);
        }
    }
}
