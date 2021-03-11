package atong.springboot.jenkins.yousi.member;

import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.qameta.allure.Allure;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;

import static atong.springboot.jenkins.yousi.member.ConfigData.*;


@SpringBootTest
public class homePage  extends BaseCase {

    private static final Logger log = LoggerFactory.getLogger(homePage.class);

    @Test
    public void SelectVipGift() throws IOException {

        Response response = OkHttpClientManager.get(ip_gateway+vipHomePageUrl,null);
        JSONObject repjson =  BaseCase.resultDeal(response);
        Allure.addAttachment("ip地址",ip_gateway+vipHomePageUrl);
        Allure.addAttachment("出参msg",repjson.get("msg").toString());
        Allure.addAttachment("code码：",repjson.get("code").toString());
        System.out.println(repjson.get("msg").toString());
        System.out.println(repjson.get("code").toString());
        System.out.println("-----------------");
    }

    @Test
    public void rechargeOrStoreMember() throws IOException{
        HashMap header = new HashMap<String,String>();
        header.put("Content-Type","application/json");
        header.put("X-Shop-Token","238a51570cb947a084c97edd9696714e");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("addressId","3868");
        jsonObject.put("payType","3");
        jsonObject.put("source","0");
        jsonObject.put("vipGiftId","1");
        jsonObject.put("vipType","1");
        Response response = OkHttpClientManager.post(ip_gateway+memOrderUrl,jsonObject.toString(),ContentType,header);
        JSONObject resjson = BaseCase.resultDeal(response);
        System.out.println(resjson);
        System.out.println("hahaha");
        System.out.println("hhah");
        System.out.println("lalal");

    }

}
