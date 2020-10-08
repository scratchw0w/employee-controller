<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <link href="https://fonts.googleapis.com/css2?family=Sansita+Swashed:wght@700&family=Source+Sans+Pro:ital@1&family=Marvel:ital,wght@1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="styles/style.css">
  <script src="scripts/script.js"></script>
  <title>employee-controller</title>
</head>
 
<body>

  <div class="top-panel">
    <h1 id="top-logo-text">Employee Controller</h1>
    <hr id="top-line">
      <div class="top-text">
        <a href="/employee-editor">Add New Employee</a>
        <a id="top-update-btn" onclick="revealOrHideUpdateSections()">Update Existing Employee</a>
        <a id="top-delete-btn" onclick="revealOrHideDeleteSections()">Delete Employee</a>
      </div>
    <hr id="top-second-line">
  </div>

  <div id="container">
    <div id="content">
      <table>
        <thead>
          <th>Name</th>
          <th>Surname</th>
          <th>Age</th>
          <th>Post</th>
        </thead>

        <c:forEach var="tempEmployee" items="${employees}">

          <c:url var="updateLink" value="/update-employee">
            <c:param name="employeeId" value="${tempEmployee.id}" />
          </c:url>

          <c:url var="deleteLink" value="/delete-employee">
            <c:param name="employeeId" value="${tempEmployee.id}" />
          </c:url>

          <tr>
            <td> ${tempEmployee.name} </td>
            <td> ${tempEmployee.surname} </td>
            <td> ${tempEmployee.age} </td>
            <td> ${tempEmployee.post} </td>
            <td id="update-btn"><a href="${updateLink}">Update</a></td>
            <td id="delete-btn"><a href="${deleteLink}">Delete</a></td>
          </tr>
        </c:forEach>
      </table>
    </div>
  </div>
</body>

</html>