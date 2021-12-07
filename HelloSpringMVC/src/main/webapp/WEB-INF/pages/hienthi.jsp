<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%-- <c:forEach items="${sessionScope.dssv}" var="dept">

  ${dept.getHoTen()}

</c:forEach> --%>
  <table width="1000" align="center">
    
    <tr> 
       <td valign="top" width="200">
       		<table class="table table-bordered">
       		 <thead>
    <tr>
      <th scope="col">Mã sinh viên</th>
      <th scope="col" >Họ tên</th>
      <th scope="col">Địa chỉ</th>
      <th scope="col">DTB</th>
      
    </tr>
  </thead>
       		<c:forEach items="${sessionScope.dssv}" var="dept">
       			<tr>
       			<td>
        		<br>
                              ${dept.getMasv()} </td>
                            <td> ${dept.getHoTen()} </td>
                             <td>${dept.getDiaChi()} </td>
                            <td> ${dept.getDTB()} </td>
                             
     
        		</td>
        		</tr>
           </c:forEach>
       		</table>
        </td>
        </tr>
        </table>  
</body>
</html>