package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/comments")
public class CommentsServlet extends HttpServlet {

  private List<String> data;

  @Override
  public void init() {
    data = new ArrayList<>();
    data.add("Rebecca");
    data.add("He");
    data.add("Google Software Engineer");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Convert data to JSON
    Gson gson = new Gson();
    String json = gson.toJson(data);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
