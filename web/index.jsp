<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/21
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="helloword/tm" method="post">
    <input type="submit" value="请求方法">
</form>
<a href="helloword/tp?uname=李浩&age=11">测试参数请求</a>
<br/>
<a href="helloword/hello">Hello请求</a>
<h1>hello word</h1>
<a href="helloword/tsp/12">测试传参</a>

<form method="get" action="student/opt/10">
    <input type="submit" value="查询请求get">
</form>
<form method="post" action="student/opt">
    <input type="submit" value="添加请求post">
</form>
<form method="post" action="student/opt/10">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="更新请求PUT">
</form>
<form method="post" action="student/opt/10">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="删除请求DELETE">
</form>
<hr>
<a href="helloword/tsp1?uname=lihao&pwd=jk123&age=35">测试传参</a>

</body>
</html>
