<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<title>Trang chủ</title>
<div class=" w3-display-container">
	<c:forEach var="item" items="${slides }">
		<img class="mySlides"
			src="<c:url value="/assets/user/imgs/${item.img }" />" height="500"
			width="100%" />
	</c:forEach>
</div>


<div class="container">
	<div class="brands-heading">
		<a href="#" target="_blank">
			<h1>
				<i class="strike"></i> ĐỒNG HỒ CHÍNH HÃNG CAO CẤP <i class="strike"></i>
			</h1>

		</a> <span>Chúng tôi cam kết mang lại những giá trị cao nhất, chế
			độ hậu mãi tốt nhất &amp; đồng hồ chính hãng cho khách hàng khi đến
			với SHOP của chúng tôi!</span>
		<div class="row">

			<img src="<c:url value="/assets/user/imgs/chedobaohanh.png" />"
				height="100%" width="100%" />
		</div>
	</div>
	<div class="brands-heading">
		<a href="#" target="_blank">
			<h1>
				<i class="strike"></i> THƯƠNG HIỆU ĐỒNG HỒ <i class="strike"></i>
			</h1>
		</a>
		<div class="row">

			<c:forEach var="item" items="${thuongHieu }">
				<a href="#"> <img class="col-md-2 pull-left"
					src="<c:url value="/assets/user/imgs/thuonghieu/${item.hinhanh }" />"
					height="100" width="60" />
				</a>
			</c:forEach>
		</div>
		<div class="col-md-2 col-md-offset-5 xem-tat-ca">
			<button type="button" class="btn btn-default col-md-12">XEM
				TẤT CẢ</button>
		</div>
	</div>
	<div class="col-md-12 noi-bat">
		<h1 class="col-md-12 noi-bat-title">
			<i class="strike"></i> NỔI BẬT <i class="strike"></i>
		</h1>
		<div class="row anh-noi-bat">
		<c:forEach var="item" items="${sanPhamNoiBat }">
			<div class=" sp-noibat img-thumbnail ">
				<a href="#" target="_blank"><img
							src="<c:url value="/assets/user/imgs/sanpham/${item.hinhanh }" />"
							height="210" width="245" /> </a>
					<div class="clock-link">
							<a href="/ShopDongHo/chi-tiet-san-pham/${item.masp }">

								<p>${item.tensp}</p>
							</a>
							<div class="clock-price">

								<b><fmt:formatNumber type="number" maxIntegerDigits="9"
										value="${item.giaban}" /> VNĐ</b>
							</div>
							<div class="clock-button">
								<button class="btn adjust btn-default btn-float btn-120"
									type="button">CHI TIẾT</button>
								<button class="btn adjust btn-default btn-float btn-120"
									type="button">ĐẶT HÀNG</button>

							</div>
						</div>
			</div>
		</c:forEach>

		</div>
	</div>
	<div class="row kien-thuc-dong-ho">
		<a href="#"><i>KIẾN THỨC ĐỒNG HỒ </i><i
			class="fas fa-arrow-alt-circle-right"></i></a>
	</div>

	<div class="san-pham-moi">
		<div class="container">
			<h1 class="col-md-12">
				<i class="strike"></i> SẢN PHẨM MỚI <i class="strike"></i>
			</h1>
			<div class="clock-list ">

				<c:forEach var="item" items="${sanPhamMoi }">
					<div class="col-md-3 pull-left clock ">
						<img
							src="<c:url value="/assets/user/imgs/sanpham/${item.hinhanh }" />"
							height="210" width="245" />
						<div class="clock-link">
							<a href="/ShopDongHo/chi-tiet-san-pham/${item.masp }">

								<p>${item.tensp}</p>
							</a>
							<div class="clock-price">

								<b><fmt:formatNumber type="number" maxIntegerDigits="9"
										value="${item.giaban}" /> VNĐ</b>
							</div>
							<div class="clock-button">
								<button class="btn adjust btn-default btn-float btn-120"
									type="button">CHI TIẾT</button>
								<button class="btn adjust btn-default btn-float btn-120"
									type="button">ĐẶT HÀNG</button>

							</div>
						</div>


					</div>
				</c:forEach>

			</div>
		</div>
	</div>
	<br />
	<div class="video-quang-cao">
		<div class="container">
			<div class="col-md-8 col-md-offset-2 video">
				<iframe width=100% height="400"
					src="https://www.youtube.com/embed/lk3GS91w3gw" frameborder="0"
					allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen></iframe>
			</div>
			<div class="col-md-2 col-md-offset-5 xem-tat-ca">
				<button type="button" class="btn btn-default col-md-12">LIÊN
					HỆ</button>
			</div>
		</div>
	</div>
</div>
<script>
	let slideIndex = 0;
	showSlides();

	function showSlides() {
		let i;
		let slides = document.getElementsByClassName("mySlides");
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";
		}
		slideIndex++;
		if (slideIndex > slides.length) {
			slideIndex = 1
		}
		slides[slideIndex - 1].style.display = "block";
		setTimeout(showSlides, 2000); // Change image every 2 seconds
	}
</script>