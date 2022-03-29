<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	magrin-left: 10px; display : none;
	border-radius: 5px;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	min-height:200px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	padding: 12px 16px;
	z-index: 1;
	
	display: none;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>

<header class="section header">
	<div class="container">
		<div class="row">
			<div class="pull-left col-md-4 header-left">
				<p class="fas fa-map-marker-alt pull-left"></p>
				<p class="pull-right">331 Nguyen Dinh Chieu St., Ward 5, Dist.3,
					HCMC</p>
			</div>
			<div class="pull-right col-md-8 header-right">
				<p class="col-md-6 col-md-offset-2 pull-left">Call Us: 1800 0091
					| 028 3833 9999</p>
				<div class="col-md-4 pull-right">
					<input class="form-control" type="search" name="search"
						placeholder="Tìm kiếm" />
				</div>

			</div>
		</div>
	</div>

</header>
<div class="container">
	<div class="row col md-3 col-md-offset-5 logo">
		<img src="<c:url value="/assets/user/imgs/logo-luxury.png" />"
			height="150" width="160" />
	</div>
	<div class="row col-md-12 menu">
		<div class="a-menu pull-left dropdown">
			<a href="#">
				<p>THƯƠNG HIỆU</p>
			</a>
			
				<div class="dropdown-content">
				<c:forEach var="item" items="${thuongHieu }">
					<a href="#"><p>${item.tenth}</p></a>
					</c:forEach>
				</div>
			
		</div>
		<div class="a-menu pull-left dropdown">
			<a href="#">
				<p>ĐỒNG HỒ</p>
			</a>
			<div class="dropdown-content">
				<c:forEach var="item" items="${loaiSanpham }">
					<a href="#"><p>${item.tenlsp}</p></a>
					</c:forEach>
				</div>


		</div>
		<div class="a-menu pull-left">
			<label> <a href="#">
					<p>TẤT CẢ SẢN PHẨM</p>
			</a>
			</label>
		</div>
		<div class="col-md-2 a-menu pull-left">
			<label> <a href="#">
					<p>SẢN PHẨM HOT</p>
			</a>
			</label>
		</div>
		<div class="col-md-1 a-menu pull-left">
			<label> <a href="#">
					<p>SALE</p>
			</a>
			</label>
		</div>
		<div class="col-md-2 a-menu pull-left">
			<label> <a href="#">
					<p>TIN TỨC</p>
			</a>
			</label>
		</div>
		<div class="col-md-2 a-menu pull-left">
			<label> <a href="#">
					<p>LIÊN HỆ</p>
			</a>
			</label>
		</div>


	</div>

</div>

