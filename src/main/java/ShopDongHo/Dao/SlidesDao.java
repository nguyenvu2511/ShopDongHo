package ShopDongHo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopDongHo.Entity.MapperSlide;
import ShopDongHo.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao {

	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM sildes";
		list = _jbdcTemplate.query(sql, new MapperSlide());
		return list;
	}
	
	
}
