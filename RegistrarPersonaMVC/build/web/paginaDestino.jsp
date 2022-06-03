<%-- 
    Document   : paginaDestino.jsp
    Created on : 17-may-2022, 8:58:17
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%  // Este es un scriptlet             
            // Es código en Javaque captura los parámetros enviados        
            // en el objeto "request"         
            String nombre = request.getParameter("nombre");       
            String color = request.getParameter("color");       
            String mail = request.getParameter("mail");              
            %>
        
             <h1> Esta es la página destino</h1>  
             <h2> Aqui se despliegan los datos que se recibieron</h2>      
             <p> Tus datos son los siguientes: </p>
         <table cellspacing="3" cellpadding="3" border="1" >     
             <tr>          
                 <td align="right"> Te llamas: </td>      
                 <td> <%= nombre %> </td>     
             </tr>    
             <tr> 
                  <td align="right"> Tu color favorito es: </td>      
                  <td> <%= color %> </td>   
             </tr>        
             <tr>
                 <td align="right"> Y tu correo es: </td>        
                 <td> <%= mail %> </td>     
             </tr>        
         </table> 
             
             <form action="index.jsp" method="post">      
                 <input type="submit" value="Regresar">   
             </form>
            
    </body>
</html>
