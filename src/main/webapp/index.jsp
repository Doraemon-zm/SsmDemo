<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<%--<form action="${pageContext.request.contextPath}/user/show" method="post">
    <table>
        <tr>
            <td>姓名:</td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="点击提交">
            </td>
        </tr>
    </table>
</form>--%>
<form action="${pageContext.request.contextPath}/user/show" method="post">
    <table>
        <tr>
            <td>用户id:</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="点击提交">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
