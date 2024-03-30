package com.ignateva.hw_cookie1.servlet;

import com.ignateva.hw_cookie1.FileManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "TextServlet", value = "/text-servlet")

public class TextServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileManager fileManager = new FileManager();
       String text = fileManager.ReadFile2();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        out.println("<h1>" + text + "</h1>");

        out.println("</body></html>");;
    }

}
