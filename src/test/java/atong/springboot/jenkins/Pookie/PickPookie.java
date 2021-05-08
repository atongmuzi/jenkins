package atong.springboot.jenkins.Pookie;


import atong.springboot.jenkins.Pookie.BaseCasePookie;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.cex.test.framework.jsonutil.JsonFileUtil;
import okhttp3.Response;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static atong.springboot.jenkins.Pookie.tool.PookieConfig.pick_pookie;
import static atong.springboot.jenkins.Pookie.tool.PookieConfig.pre_trade;

@SpringBootTest
public class PickPookie extends BaseCasePookie {
    @Test
    public void pick() throws IOException {
        HashMap header = dataInit();
        Response response = OkHttpClientManager.get(ip_gateway+pick_pookie,header);
        JSONObject jsonObject = resultDeal(response);
        System.out.println(jsonObject.get("code"));
        System.out.println(jsonObject.get("msg"));

    }

    @DataProvider(parallel=true)
    public Object[][] providePreTradeRightData(Method method){
        String path = "./src/test/resources/pookie/trade";
        HashMap<String, String>[][] arrymap = (HashMap<String, String>[][]) JsonFileUtil.jsonFileToArry(path);
        return arrymap;
    }
    @Test(dataProvider = "providePreTradeRightData",description = "正常测试案例")
    public void preTrade(Map<?,?> param)throws Exception
    {
        HashMap header = dataInit();
        JSONObject jsonObject = JSON.parseObject(param.get("body").toString());
        Response response = OkHttpClientManager.post(ip_gateway+pre_trade,jsonObject.toString(),"application/json",header);
        JSONObject rspjson = resultDeal(response);
        System.out.println(rspjson.get("code"));
        System.out.println(rspjson.get("msg"));
        JSONObject jsonObject1 = (JSONObject)rspjson.get("data");
        System.out.println(jsonObject1.get("order_no"));

    }
}
