package com.JSON.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JSON.Bean.UserBean;
import com.JSON.DAO.UserDAOImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class UserController
 */
@WebServlet(urlPatterns = { "/users" }, name = "UserController", description = "UserController returns JSON")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDAOImpl userDAOImpl;

	/**
	 * Default constructor.
	 */
	public UserController() {
		userDAOImpl = new UserDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<UserBean> lists = userDAOImpl.getAllUsers();

		Gson gson = new Gson();
		String userJSON = gson.toJson(lists);
		System.out.println(lists);

		PrintWriter printWriter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		printWriter.write(userJSON);
		printWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
