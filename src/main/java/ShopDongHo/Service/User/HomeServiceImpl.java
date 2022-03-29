package ShopDongHo.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopDongHo.Dao.CategorysDao;
import ShopDongHo.Dao.SanPhamDao;
import ShopDongHo.Dao.SlidesDao;
import ShopDongHo.Dao.ThuongHieuDao;
import ShopDongHo.Dto.SanPhamDto;
import ShopDongHo.Entity.Categorys;
import ShopDongHo.Entity.Slides;
import ShopDongHo.Entity.ThuongHieu;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao ct;
	@Autowired
	private ThuongHieuDao thuongHieuDao;
	@Autowired
	private SanPhamDao sanphamDao;
	
	
	public List<Slides> GetDataSlide() {
		
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		// TODO Auto-generated method stub
		return ct.GetDataCategorys();
	}
	public List<ThuongHieu> GetDataThuongHieu() {
		// TODO Auto-generated method stub
		return thuongHieuDao.GetDataThuongHieu();
	}

	@Override
	public List<SanPhamDto> GetDataTatCaSanPham() {
		// TODO Auto-generated method stub
		return sanphamDao.GetDataTatCaSanPham();
	}
	public List<SanPhamDto> GetDataSanPhamMoi() {
		// TODO Auto-generated method stub
		return sanphamDao.GetDataSanPhamMoi();
	}
	public List<SanPhamDto> GetDataSanPhamNoiBat() {
		// TODO Auto-generated method stub
		return sanphamDao.GetDataSanPhamNoiBat();
	}

}
