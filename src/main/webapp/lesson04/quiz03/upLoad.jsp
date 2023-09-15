<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz03 물건 올리기</title>
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
		
		<section class="contents">
			<h1>물건 올리기</h1>
			<form method="post" action="/lesson04/quiz03/up-load">
				<div>
					<!-- 아이디 -->
					<div class="form-group col-3" name="name">
		     			<select id="inputState" class="form-control">
		        		<option selected>-아이디 선택-</option>
		        		<option>아이디들</option>
		      			</select>
	    			</div>
	    			
	    			<!-- 제목 -->
	    			<input type="text" class="form-control col-4" value="제목" name="title">
	    			<!-- 가격 -->
	    			<div class="input-group col-4" name="price">
	  					<input type="text" class="form-control" value="가격">
	 					<div class="input-group-append">
	    					<button class="btn btn-secondary">원</button>
	 				 	</div>
					</div>
				</div>
    			<!-- 제품 설명 -->
    			<textarea rows="5" cols="9" name="text"></textarea>
    			<!-- 이미지url -->
    			<div class="input-group input-group-sm mb-3 col-9" name="img">
				  <div class="input-group-prepend">
				    <span class="input-group-text">이미지url</span>
				  </div>
				  <input type="text" class="form-control">
				</div>
    			<!-- 저장버튼 -->
    			<button type="submit" class="btn btn-secondary">저장</button>
			</form>
		</section>
		
		<footer class="bg-info">
			<div class="text-secondary d-flex align-items-center justify-content-center">
				Copyright 2023 © HONG All Rights Reserved.
			</div>
		</footer>
	</div>
</body>
</html>