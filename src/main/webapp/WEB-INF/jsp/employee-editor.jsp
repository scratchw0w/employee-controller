<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed:wght@700&family=Source+Sans+Pro:ital@1&family=Marvel:ital,wght@1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="styles/employee-editor-style.css">
  <title>employee-controller</title>
</head>

<body>
  <div>
    <a href="/"><h1 id="top-logo-text">Employee Controller</h1></a>
    <hr id="top-line">
  </div>

  <div id="container">
      <form:form action="save-employee" modelAttribute="employee" method="POST">
      
       <form:hidden path="id" />
       
       <table>
        <tbody>
          <tr>
            <td><label>Name: </label></td>
            <td><form:input path="name" id="text-input" /></td>
          </tr>
          <tr>
            <td><label>Surname: </label></td>
            <td><form:input path="surname" id="text-input" /></td>
          </tr>
          <tr>
            <td><label>Age: </label></td>
            <td><form:input path="age" id="text-input" /> <form:errors path="age" /></td>
          </tr>
          <tr>
            <td><label>Post: </label></td>
            <td><form:input path="post" id="text-input" /></td>
          </tr>
          <tr>
            <td><label></label></td>
            <td><input type="submit" value="Save" id="save-btn"/></td>
          </tr>
        </tbody>
       </table>
    </form:form>
  </div>
</body>
</html>