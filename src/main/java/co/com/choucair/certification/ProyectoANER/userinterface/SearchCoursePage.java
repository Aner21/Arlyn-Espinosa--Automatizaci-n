package co.com.choucair.certification.ProyectoANER.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static Target BUTTON_UC = Target.the("Selecciona la Universidad Choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static Target INPUT_COURSE= Target.the("Buscar el Curso").located(By.id("coursesearchbox"));
    public static Target BUTTON_GO= Target.the("Click para buscar el curso").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));

    public static Target SELECT_COURSE= Target.the("Selecciona el curso").located(By.xpath("//*[@id=\'category-course-list\']/div/div[2]/div/div/div/div/a/div[2]/h4"));

    public static Target NAME_COURSE= Target.the("Extrae el nombre del curso").located(By.xpath("//*[@id=\'page-header\']/div/div/div[2]/div[1]/div/a/div/div/h1"));
    //public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));
}
