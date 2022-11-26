package hr.unipu.rpii.firststepssql.hellojdbctemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandRowMapper implements RowMapper {
    @Override
    public Brand mapRow(ResultSet rs, int rowNum) throws SQLException {
        Brand brand = new Brand();
        brand.setId(rs.getInt("brand_id"));
        brand.setName(rs.getString("brand_name"));

        return brand;
    }
}
