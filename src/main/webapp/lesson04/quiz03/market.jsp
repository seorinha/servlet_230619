<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz03 홍당무마켓 페이지</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<style>
header {height:100px;}
nav {height:50px;}
section {height:450px;}
.box {height:200px; width:200px;}
footer {height:150px;}
</style>
</head>
<body>
	<div id="wrap" class="container">
		<header class="bg-danger d-flex justify-content-center">
			<h1 class="text-white">HONG당무 마켓</h1>
		</header>
		
		<nav class="bg-success">
			<ul class="nav nav-pills nav-fill">
				<li class="nav-item"><a href="#" class="nav-link text-white font-weight-bold">리스트</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-white font-weight-bold">물건 올리기</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-white font-weight-bold">마이페이지</a></li>
			</ul>
		</nav>
		
		<section class="d-flex flex-wrap">
			<!-- 글 하나 -->
			<div id="box" class="border border-danger p-3 col-3 mr-2">
				<img src="" alt="물건 이미지" width="">
				<div class="font-weight-bold">[팝니다]</div>
				<div class="text-secondary">1234원</div>
				<div class="text-danger">판매자</div>
			</div>
			
		</section>
		
		<footer class="bg-info">
			<div class="text-secondary d-flex align-items-center justify-content-center">
				Copyright 2023 © HONG All Rights Reserved.
			</div>
		</footer>
	</div>

</body>
</html>