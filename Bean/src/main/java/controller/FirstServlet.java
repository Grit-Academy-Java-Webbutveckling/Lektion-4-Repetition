package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;
import model.User;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail("random@random.random");
		ArrayList<Integer> favNumbers = new ArrayList<>();
		favNumbers.add(1);
		favNumbers.add(7);
		favNumbers.add(13);
		favNumbers.add(0);
		user.setFavoritNumbers(favNumbers);
		user.setRandomNumber((int) Math.floor(Math.random() * 5));
		Car car = new Car();
		car.setColor("Black");
		car.setModel("Volvo");
		user.setCar(car);
		request.setAttribute("user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		rd.forward(request, response);

		// FavoriteNumbers, randomNumber, email, ....
		System.out.print(user.welcomeMessage());
	}

}
