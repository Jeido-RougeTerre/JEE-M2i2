package com.jeido.person;

import com.jeido.person.entities.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
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

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("persons", persons);
        req.getRequestDispatcher("/person.jsp").forward(req,resp);

    }
}
