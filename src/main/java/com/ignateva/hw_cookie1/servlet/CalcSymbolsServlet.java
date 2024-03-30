package com.ignateva.hw_cookie1.servlet;

import com.ignateva.hw_cookie1.FileManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CalcSymbolsServlet",value = "/calcSymbols-servlet")
public class CalcSymbolsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileManager fileManager = new FileManager();
        String text = fileManager.ReadFile2();
        List<String> result = fileManager.getSeries(text);
        String max = fileManager.MaxSeries(result) ;


        Cookie cookie= new Cookie("message", max);
        resp.addCookie(cookie);
        cookie.setMaxAge(30*30);

        req.setAttribute("allSeries",result.toString());
        req.setAttribute("max",max);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);
    }
}
