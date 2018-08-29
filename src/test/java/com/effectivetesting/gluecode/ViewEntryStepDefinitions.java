package com.effectivetesting.gluecode;

import static com.github.restdriver.serverdriver.RestServerDriver.body;
import static com.github.restdriver.serverdriver.RestServerDriver.delete;
import static com.github.restdriver.serverdriver.RestServerDriver.post;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.effectivetesting.entities.User;
import com.effectivetesting.pageobject.EntryPageObject;
import com.effectivetesting.pageobject.LoginPageObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


public class ViewEntryStepDefinitions {

//	private static final String ID = "23";
	private static final String DEFAULT_BASE_URL = "http://localhost:5000";
	private WebDriver driver;
	private LoginPageObject loginPage;
//	private String currentMessage;
//	private String email;
//	private String password;
	
	
	@Before ("@wip")
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(DEFAULT_BASE_URL);
	}
	
	@Dado("^la entrada \"([^\"]*)\" con el texto \"([^\"]*)\"$")
	public void la_entrada_con_el_texto(String arg1, String arg2) throws Throwable {
				
			loginPage = new LoginPageObject(driver);
			
			loginPage
					.login("admin1@gmail.com", "admin1")
					.goToCreateEntry()
					.createEntry("Dummy Entry", "This is text.")
					.getResultMessage();
		
//		  this.email = email;	
//        this.password = password;
//        
//		User user = createTestObject(userName, email, password);
//		ObjectMapper mapper = new ObjectMapper();
//		
//		String jsonInString = mapper.writeValueAsString(user);
//		
//		post(DEFAULT_BASE_URL + "/api/user", body(jsonInString, "application/json"));
	}

	@Cuando("^el usuario ingresa a la sección de entradas$")
	public void el_usuario_ingresa_a_la_sección_de_entradas() throws Throwable {
	
			driver.findElement(By.id("blog")).click();
			
	}

	@Entonces("^obtiene un listado de las entradas realizadas conteniendo la entrada \"([^\"]*)\"$")
	public void obtiene_un_listado_de_las_entradas_realizadas_conteniendo_la_entrada(String arg1) throws Throwable {
		
	 String mensaje = driver.findElement(By.xpath("//*[@id=\"content_title\"]")).getText();	
	 Assert.assertTrue(mensaje.contains("Dummy Entry"));
		
	}
	

	@After ("@wip")
	public void tearDown() {
		driver.quit();
		
		
//		delete(DEFAULT_BASE_URL + "/api/user/" + ID);
	}
	
//	private User createTestObject(String userName, String email, String password) {
//		User user = new User();
//
//		user.setId(ID);
//		user.setEmail(email);
//		user.setpassword_hash(password);
//		user.setName(userName);
//		
//		return user;
//	}
}
	

