<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>employee-controller</title>
</head>

<body>
  <h3>Employee Controller</h3>

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
</body>

</html>