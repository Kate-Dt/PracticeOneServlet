<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>

  <form action = "/MyServlet" method = "POST">
      Login: <input type = "text" name = "login">
      <br />
      Password: <input type = "text" name = "password" />
      <input type = "submit" value = "Submit" />
  </form>

  </body>
</html>
