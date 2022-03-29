package ShopDongHo.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategory implements RowMapper<Categorys>{

	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Categorys slides = new Categorys();
		slides.setMalsp(rs.getInt("malsp"));
		slides.setTenlsp(rs.getString("tenlsp"));
		slides.setMota(rs.getString("mota"));
		return slides;
	}

}
