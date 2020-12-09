package com.zc.add.common;

import com.aliyun.oss.OSSClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * oss的照片上传删除等功能
 */
public class UplodeFile {
    //阿里云注释
    // 阿里云oss上传文件相关属性值
    // 阿里云API的外网域名
    public static final String ENDPOINT = "oss-cn-beijing.aliyuncs.com";
    // 阿里云API的密钥
    public static final String ACCESS_KEY_ID = "LTAI4GBUq7npBGtMSH3fHqnD";
    // 阿里云API的密钥Access Key Secret
    public static final String ACCESS_KEY_SECRET = "TQEjD3ZWMi0uh7VWspCMIlybCPknMM";
    // 阿里云API的bucket名称
    public static final String BACKET_NAME = "picojiao";
    public static final String FOLDER = "photo/";
    public static final String URL = "https://picojiao.oss-cn-beijing.aliyuncs.com/";

    public static ServerResponse importPhoto(MultipartFile file) {
        InputStream is = null;
        OSSClient ossClient = null;
        try {
            // 1.创建OssClient客户端对象
            ossClient = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
            // 2.获取文件名
            String originalFilename = file.getOriginalFilename();
            // 3.获取文件的后缀
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            // 4.给文件重命名，为了防止文件被覆盖
            String newFileName = UUID.randomUUID().toString() + suffix;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(new Date());

            // 5.创建文件输入流
            is = file.getInputStream();
            // 6.调用OssClient中的putObject方法进行上传
            ossClient.putObject(BACKET_NAME,format+"/"+ newFileName, is);
            return ServerResponse.success( URL + format+"/" + newFileName);
        } catch (IOException e) {
            e.printStackTrace();
            return ServerResponse.error();
        } finally {
            //关流

            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 关闭oss客户端
            if (ossClient != null) {
                ossClient.shutdown();
            }

        }
    }
    public static void deleteOssphoto(String photo){
        OSSClient ossClient = null;
        if(StringUtils.isNotBlank(photo)) {
            String photoName = photo.replace(URL, "");
            ossClient = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
            ossClient.deleteObject(BACKET_NAME, photoName);
        }
        }
    }



