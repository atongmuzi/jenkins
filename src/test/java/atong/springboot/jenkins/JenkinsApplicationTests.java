package atong.springboot.jenkins;



import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
 public  class JenkinsApplicationTests extends AbstractTestNGSpringContextTests {

    @Test
    public void contextLoads() {
        System.out.println("hahaha");
    }
    @Test
    public  void sample(){
        System.out.println("lalala");
    }
    @Test
    public void sample1(){
        System.out.println("hehehe");
    }


}
