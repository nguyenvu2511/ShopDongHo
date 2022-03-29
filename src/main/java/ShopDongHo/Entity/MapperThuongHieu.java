package ShopDongHo.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThuongHieu implements RowMapper<ThuongHieu>{

	@Override
	public ThuongHieu mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ThuongHieu thuongHieu = new ThuongHieu();
		thuongHieu.setMath(rs.getInt("math"));
		thuongHieu.setTenth(rs.getString("tenth"));
		thuongHieu.setHinhanh(rs.getString("hinhanh"));
		thuongHieu.setMota(rs.getString("mota"));
		return thuongHieu;
	}

}
