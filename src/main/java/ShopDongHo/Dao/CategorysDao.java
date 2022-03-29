package ShopDongHo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopDongHo.Entity.Categorys;
import ShopDongHo.Entity.MapperCategory;

@Repository
public class CategorysDao extends BaseDao{
	
	public List<Categorys> GetDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM loaisanpham";
		list = _jbdcTemplate.query(sql, new MapperCategory());
		return list;
	}
	
	
}
