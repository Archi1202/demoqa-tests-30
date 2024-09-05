import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleJunitTests {

    private int getResult(){
        return 3;}

    int result;

    @BeforeEach
    void beforeEach(){
        System.out.println("Getting Result from Before Each method!");
        result = getResult();
    }
    @Test
    void FirstTest(){
        System.out.println("###....First Test Started!");
        Assertions.assertTrue(result > 2,"Statement is not correct");
    }
    @Test
    void SecondTest(){
        System.out.println("###....Second Test Started!");
        Assertions.assertTrue(result > 2,"Statement is not correct");
    }


    @Test
    void ThirdTest(){
        System.out.println("###....Third Test Started!");
        Assertions.assertTrue(result > 2,"Statement is not correct");
    }
}