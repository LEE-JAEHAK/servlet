package hello.servlet.basic.response;

import hello.servlet.basic.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HelloServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);

        resp.setHeader("Content-Type", "text/plain;charset=utf-8");
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("my-header", "hello");

        try {
            redirect(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter writer = resp.getWriter();
        writer.println("ok");
    }

    private void redirect(HttpServletResponse response) throws Exception{
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Location", "/basic/hello-form.jsp");
        response.sendRedirect("/basic/hello-form.jsp");
    }
}
