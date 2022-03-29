package ShopDongHo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ShopDongHo.Dto.SanPhamDto;
import ShopDongHo.Dto.SanPhamDtoMapper;
import ShopDongHo.Entity.Categorys;
import ShopDongHo.Entity.MapperCategory;

@Repository
public class SanPhamDao {
	@Autowired
	public JdbcTemplate _jbdcTemplate;

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.masp, ");
		sql.append("p.tensp, ");
		sql.append("p.giaban, ");
		sql.append("p.soluong, ");
		sql.append("p.math, ");
		sql.append("p.mota, ");
		sql.append("p.malsp, ");
		sql.append("p.giamgia, ");
		sql.append("p.noibat, ");
		sql.append("c.mahinh, ");
		sql.append("c.hinhanh ");
		sql.append("FROM ");
		sql.append("sanpham AS p ");
		sql.append("INNER JOIN ");
		sql.append("hinhanh as c ");
		sql.append("ON p.masp = c.masp ");
	
		return sql;
	}
	private String SqlTatCaSanPham() {

		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.masp, c.masp ");
		sql.append("ORDER BY p.masp DESC");	
		return sql.toString();
	}
	private String SqlSanPhamMoi() {

		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.masp, c.masp ");
		sql.append("ORDER BY p.masp DESC ");
		sql.append("LIMIT 5");
		
		return sql.toString();
	}
	private String SqlSanPhamNoiBat() {

		StringBuffer sql = SqlString();
		sql.append("WHERE p.noibat = true ");
		sql.append("GROUP BY p.masp, c.masp ");
		sql.append("ORDER BY p.masp DESC ");
		sql.append("LIMIT 5");
		
		return sql.toString();
	}

	public List<SanPhamDto> GetDataTatCaSanPham() {
		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = SqlTatCaSanPham() ;
		list = _jbdcTemplate.query(sql, new SanPhamDtoMapper());
		return list;
	}
	public List<SanPhamDto> GetDataSanPhamMoi() {
		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = SqlSanPhamMoi() ;
		list = _jbdcTemplate.query(sql, new SanPhamDtoMapper());
		return list;
	}
	public List<SanPhamDto> GetDataSanPhamNoiBat() {
		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = SqlSanPhamNoiBat() ;
		list = _jbdcTemplate.query(sql, new SanPhamDtoMapper());
		return list;
	}
}