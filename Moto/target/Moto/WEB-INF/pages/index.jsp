<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Moto Manager</title>
</head>
<body>
<div>
  <h1>MotoManager</h1>
  <c:if test = "${!empty motos}">
    <table>
      <tr>
        <th>Brand</th>
        <th>Model</th>
        <th>Price</th>
        <th>&nbsp;</th>
      </tr>
      <c:forEach items = "${motos}" var = "moto">
        <tr>
          <td>${moto.brand}</td>
          <td>${moto.model}</td>
          <td>${moto.price}</td>
          <td><a href="deleteMoto/${moto.id}">delete</a> </td>
        </tr>
      </c:forEach>
    </table>
  </c:if>
</div>
<a href="/addMoto"> Add Moto</a>
</body>
</html>
