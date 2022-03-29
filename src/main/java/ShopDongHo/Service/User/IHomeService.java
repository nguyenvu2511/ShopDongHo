package ShopDongHo.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopDongHo.Dto.SanPhamDto;
import ShopDongHo.Entity.Categorys;
import ShopDongHo.Entity.Slides;
import ShopDongHo.Entity.ThuongHieu;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	@Autowired
	public List<Categorys> GetDataCategorys();
	@Autowired
	public List<ThuongHieu> GetDataThuongHieu();
	public List<SanPhamDto> GetDataTatCaSanPham();
	public List<SanPhamDto> GetDataSanPhamMoi();
	public List<SanPhamDto> GetDataSanPhamNoiBat();
	
}
