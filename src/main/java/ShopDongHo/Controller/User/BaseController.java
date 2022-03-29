package ShopDongHo.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ShopDongHo.Service.User.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("slides",_homeService.GetDataSlide());
		_mvShare.addObject("thuongHieu",_homeService.GetDataThuongHieu());
		_mvShare.addObject("loaiSanpham",_homeService.GetDataCategorys());
		return _mvShare;
	} 
	
}
