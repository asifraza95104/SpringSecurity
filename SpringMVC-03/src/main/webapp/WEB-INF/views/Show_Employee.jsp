<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h1> ${data}</h1>

	<c:forEach items="${data}" var="obj">
	
	 <c:out value="${ obj}"/>
	
	</c:forEach>
		
		<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>SALARY</th>
        
    </tr>
    
</table>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
</body>
</html>