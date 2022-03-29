package ShopDongHo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopDongHo.Entity.MapperThuongHieu;
import ShopDongHo.Entity.ThuongHieu;

@Repository
public class ThuongHieuDao extends BaseDao{
	public List<ThuongHieu> GetDataThuongHieu(){
		List<ThuongHieu> list = new ArrayList<ThuongHieu>();
		String sql = "SELECT * FROM thuonghieu";
		list = _jbdcTemplate.query(sql, new MapperThuongHieu());
		return list;
	}
	
	
}
