<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Moto</title>
</head>
<body>
<form:form method="post" action="add" commandName="moto">
  <table>
    <tr>
      <td>
        <from:label path="brand">
        Brand
      </from:label>
      </td>
      <td><form:input path="brand"/> </td>
      <td><from:errors path="brand"></from:errors> </td>
    </tr>
    <tr>
      <td>
        <from:label path="model">
          Model
        </from:label>
      </td>
      <td><form:input path="model"/> </td>
      <from:errors path="model"></from:errors>
    </tr>
    <tr>
      <td>
        <from:label path="price">
          Price
        </from:label>
      </td>
      <td><form:input path="price"/> </td>
      <from:errors path="price"></from:errors>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Add Moto"/></td>
    </tr>
  </table>
</form:form>
</body>
</html>
