package atong.springboot.jenkins.yousi.member;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.assertutil.AssertTool;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.cex.test.framework.dbutil.DataBaseManager;
import io.qameta.allure.Allure;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.sql.*;

import static atong.springboot.jenkins.yousi.member.ConfigData.*;



@SpringBootTest
public class homePage  extends BaseCase {

    private static final Logger log = LoggerFactory.getLogger(homePage.class);
    public Connection connection = new  DataBaseManager().getMysqlConnection(db_address);

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
        String sql = "select order_status,direct_promote_reward,indirect_promote_reward from member_orders order by id desc limit 1 ";
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
        JSONArray jsonArray = new DataBaseManager().executeQuery(sql,connection);
        JSONObject jsonObject1 = (JSONObject) jsonArray.get(0);
        String order_status = jsonObject1.get("order_status").toString();
        AssertTool.isContainsExpect("0",resjson.get("code").toString());
        AssertTool.isContainsExpect("101",order_status);

    }
    @Test
    public void test(){
        System.out.println("hahaha");
    }

}
