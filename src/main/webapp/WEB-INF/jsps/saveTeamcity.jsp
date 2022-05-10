<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Teamcity login</h2>
<form action="saveTeamcityData" method="post">

  <pre>
            id:     <input type ="text" name = "id"/>
           <br>
            code:   <input type ="text"  name  ="code"/>
           <br>
            name:   <input type ="text"  name ="name"/>     
            <br>
       type:urban  <input type  ="radio" name ="type" value="urban"/>
       
            Rural   <input type ="radio"  name  = "type" value="rural"/>
           <br>
           <input type ="submit" value="save"/>
  </pre>


</form>

</body>
</html>
