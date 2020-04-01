//package com.test.mypaypal;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.paypal.base.rest.APIContext;
//import com.paypal.base.rest.OAuthTokenCredential;
//import com.paypal.base.rest.PayPalRESTException;
//
//
//@Configuration
//public class ConfigContext {
//
//    @Value("AZHhfASGePivATmw78RJR6k4bjc_DDjgJRoKB8k8YauVQeynX-XDtknleSAPJZViTEcmoJ9vzBQmVcU_")
//    private String clientId;
//    @Value("EBjzvI7grgnWpf4oTPstjVmV8_ASUUe75DThRgkYa0TG1m5xAKnB8Dio5t905EGT5ro7D6-CKxYnsuBs")
//    private String clientSecret;
//    @Value("sandbox")
//    private String mode;
//
//    @Bean
//    public Map<String,String> paypalSdkConfig(){
//        Map<String,String> configMap = new HashMap<>();
//        configMap.put("mode",mode);
//        return configMap;
//
//    }
//
//    @Bean
//    public OAuthTokenCredential oAuthTokenCredential() {
//        return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
//    }
//
//    @Bean
//    public APIContext apiContext() throws PayPalRESTException {
//        APIContext context = new APIContext(oAuthTokenCredential().getAccessToken());
//        context.setConfigurationMap(paypalSdkConfig());
//        return context;
//    }
//}
//
//
//
