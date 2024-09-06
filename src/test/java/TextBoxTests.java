import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void SuccessTextBoxTest(){
        //Open the demoqa elements page//
        open("/elements");

        //Click on the Text Box option//
        $(("#item-0")).click();
        //Insert values into the Fields//
        $("#userName").setValue("Anuar");
        $("#userEmail").setValue("TestQAGURU@gmail.com");
        $("#currentAddress").setValue("Kazakhstan,Astana");
        $("#permanentAddress").setValue("Indonesia, Bali");

        //Click on the Submit button
        $("#submit").click();
        //Include sleep function to see that all data was included into the fields
        sleep(3000);
        //Verify that Output box displayed for user on UI
        $("#output").isDisplayed();
        $("#output #name").shouldHave(text("Anuar"));
        $("#output").$("#email").shouldHave(text("TestQAGURU@gmail.com"));
        $("#output").$("#currentAddress").shouldHave(text("Kazakhstan,Astana"));
        $("#output").$("#permanentAddress").shouldHave(text("Indonesia, Bali"));


    }
}
