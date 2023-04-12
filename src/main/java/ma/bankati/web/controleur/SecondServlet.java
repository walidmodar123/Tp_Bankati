package ma.bankati.web.controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondControleur")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = """
                <!DOCTYPE html>
                    <html>
                        <head>
                            <title> Hello World </title>
                        </head>
                        <body>
                            <h1> Bonjour mes amis </h1>
                            <h2> Ceci est une page générée à partir de notre Seconde Servlet </h2>
                                <ul>""";
        page += "<li> Protocole : " + req.getProtocol() + "</li>";
        page += "<li> Serveur : " + req.getServerName() + "</li>";
        page += "<li> Port : " + req.getServerPort() + "</li>";
        page += "<li> Méthode : " + req.getMethod() + "</li>";
        page += """
                </ul>
            </body>
        </html>
                """;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println(page);
    }
}
