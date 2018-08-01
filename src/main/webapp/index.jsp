<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<script src="/js/jquery-2.0.3.min.js"></script>
<body>
<h2>Hello World!</h2>
<input type="button" value="用户" onclick="test()">
</body>
<script>
    function  test() {
        window.open("user/gotoPage");
    }

</script>
</html>
