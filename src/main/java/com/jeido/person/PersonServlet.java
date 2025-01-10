package com.jeido.person;

import com.jeido.person.entities.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "personServlet", value = "/person")
public class PersonServlet extends HttpServlet {
    private List<Person> persons;

    public void init() {
        persons = List.of(
                new Person("Doe", "John", 42),
                new Person("Baie", "Michel", 53),
                new Person( "Doe", "Jane", 19)
        );
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><head>");
        out.println("<title>Person</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Persons List : </h1>");
        out.println("<table class=\"table\"><thead><tr><td>Lastname</td><td>Firstname</td><td>Age</td></tr></thead><tbody>");
        for (Person person : persons) {
            out.println("<tr>");
            out.println("<td>" + person.getLastName() + "</td>");
            out.println("<td>" + person.getFirstName() + "</td>");
            out.println("<td>" + person.getAge() + "</td>");
            out.println("</tr>");
        }
        out.println("</tbody></table></body></html>");

    }
}
