package atong.springboot.jenkins.packone;

import com.alibaba.fastjson.JSONObject;
import io.cex.test.framework.assertutil.AssertTool;
import io.cex.test.framework.httputil.OkHttpClientManager;
import okhttp3.Response;
import org.testng.annotations.Test;

import static atong.springboot.jenkins.packone.ConfigData.modifyUrl;

public class ModifyService extends BaseCase  {

    @Test
    public void NormalService() throws Exception{
        JSONObject jsonbody = new JSONObject();
        jsonbody.put("signNo",getRandom(12));
        jsonbody.put("saleId","42");
        jsonbody.put("image","https://sheshe-business-dev.oss-cn-shanghai.aliyuncs.com/file/8b60e800-7ad2-4a5b-be1d-22b4d0825fae.jpg");
        jsonbody.put("serviceId","61");
        jsonbody.put("address","我是具体地址哈");
        jsonbody.put("areaId","577");
        jsonbody.put("category","1");
        jsonbody.put("cityId","46");
        jsonbody.put("contactTelephone","13656640242");
        jsonbody.put("name",null);
        jsonbody.put("provinceId","4");
        jsonbody.put("receiver","童春艳");
        jsonbody.put("remark","我是备注");
        jsonbody.put("sendNo","WX190001");
        String url = ip_gateway + modifyUrl;
        Response response = OkHttpClientManager.post(url, jsonbody.toJSONString(),
                "application/json", dataInit());
        JSONObject rspjson = resultDeal(response);
        AssertTool.isContainsExpect("200",rspjson.get("code").toString());
        System.out.println(rspjson);
    }

}
