package atong.springboot.jenkins.Pookie;

import atong.springboot.jenkins.Pookie.BaseCasePookie;
import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.httputil.OkHttpClientManager;
import io.qameta.allure.Feature;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import static atong.springboot.jenkins.Pookie.tool.PookieConfig.baseInfo_v2;

@SpringBootTest
public class UserBaseInfo extends BaseCasePookie {

    @Test
    @Feature(value="获取用户基本信息")
    public void getBaseInfo_v2() throws IOException {
        HashMap header = dataInit();
        System.out.println(ip_gateway+baseInfo_v2);
        Response response = OkHttpClientManager.get(ip_gateway+baseInfo_v2,header);
        JSONObject jsonObject = resultDeal(response);
        System.out.println(jsonObject.get("code"));
    }

}
