package TestSofkaAutomation;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ExerciseSofka{
	
	//VARIABLES
	private WebDriver driver_fox;
	private static final String TIPO_DRIVER = "webdriver.geckodriver.exe";
	private static final String PATH_DRIVER = "./src/test/resources/WebDriver/geckodriver.exe";
	private String URL = "https://www.demoblaze.com/";
	


@BeforeClass
public static void setUpBeforeClass1()
{
	
	System.out.println("INICIO DE LOS TEST");
	System.setProperty(TIPO_DRIVER, PATH_DRIVER);
}

@Before
public void setUp1()
{
driver_fox = new FirefoxDriver();
driver_fox.manage().window().maximize();
driver_fox.get(URL);

}


@Test
public void testSourch001() throws InterruptedException
{
	//CREAR USUARIO --> Sign up
	driver_fox.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
	Thread.sleep(2000);
	//INGRESO DE USUARIO Y CONTRASEÑA VÁLIDOS
		WebElement username1 = driver_fox.findElement(By.id("sign-username"));
		username1.sendKeys("zpaucars2085", Keys.TAB, "Paucar2085", Keys.ENTER);
		String id1 = driver_fox.getWindowHandle();
		System.out.println(id1);
		//ESPERAR UN MOMENTO HASTA QUE EXERCISESOFKA RESPONDA
		Thread.sleep(2000);
		//AL DAR CLIC EN EL BOTÓN Sign up PERMANECE EN LA PÁGINA ---> Principal
		driver_fox.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver_fox.switchTo().alert().accept();
		Thread.sleep(2000);
		
	//REALIZAR Log in 
	driver_fox.findElement(By.xpath("/html/body/nav/div[1]/ul/li[5]/a")).click();
	//ESPERAR UN MOMENTO HASTA QUE EXERCISESOFKA RESPONDA
	Thread.sleep(2000); 
		
		//INGRESO DE USUARIO Y CONTRASEÑA VÁLIDOS
		WebElement username2 = driver_fox.findElement(By.id("loginusername"));
		username2.sendKeys("zpaucars2085", Keys.TAB, "Paucar2085", Keys.ENTER);
		String id2 = driver_fox.getWindowHandle();
		System.out.println(id2);
		//ESPERAR UN MOMENTO HASTA QUE EXERCISESOFKA RESPONDA
		Thread.sleep(2000);
		
		//AL DAR CLIC EN EL BOTÓN PERMANECE EN LA PÁGINA ---> Principal
		driver_fox.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
				
		//SELECCIONAR PRODUCTOS
		//CATEGORIA LAPTOPS 
		
		driver_fox.findElement(By.linkText("Laptops")).click();
		Thread.sleep(2000);
		
		//PRODUCTO 2017 Dell 15.6 Inch
		driver_fox.findElement(By.linkText("2017 Dell 15.6 Inch")).click();
		Thread.sleep(2000);
		
		//AÑADIR AL CARRO
		driver_fox.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		Thread.sleep(2000);
		//ACEPTAR LA ALERTA
		driver_fox.switchTo().alert().accept();
		Thread.sleep(2000);
		String id3 = driver_fox.getWindowHandle();
		System.out.println(id3);
			
		//SE ABRE LA VENTANA Cart PARA VISUALIZAR LOS PRODUCTOS
		driver_fox.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//SE APRUEBA LOS PRODUCTOS AÑADIDOS
		driver_fox.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
		Thread.sleep(2000);
		//INGRESO DE DATOS AL FORMULARIO
		WebElement username3 = driver_fox.findElement(By.id("name"));
		username3.sendKeys("Itzel Ruiz", Keys.TAB, "Ecuador",Keys.TAB, "Cuenca",Keys.TAB, "5144400387030008", Keys.TAB, "Diciembre",  Keys.TAB, "2024",Keys.ENTER);
		String id4 = driver_fox.getWindowHandle();
		System.out.println(id4);
		//ESPERAR UN MOMENTO HASTA QUE EXERCISESOFKA RESPONDA
		Thread.sleep(2000);
		//APROBAR EL FORMULARIO DE COMPRA
		driver_fox.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//APROBAR EL TICKET DE COMPRA
		driver_fox.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(2000);
		
		
		//driver_fox.findElement(By.linkText("Home ")).click();
	
		/*//SELECCIONAR PRODUCTOS
				//CATEGORIA MONITORS 
				
				driver_fox.findElement(By.linkText("Monitors")).click();
				Thread.sleep(2000);
				
				//PRODUCTO 2017 Dell 15.6 Inch
				driver_fox.findElement(By.linkText("Apple monitor 24")).click();
				Thread.sleep(2000);
				
				//AÑADIR AL CARRO
				driver_fox.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
				Thread.sleep(2000);
				//ACEPTAR LA ALERTA
				driver_fox.switchTo().alert().accept();
				Thread.sleep(2000);*/
		
		
}

@Test
public void testSourch002() throws InterruptedException
{
	//INGRESO DE USUARIO VÁLIDO Y CONTRASEÑA INVÁLIDA
		driver_fox.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		//INGRESO DE USUARIO Y CONTRASEÑA VÁLIDOS
			WebElement username1 = driver_fox.findElement(By.id("sign-username"));
			username1.sendKeys("", Keys.TAB, "Paucar2083", Keys.ENTER);
			String id1 = driver_fox.getWindowHandle();
			System.out.println(id1);
			//ESPERAR UN MOMENTO HASTA QUE EXERCISESOFKA RESPONDA
			Thread.sleep(2000);
			System.out.println("Por favor complete Nombre de Usuario y Contraseña.");
			//AL DAR CLIC EN EL BOTÓN Sign up PERMANECE EN LA PÁGINA ---> Principal
			driver_fox.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]")).click();
			Thread.sleep(2000);
			driver_fox.switchTo().alert().accept();
			Thread.sleep(2000);
	
}

@After

public void tearDown()
{
	//CIERRA LA PÁGINA
	driver_fox.quit();
	}
@AfterClass
public static void tearDownAfterClass()
{
	System.out.println("FINALIZA LOS TEST");
}

}