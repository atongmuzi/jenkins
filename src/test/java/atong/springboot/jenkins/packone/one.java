package atong.springboot.jenkins.packone;



import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert.*;
import org.slf4j.Logger;

@SpringBootTest
 public  class one extends AbstractTestNGSpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(one.class);

    @Test
    public void oneContextLoads() {
        System.out.println("hahaha1");
    }
    @Test
    public  void oneSample(){
        System.out.println("lalala1");
    }
    @Test
    public void oneSample1(){
        System.out.println("hehehe1");
    }

    @Test
    @Feature("atong test")
    @Story("story1")
    @Description("该案例是为了测试通过枚举类型引入数据")
    public void oneSample2(){
        System.out.println("xixixi1");
    }

    @Test
    public void oneSample3(){
        System.out.println("zazaza1");
    }

    @Test
    public void oneSample4(){
       int i = 8;
       if (i==8){
           log.info("success");
       }else {
           Assert.fail("hahaha fail");
       }

    }


}
