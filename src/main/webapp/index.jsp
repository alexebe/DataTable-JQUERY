<%-- 
    Document   : index
    Created on : 27 sept. 2017, 13:31:26
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JQUERY DATATABLE</title>
        <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"
    </head>
    <body>
 <div class='table-container'>
	    <table id='jqueryDataTable' cellpadding='0' cellspacing='0' border='0'  class='display'>
	   <thead>
	    <tr>
	       <th>Name</th>
	     <th>AdresseLine1</th>
	     <th>Phone</th>
	    </tr>
	   </thead>
           <tfoot>
	    <tr>
	       <th>Name</th>
	     <th>AdresseLine1</th>
	     <th>Phone</th>
	    </tr>               
           </tfoot>
	   <tbody>
	   </tbody>
	   </table>
	   </div>
	   <script src='https://code.jquery.com/jquery-3.1.1.min.js'></script>
	   <script src='http://code.jquery.com/ui/1.9.2/jquery-ui.js'></script>
	   <script src='http://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js'></script>
	   <script src='res/script.js'></script> 
    </body>
</html>
