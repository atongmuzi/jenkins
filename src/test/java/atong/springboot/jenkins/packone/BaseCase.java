package atong.springboot.jenkins.packone;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.util.HashMap;
import java.util.Random;

import static atong.springboot.jenkins.packone.ConfigData.*;

/**
 * @author tongcy
 * @date 2020-10-29 10:15
 * @desc 基础信息设置
 **/
@Slf4j
public class BaseCase {
    //测试环境信息
    public static String ip_gateway = "https://luxury-business-manage-dev.ssluxury.cn";

    /**
     * @desc 数据初始化
     **/
    public static HashMap dataInit(){
        HashMap header = new HashMap<String, String>();
        header.put("DEVICEID",DEVICEID);
        header.put("DEVICESOURCE",DEVICESOURCE);
        header.put("Lang",lang);
        header.put("COOKIE",COOKIE);
        return header;
    }

    /**
     * @desc 处理http响应的body,返回一个json对象
     **/
    public static JSONObject resultDeal(Response response) {
        JSONObject object = new JSONObject();
        String res = null;
        try {
            res = response.body().string();
        }catch (Exception e){
            e.printStackTrace();
            log.error("get response string error");
            object.put("error",res);
        }
        try {
            object = JSON.parseObject(res);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("translate response json error");
            object.put("error",res);
        }
        return object;
    }

    public static String getRandom(int len) {
                String source = "0123456789";
                 Random r = new Random();
                 StringBuilder rs = new StringBuilder();
                 for (int j = 0; j < len; j++) {
                        rs.append(source.charAt(r.nextInt(10)));
                     }
                 return rs.toString();
             }
}
