package atong.springboot.jenkins.yousi.member;

import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.qameta.allure.Allure;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import atong.springboot.jenkins.yousi.member.ConfigData.*;

import java.io.IOException;

import static atong.springboot.jenkins.yousi.member.ConfigData.vipHomePage;


@SpringBootTest
public class homePage  extends BaseCase {

    private static final Logger log = LoggerFactory.getLogger(homePage.class);

    @Test
    public void SelectVipGift() throws IOException {

        Response response = OkHttpClientManager.get(ip_gateway+vipHomePage,null);
        JSONObject repjson =  BaseCase.resultDeal(response);
        Allure.addAttachment("ip地址",ip_gateway+vipHomePage);
        Allure.addAttachment("出参msg",repjson.get("msg").toString());
        Allure.addAttachment("code码：",repjson.get("code").toString());
        System.out.println(repjson.get("msg").toString());
        System.out.println(repjson.get("code").toString());
        System.out.println("-----------------");



    }

}
