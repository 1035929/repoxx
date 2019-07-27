<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/21 0021
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试</a>

<form method="post" action="account/saveAccount">
    账户:<input type="text" name="name"><br>
    金额<input type="text" name="money"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
