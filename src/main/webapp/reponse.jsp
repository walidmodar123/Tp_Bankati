<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>R E P O N S E</title>
</head>
<body>
    <p> Nom : <%= request.getParameter("nom") %></p>
    <p> Prénom : <%= request.getParameter("prenom") %></p>
    <p>
        <%  if (request.getParameterValues("radio1")[0].equals("mas")) {%>
        C'est un homme. Il
        <% } else { %>
        C'est une femme. Elle <% } %>
        a écrit : <%= request.getParameter("textarea") %>
    </p>
</body>
</html>
