package ShopDongHo.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlide implements RowMapper<Slides>{

	@Override
	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Slides slides = new Slides();
		slides.setId(rs.getInt("id"));
		slides.setCaption(rs.getString("caption"));
		slides.setContent(rs.getString("content"));
		slides.setImg(rs.getString("img"));
		return slides;
	}

}
