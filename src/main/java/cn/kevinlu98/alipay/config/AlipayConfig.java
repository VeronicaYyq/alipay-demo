package cn.kevinlu98.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092500596036";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCy8Qpyjm31dVxR0Y+0kXEGexPuThobstmzZAN89uKyQmt9nm1KhNlG8ORg4bFgrnHDae6WJJbvuaD0qb7ya+JWiyCdcZceVNrR4IlWSC68BsDVy549UQmfWpWxfR6iOSaOOa/Yr1Fy0qVfR3LpoFCfgy/XrXaYNHa8vICdkxJJgHaV0S7eZYo9Jx1IvjZN9sLLym8fjIGqJLPJ1WbgzkqNt7/ZCaPubgxg0OvTVyE6uhOkmBtiRQitovMwPb2dmg6XVHv1Kr3vhXMnOl9Z4AANhf/tKtshsvQJM0f3wcofQFqbha7RJpsFRUszTObOy4F/OS7z7G9OyMD6EoaGLkS/AgMBAAECggEAepmXlOFtCS39sLkqAodbrxsIjs/IJ44khjpSAX6N16CWUR0IuHPJAkft0UsQ4rLikwazRv+OwnSmiLr8bs/n5W+xSu4Wodt1iTKUJh+SlZTy7ghyRISPWTURNugI4xDRD8UKbCXCYi9cyqkDXHpQgtm5H8ZjaOkZKTrlzBCGCQDqP2ybwlJPP1SMiNg0OMl4ZstTJ4k/cogOd1UVLJsY9DtscDn9/+Gpi0qp8bA0ZnCwEqlhuk4rOUosKHrLf/pRrezCx0UWukoVGZDYzJddLDkGVvQGJxhJPC7E2I7JeLVQMwwVhm3AY72kjws2D2hATP0qnuLDdFFAnpxER6+50QKBgQDubzdw3xJV5yQ89MfZ09ZTYFSR65v+9Z7Rac9+zTN9gP+NayYFFjfXtFpfpjDdRZoSp1FBZ8iOyu/jil21crzvGltoRyp1e6D45nXYCQnGb/RFM4R24EFwWC0Sx2tcbjNK0DJYp7a7YjYzZ0KW6xn+y7w833T/H3B6WFbLHjiWrQKBgQDAH8+ln+tCvVHubNDaGvlCr5Hblxgj82Nuaf3UowxIQjrVNwRvl8cLhCdWhmtu5WUFXDq6cMzg7DCbZQXmbDaRKM7Kv5iZXoIK1CWQDanBmA+H+9Qh8W3FwWvSbFoFJ8VBGNmq3nI3xUcrVlIwFYJ3DU85L7MSakT9HrNtBlpymwKBgFxuZPGuqG8Awf2Xbvo0svtzdpVy3vCBy2WnPTcM2Y8nuOnbxctnB5Lpabd2t66v0sC0eD2AvDEO3tw4wYcbyb5vW0wbeow8tvSGctyi9FUnBWzmQc3LtdKVfDOxdx9H4T55Y2sW6THPKu/WcewLi/JIjNqUTcixKWtkX5EyUAGpAoGBAKq32bDHsKqGRhaB9PfJvjImhopE8buIW5NSda4MEC7pQxQRJkzu5nzyOm5lVXOePS0NLlZbQ4Kd/fcnRp3hDH/ibha1N6kY1J9AsfwWWADh2PMxr+dVfACche3eQAOSunHE3i46Ke4qy7nTo4Z8poiZeAtNumajrZfqPu+jFJ3/AoGAdx9oubnlQ/82p9iy7u27SYPLi07p7STJsE8dJUsfgvJxaDjkoAPPeidB40DeQhXPG7gLSFQ7wOcbD1rYApGGqyrDO+6Z9DY9msNbT60+4u5CI4RCho2PGbrwQQ0kXULaPF9lnWmsZ0PPdudUvyCz/pXjEwP41cIcdyb8UfTAjQk=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuUGtM5t51AyaxSAemD2ltPMGfNQ6ceymUlIJlhvg/X58SUFHW3gtp/LC/R5VI4kd1eItEW8mNIuMlrz+Yp+96lUDrcduuvkCfrTOkytDWLm4eMUaC4+kd9JuMwoJUCO5EQbY8TRRJlZe8xey3zilLySHvioGFHoSbDsP+sBxWelsR9frGcl1YCxixbKys4vkpwfEd/TwEcdLWpJzcFZ+3y+9K62MJwNxiA0+Zx87hnhTsLDthT/owCCJjHWYkC7ypqBsSKWAQXzqoH67+YNAlLmMpDlImXs3oay1AgnvIWy3dmfcRzH++0BZkPcIN1NdRu9h5qjJvzF4tu+DnjI6jwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8080/callback/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8080/callback/return";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 日志目录
    public static String log_path = "./";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

