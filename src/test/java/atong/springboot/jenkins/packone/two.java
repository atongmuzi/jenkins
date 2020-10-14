package atong.springboot.jenkins.packone;



import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
 public  class two extends AbstractTestNGSpringContextTests {

    @Test
    public void oneContextLoads() {
        System.out.println("hahaha");
    }
    @Test
    public  void twoSample(){
        System.out.println("lalala");
    }
    @Test
    public void twoSample1(){
        System.out.println("hehehe");
    }

    @Test
    @Feature("atong test")
    @Story("story1")
    @Description("该案例是为了测试通过枚举类型引入数据")
    public void twoSample2(){
        System.out.println("xixixi");
    }


}
