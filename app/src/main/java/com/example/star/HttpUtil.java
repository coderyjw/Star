package com.example.star;



import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class HttpUtil {
    public static final String BASE_URL ="http://route.showapi.com/872-1?showapi_appid=64113&showapi_sign=f0575004f71b40d08d8d72ab7d440d2d&&needTomorrow=1&needWeek=1&needMonth=1&needYear=1&star=";

    public static void sendOkHttpRequest(final String address, final Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
