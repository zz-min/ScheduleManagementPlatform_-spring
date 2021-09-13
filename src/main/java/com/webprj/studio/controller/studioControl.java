package com.webprj.studio.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webprj.studio.config.studioConfig;
import com.webprj.studio.dao.rsvDao;
import com.webprj.studio.service.*;

/**
 * Servlet implementation class studioControl
 */
@WebServlet("/")
public class studioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReservationService rsvService = null;
	private ApplicationContext container = null;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public studioControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		container = new AnnotationConfigApplicationContext(studioConfig.class);	
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("jdbc_driver");
		String url = context.getInitParameter("db_url");
		String userName = context.getInitParameter("db_userid");
		String password = context.getInitParameter("db_passwd");

		rsvDao rsvDao = new rsvDao(driver, url, userName, password);
		rsvService = new ReservationServiceImpl();
		System.out.println("init함수진행즁");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// step #1. get request parameters
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		rsvDao dao = (rsvDao) session.getAttribute("dao");
		if (dao == null) {
			ServletContext context = getServletContext();
			dao = new rsvDao(context.getInitParameter("jdbc_driver"), context.getInitParameter("db_url"),
					context.getInitParameter("db_userid"), context.getInitParameter("db_passwd"));
			session.setAttribute("dao", dao);
		}

		// step #2. data processing
		String pathInfo = request.getRequestURI();
		String viewName = null;
		System.out.println(pathInfo);

		
		if (pathInfo.equals("/")) { // 가장처음 진입페이지
			viewName = "/src/main/webapp/WEB-INF/views/month.html";
		}
		
		System.out.println(viewName+" : viewname");
		/*
		 * RequestDispatcher view =
		 * request.getRequestDispatcher("/src/main/webapp/WEB-INF/views/NewFile.html");
		 * view.forward(request, response);
		 */
		response.sendRedirect("/src/main/webapp/WEB-INF/views/NewFile.html");
		/*
		 * // step #3. output processing results if (viewName != null) { if
		 * (viewName.contains("redirect:")) { String location =
		 * viewName.split(":")[1];// :이걸로 구분한 2번째 원소값을 저장하라
		 * response.sendRedirect(request.getContextPath() + location); } else {
		 * System.out.println(viewName+"디스패쳐진입"); RequestDispatcher view =
		 * request.getRequestDispatcher(viewName); view.forward(request, response); }
		 */
		
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
