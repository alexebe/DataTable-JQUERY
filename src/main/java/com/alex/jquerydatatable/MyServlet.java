/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.jquerydatatable;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import org.json.JSONArray;
/**
 *
 * @author alexa
 */
public class MyServlet extends HttpServlet {

 @EJB
 ManufacturerFacade manufacturerFacade;
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
 protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("application/json");

	  PrintWriter out = response.getWriter();

	  List<Manufacturer> lisOfManufacturer = manufacturerFacade.findAll();
 //         JSONArray jSONArray=new JSONArray(lisOfManufacturer);
          JSONObject jSONObject=new JSONObject();
//	  Gson gson = new GsonBuilder().setPrettyPrinting().create();

//	  String json = gson.toJson(lisOfManufacturer);
jSONObject.put("data", lisOfManufacturer);

	  out.print(jSONObject.toString());
	 
	 }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
