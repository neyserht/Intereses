package neyser.intereses.controllers;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import neyser.intereses.data.DataAnimal;
import neyser.intereses.models.AnimalModel;

import java.io.IOException;

@WebServlet(name = "AnimalController", value = "/AnimalController")
public class AnimalController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        String tipo = request.getParameter("tipo");

        AnimalModel animal = new AnimalModel();
        animal.cargarData();
        String resultado = animal.buscarAnimal(animal.cargarData(), tipo);

        response.getWriter().write(resultado);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {



    }
}
