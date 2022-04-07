<%@ page import="hello.servlet.member.Member" %>
<%@ page import="hello.servlet.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--    // request, response 자동 사용 가능--%>
<%--    MemberRepository memberRepository = MemberRepository.getInstance();--%>

<%--    String username = request.getParameter("username");--%>
<%--    int age = Integer.parseInt(request.getParameter("age"));--%>

<%--    Member member = new Member(username, age);--%>
<%--    memberRepository.save(member);--%>

<%--    response.setContentType("text/html");--%>
<%--    response.setCharacterEncoding("utf-8");--%>
<%--%>--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=${member.id}</li>
    <li>username=${member.username}</li>
    <li>age=${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
