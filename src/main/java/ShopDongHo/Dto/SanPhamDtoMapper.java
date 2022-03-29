package ShopDongHo.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SanPhamDtoMapper implements RowMapper<SanPhamDto>{

	@Override
	public SanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPhamDto sanpham = new SanPhamDto();
		sanpham.setMasp(rs.getInt("masp"));
		sanpham.setTensp(rs.getString("tensp"));
		sanpham.setGiaban(rs.getDouble("giaban"));
		sanpham.setSoluong(rs.getInt("soluong"));
		sanpham.setMath(rs.getInt("math"));
		sanpham.setMota(rs.getString("mota"));
		sanpham.setMalsp(rs.getInt("malsp"));
		sanpham.setGiamgia(rs.getInt("giamgia"));
		sanpham.setMahinh(rs.getInt("mahinh"));
		sanpham.setHinhanh(rs.getString("hinhanh"));
		sanpham.setNoibat(rs.getInt("noibat"));
		return sanpham;
	}

}
