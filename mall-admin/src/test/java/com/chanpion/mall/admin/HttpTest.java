package com.chanpion.mall.admin;

import com.jayway.jsonpath.JsonPath;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author April Chen
 * @date 2020/5/12 10:21
 */
public class HttpTest {

    private OkHttpClient httpClient;

    @Before
    public void before() {
        httpClient = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
    }

    @Test
    public void testTag() throws IOException {
        Request request = new Request.Builder().url("http://stocktag.news/stocktag?domain=index&code=000001")
                .addHeader("X-Arsenal-Auth", "kgserver.wencai")
                .build();
        Response response = httpClient.newCall(request).execute();
        String res = response.body().string();
        List<String> tags = JsonPath.read(res, "$.data.tags..tag_name");
        System.out.println(tags);
    }
}
