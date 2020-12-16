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
    public static String app_id = "2016101300678687";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC14fi3WTLLxfW1+Gl5lP0NGBEN+oxzTHRRvcLCnISKDUs8w1X0XXCUPyv3IoUB9OTq3AINVWEziB/B2XAdYU4VGQcxuTX7shPWtKvUsRDXZso1OfNYRy3k9C93+ZTeWcXAJAYBabbZS1dqAoNd8yu4TUDnkl6v7ctUo2LcT84umNLGStiNZSauDfWw7cfoAfUIZk72UU2vMZhhSbktb21wH+x3hP0SvMzLAIlKRpvVXGM5ADcmdh2xiAQfjMuG0AIN9q80/AWmVTAb7bhhhKBks5HYpyhlzhsNYitbMS55X9+sJamsnEs22pBA8cf3kOExvCWaajK8P2ls4UrGteq7AgMBAAECggEARKS6F4iEkT9vEnRkakx+jJiOpzXuF/280LTLcmNb6jZGNPKL2CQDvw9wal8Oz8Q7OSA7bgjRHH+9bI3BsHTu4SuG+Y8q/okgz6F0UFtbPdA/dIMggiqq+YPm/mKlep1q8q8lzRa2uZ+jqBC2v5hs4avWWQ92yPL4EENxpjBAYnkLhDTwzPiNcvK7JoYrDo74AAIh1wgLgHkOXCrLe6sph/kl4POFxjSo84qw+qv8+2nwvfqySdmEo6WvECScmI0Mptvn6TcoJQLZ+XnSRznctJAXSkGUqALWhjJLPjINTDAZqfW7oCfEs/68raQC7+P1hbCjPVxcqLasvZgw0zKG4QKBgQDpRNCGpuqwv8QDnFlzD0JtA0wMCaBvFEcqAf+yAZyWbmpY6ToZPIm0vJ9CfGjowSf7XWBAHTpH47Y4jJzufOjro2OGwZqMY/+pjA7uPRoqALgW8oE8T5S9yQkbckREVA5yGU6XgshYLruRfQaruYgyF9LEN7WrHwg4ujL8/fSxSQKBgQDHm0P99jJQ4e3Oy0691LDOw2YL7sMZ2AmuDeJC4vkE+F3PEWoEAfnjH6CCrQaA2HmVlemH6VYueMeP2wTDVm9oLukzc548S45butNNs8N+tSkVkVSHnK1s0qdV6b10RqwjV4T6YUT8Ce2DvWQDtqprzu8FnxI9VJsi/drDff3/4wKBgQDbpMUolNDVfqvFrpl3Qr4MQZeAmivri896WYl3Bhd4eh0+/NSM4LjVauoWw2hRCVdpU0IG/L5c5Kg21QgLc6gqAJ39TB0G5j3cWpnQb85MEINGcC+KJ3DpxvsBUfW/1NoJS5T6CtY0WkSZOH1ogvkgGdiGk+JGb6DhMUpDd6jIqQKBgQCn0Yassp1DG3CQ+KXPPE8ax3W4eplV1SjuSYX9rk6nOxnDymRT0kWCC0ksFMTu9xHiDhQ1zJxEng9Kh13NzZIFCcvPElnrX6rkvIKDRawLj8xm8bUb/0JfyAwgU1CRvglj/WU0DSuuq7ohlM3NwXovAeA73a28GrIEDWIsEnXG+QKBgHaVfzQT2aTFPp6FSn0JUTSg/k6wEqEh57VAv+1Ny/R8Oxtt1+powk1qxk5QEenFWZxHCSPOMKQ1tZphnBcL0H2H1N6h9FIYn0MgGVNOX9frx0Qxmoxtk8S4VI/WRP6Qj2NFwCjBCrESgtPQl1msfs0vtWauM1IcGJPQCczgCDmB";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgWoiZMLbEmyJVhvLlpJkqigfniFAXR25b+Lk8nwKWfrvrHOa+6cH+gaE9ycWQ/RdXcKo13pPRbZFsr6xfYTTcDqPWoyiAlx5UOmjgvrcisVzTlmWh951IsInrB3peKCEti0WtsIXNF60ERAn5PqrNrW3cf4XgF7gD1hTRQFZv8EwtDJc4BEc8n4vk+YQmm/Q/jjRRo+zc/jKqDVq+V3dJG41qFZh3lSUVtrxijaoif40TPi2S15qfgc8+RJyHZmWrEvF4s0AV2JlrOiEzUMsvIrT4CAhqXOAwyv7fcnI6l00oF8IkqIXwFYFFPuD2o3x4yd+UX71Z18Iozk4Q+orLwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://forpay.free.idcfengye.com/callback/notify/";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://forpay.free.idcfengye.com/callback/return/";

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

