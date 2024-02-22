<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
<!-- jsp 파일을 실행할 때는 css 아래와 같이 하고요,,,,, -->
<link rel="stylesheet"    href="assets/css/register.css" >
<!-- 서블릿으로 화면을 보여 줄 때에는 ??? -->
</head>
<body>
  <div class="contents-wrap">
  <h3 style="text-align: center;">상품등록</h3>
  <hr>
          <form action="productReg.cc" method="post">
            <ul class="join-wrap">
              <li>상품코드</li>
              <li>
                <input name="pcode" type="text" placeholder="상품코드를 입력해 주세요." />
              </li>
              <li>카테고리</li>
              <li><input id="ctg" name="ctg" type="text" placeholder="카테고리를 입력해주세요." /></li>
              <li>상품이름</li>
              <li><input id="pname" name="pname" type="text" placeholder="상품이름을 입력해주세요." /></li>
              <li>가격</li>
              <li><input name="price" type="text" placeholder="가격을 입력해주세요."/></li>
            </ul>
            <button class="product-btn">상품등록</button>
          </form>
        </div>
  <script src="assets/js/script.js"></script>
</body>
</html>