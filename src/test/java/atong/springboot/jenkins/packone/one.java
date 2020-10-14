package atong.springboot.jenkins.packone;



import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
 public  class one extends AbstractTestNGSpringContextTests {

    @Test
    public void oneContextLoads() {
        System.out.println("hahaha");
    }
    @Test
    public  void oneSample(){
        System.out.println("lalala");
    }
    @Test
    public void oneSample1(){
        System.out.println("hehehe");
    }

    @Test
    @Feature("atong test")
    @Story("story1")
    @Description("该案例是为了测试通过枚举类型引入数据")
    public void oneSample2(){
        System.out.println("xixixi");
    }


}
