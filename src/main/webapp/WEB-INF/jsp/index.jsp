<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>
<html>
<head>
    <!------ Head ------------------->
    <c:import url="head.jsp"/>
    <!------ End Head ------------------------->
</head>
<body>

<!------ Header ----------------->
<c:import url="header_index.jsp"/>
<!------ End Header ----------------------->

<!------ Slider ----------------->
<c:import url="slider.jsp"/>
<!------End Slider ------------------------>


<div class="main">
    <!------ Main content ------------>
    <c:import url="content_top.jsp"/>
    <c:import url="content_middle.jsp"/>
    <c:import url="content_map.jsp"/>
    <!------ Main content end ----------------->
</div>
<!------ Footer ------------------->
<c:import url="footer.jsp"/>
<!------ Footer end ------------------------>
</body>
</html>



