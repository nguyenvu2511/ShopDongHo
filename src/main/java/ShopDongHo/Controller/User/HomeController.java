package ShopDongHo.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ShopDongHo.Service.User.HomeServiceImpl;

@Controller
public class HomeController extends BaseController{
	@RequestMapping( value = {"/","trang-chu","home"}, method = RequestMethod.GET)
	public ModelAndView Index() {
	
		_mvShare.addObject("slides",_homeService.GetDataSlide());
		_mvShare.addObject("thuongHieu",_homeService.GetDataThuongHieu());
		_mvShare.addObject("loaiSanpham",_homeService.GetDataCategorys());
		_mvShare.addObject("sanPham",_homeService.GetDataTatCaSanPham());
		_mvShare.addObject("sanPhamMoi",_homeService.GetDataSanPhamMoi());
		_mvShare.addObject("sanPhamNoiBat",_homeService.GetDataSanPhamNoiBat());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	@RequestMapping( value = {"/product"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
	@RequestMapping( value = {"/chi-tiet-san-pham"})
	public ModelAndView DetailsProduct() {
		ModelAndView mv = new ModelAndView("user/chi-tiet-san-pham");
		return mv;
	}
}
