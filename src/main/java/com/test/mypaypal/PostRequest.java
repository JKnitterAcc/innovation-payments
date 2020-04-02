package com.test.mypaypal;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class PostRequest {


    public static void postCall() throws Exception {
        URL url = new URL("https://httpbin.org/post");
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "Jinu Jawad");
        params.put("email", "helloworld@gmail.com");
        params.put("CODE", 1111);
        params.put("message", "Hello Post Test success");

        StringBuilder postData = new StringBuilder(); //name=Jinu+Jawad&email=helloworld%40gmail.com&CODE=1111&message=Hello+Post+Test+success
        for (Map.Entry param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(String.valueOf(param.getKey()), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }

        byte[] postDataBytes = postData.toString().getBytes("UTF-8");


        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        connection.setDoOutput(true);
        connection.getOutputStream().write(postDataBytes);


        Reader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i; (i=in.read()) >=0;)
            stringBuilder.append((char)i);
        System.out.println(stringBuilder);
    }
}
