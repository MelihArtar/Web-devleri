package coreservlets;
import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.util.*;
@WebServlet("/coreservlets.ShowSession")
public class ShowSession extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
HttpSession session = request.getSession();
String heading;
Integer accessCount =
(Integer)session.getAttribute("accessCount");
if (accessCount == null) {
accessCount = new Integer(0);
heading = "Welcome, Newcomer";
} else {
heading = "Welcome Back";
accessCount = new Integer(accessCount.intValue() + 1);
}
session.setAttribute("accessCount", accessCount);
PrintWriter out = response.getWriter();
String title = "Session Tracking Example";
String docType =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
"Transitional//EN\">\n";
out.println(docType +
"<HTML>\n" +
"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
"<BODY BGCOLOR=\"#FDF5E6\">\n" +
"<CENTER>\n" +
"<H1>" + heading + "</H1>\n" +
"<H2>Information on Your Session:</H2>\n" +
"<TABLE BORDER=1>\n" +
"<TR BGCOLOR=\"#FFAD00\">\n" +
" <TH>Info Type<TH>Value\n" +
"<TR>\n" +
" <TD>ID\n" +
" <TD>" + session.getId() + "\n" +
"<TR>\n" +
" <TD>Creation Time\n" +
" <TD>" +
new Date(session.getCreationTime()) + "\n" +
"<TR>\n" +
" <TD>Time of Last Access\n" +
" <TD>" +
new Date(session.getLastAccessedTime()) + "\n" +
"<TR>\n" +
" <TD>Number of Previous Accesses\n" +
" <TD>" + accessCount + "\n" +
"</TABLE>\n" +
"</CENTER></BODY></HTML>");
}
}