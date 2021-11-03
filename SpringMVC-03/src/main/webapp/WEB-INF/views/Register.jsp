<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

   td{
        color: blue;
   }
   
   #formDiv {
   width: 30%;
   border: 2px solid green;
   float:  left;
   
   }
 
 #data
 {
     width: 30%;
     height: 200px;
     float: left;
     margin-left: 30px;
     border:  2px solid green;
  }
</style>



</head>
<body>


 <div id="formDiv">
 <form action="reg" method="post" id="form">
  <table border="1">
      <tr>
          <td>Employee Id:</td>
          <td>
            <input type="text" name="empId"/>
          </td>
      </tr>
  
  <tr>
          <td>Employee Name:</td>
          <td>
            <input type="text" name="empName"/>
          </td>
      </tr>
      
      <tr>
          <td>Employee Salary</td>
          <td>
            <input type="text" name="empSal">
          </td>
      </tr>
  
   <tr>
          <td>
          <input type="submit" value="Register"/>
          </td>
      </tr>
  </table>
 
 
 </form>
 
 
 </div>

<div id="data">

  Employee Id :: ${emp.empId }<br>
  Employee Name :: ${emp.empName }<br>
  Employee Salary :: ${emp.empSal }<br>


</div>


</body>
</html>