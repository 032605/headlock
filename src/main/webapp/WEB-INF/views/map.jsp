<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<style>
	.devCss {
		 text-align: center;
	}
</style>

</head>
<body>
	
	<div class="container">
		<div class="row col-md-7 table-responsive">
			<table class="table devCss" id="listTable">
		    <thead>
			    <tr>
			         <th>번호</th>
			         <th>사용자</th>
			         <th>위도</th>
			         <th>경도</th>
			         <th>탑승 시간</th>
			     </tr>
		     </thead>
		     <tbody>

				<c:forEach items="${ride }" var="riding">
				<tr>
					<td>${riding.rideId } </td> 
					<td>${riding.rideUser }</td> 
					<td>${riding.rideLat } </td> 
					<td>${riding.rideLon }</td> 
					<td>${riding.rideDatetime }</td> 
				</tr>
				</c:forEach>

		     </tbody>
		     </table>
	     </div>
	</div>
	
</body>
<script>
var linePath = [];
var rideLatList = new Array();
var rideLonList = new Array();

<c:forEach items="${ride}" var="item">
rideLatList.push("${item.rideLat}");
rideLonList.push("${item.rideLat}");
</c:forEach>

linePath.push(rideLatList, rideLonList);
console.log(linePath)
 
for (var i = 0; i < rideLatList.length; i++) {
	console.log(i + " 위도" +  rideLatList[i]);
	console.log(i + " 경도" +  rideLonList[i]);
}



</script>
</html>