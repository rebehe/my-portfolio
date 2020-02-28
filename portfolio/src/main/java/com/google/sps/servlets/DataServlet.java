// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {

  private ImmutableList<String> QUOTES = ImmutableList.of(
      "No one can make you feel inferior without your consent. -Eleanor Roosevelt",
       "Every time you are tempted to react in the same old way, ask yourself if you want to be a prisoner of the past or a pioneer of the future. -Deepak Chopra",
       "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. -Ralph Waldo Emerson",
       "The most common way people give up their power is by thinking they don\'t have any. -Alice Walker",
       "Never let success get to your head and never let failure get to your heart. -Ziad K. Abdelnour",
       "Brave, not perfect. -Reshma Saujani",
       "You are perfect as you are and there is always room for improvement. -Shunryu Suzuki",
       "The most important thing is to enjoy your life--to be happy--it\'s all that matters. -Audrey Hepburn",
       "Courage doesn\'t always roar. Sometimes courage is the little voice at the end of the day that says I\'ll try again tomorrow. -Mary Anne Radmacher",
       "I have learned that as long as I hold fast to my beliefs and values – and follow my own moral compass – then the only expectations I need to live up to are my own. -Michelle Obama",
       "You may not control all the events that happen to you, but you can decide not to be reduced by them. -Maya Angelou",
       "You can love someone and still choose to say goodbye to them. You can miss a person every day, and still be glad that they are no longer in your life. -Tara Westover");

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String quote = QUOTES.get((int) (Math.random() * QUOTES.size()));
    response.setContentType("text/html;");
    response.getWriter().println(quote);
  }
}
