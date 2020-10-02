<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="styles/style.css">
  <title>employee-controller</title>
</head>

<body>

  <div class="top-panel">
    <h1 id="logo-text">Employee Controller</h1>
    <hr id="top-line">
      <div class="top-text">
        <table>
          <tr>
            <th id="add-employee">Add New Employee</th>
            <th id="update-employee">Update Existing Employee</th>
            <th id="delete-employee">Delete Employee</th>
          </tr>
        </table>
      </div>
    <hr id="top-second-line">
  </div>
<!--
  <div id="container">
    <div id="content">
      <table>
        <tr>
          <th>Name</th>
          <th>Surname</th>
          <th>Age</th>
          <th>Post</th>
        </tr>

        <c:forEach var="tempEmployee" items="${employees}">
          <tr>
            <td> ${tempEmployee.name} </td>
            <td> ${tempEmployee.surname} </td>
            <td> ${tempEmployee.age} </td>
            <td> ${tempEmployee.post} </td>
          </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  -->
</body>

</html>