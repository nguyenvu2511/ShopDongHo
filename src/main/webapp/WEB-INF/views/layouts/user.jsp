<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title><decorator:title default="Master-layout"/></title>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap"
	rel="stylesheet">
	<link href="<c:url value="/assets/user/lib/fontawesome/css/all.css" />" rel="stylesheet">
	<link href="<c:url value="/assets/user/css/chi-tiet.css" />" rel="stylesheet">
	  <link href="<c:url value="/assets/user/css/dong-ho-nam.css" />" rel="stylesheet">
 <link href="<c:url value="/assets/user/css/dongho.css" />" rel="stylesheet">
   <link href="<c:url value="/assets/user/css/home.css" />" rel="stylesheet">    
 <link href="<c:url value="/assets/user/css/w3.css" />" rel="stylesheet">

<link rel="stylesheet" href="<c:url value = "/assets/user/lib/bootstrap/css/bootstrap.css"/>"/>
<link rel="stylesheet" href="<c:url value = "/assets/user/lib/bootstrap/css/bootstrap-theme.css"/>"/>

<link rel="stylesheet" href="<c:url value = "/assets/user/lib/fontawesome/css/all.css"/>"/>
<script src="<c:url value="/assets/user/js/header.js" />"></script>
</head>
<body>
	<script async defer crossorigin="anonymous"
		src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v8.0"
		nonce="ZUFBRQkm"></script>
	<%@include file= "/WEB-INF/views/layouts/user/header.jsp" %>
	<decorator:body />
	<%@include file= "/WEB-INF/views/layouts/user/footer.jsp" %>
</body>
</html>