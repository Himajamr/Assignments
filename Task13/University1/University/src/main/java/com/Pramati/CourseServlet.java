package com.Pramati;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CourseServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException {
        PrintWriter printWriter=resp.getWriter();
        Data data=new Data();

        printWriter.print(data.deleteStudentdata());
        printWriter.print(data.getStudent());
    }
}
