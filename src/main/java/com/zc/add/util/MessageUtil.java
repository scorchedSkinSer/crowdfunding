package com.zc.add.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class MessageUtil {
    public static CommonResponse sendMessage(String phone,String code){
        DefaultProfile profile = DefaultProfile.getProfile("cn-beijing", "LTAI4GBUq7npBGtMSH3fHqnD", "TQEjD3ZWMi0uh7VWspCMIlybCPknMM");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-beijing");
        request.putQueryParameter("SignName", "burnSkin");
        request.putQueryParameter("TemplateCode", "SMS_205406845");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("TemplateParam", "{'code':'"+code+"'}");
        CommonResponse response=null;
        try {
            response = client.getCommonResponse(request);
            return response;
        } catch (ClientException e) {
            e.printStackTrace();
            return response;
        }

    }
}
