package com.naught.carter.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naught.carter.model.User;

public class LoginServlet extends HttpServlet {

	/**
	 * alen
	 */
	private static final long serialVersionUID = -278056120776760867L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            doPost(request,response);  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        //设置HTTP响应的文档类型,此处为Text/html,如果更改为application\msword则设置为word文档格式  
        response.setContentType("text/html");  
        //设置响应所采用的编码方式  
        response.setCharacterEncoding("GB18030");  
        //取得参数username的值  
        String uname=request.getParameter("username");
        System.out.println(uname);
        String passwd=request.getParameter("password");
        System.out.println(passwd);
        
        System.out.println("request login");
        
        User user=new User();  
        user.setUsername(uname);  
        user.setPassword(passwd); 
        
        boolean bool = "admin".equals(uname)&&"123".equals(passwd);
        
        String forward;  
        if(bool){
            forward="success.jsp";  
        }else{  
            forward="error.jsp";  
        }  
        RequestDispatcher rd=request.getRequestDispatcher(forward);  
        rd.forward(request,response);  
    }  

}
