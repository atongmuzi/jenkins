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

import java.sql.Array;
import java.sql.Connection;
import java.util.*;

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
    @Test
    public void oneSample5(){
        String a = "123";
        String b = "123";
        System.out.println(a==b);
        System.out.println(Math.round(-1.5));
    }
    @Test
    public void oneSample6(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("acbedgf");
        System.out.println(stringBuilder.reverse());
        StringBuffer stringBuffer = new StringBuffer().append("adcbgfe");
        System.out.println(stringBuffer.reverse());
        String s = new String("abdjlahag");
        System.out.println(s.indexOf("a",1));
        System.out.println(s.charAt(4));
    }
    @Test
    public void oneSample7(){
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3));
        Collection<Integer> collection1= new ArrayList<>();
        Collections.addAll(collection1,1,2,3,4);

    }

}
