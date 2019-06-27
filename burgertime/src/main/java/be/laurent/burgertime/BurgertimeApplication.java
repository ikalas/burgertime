package be.laurent.burgertime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BurgertimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgertimeApplication.class, args);
		HamburgerDAO hamburger = new HamburgerDAO();
		hamburger.Connect();

		/*commentaire test*/

	}

}
