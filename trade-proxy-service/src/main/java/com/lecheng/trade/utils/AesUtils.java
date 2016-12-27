package com.lecheng.trade.utils;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;
import java.util.Arrays;

/**
 * 功能: AES加密工具类
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 16:11
 * 版本: V1.0
 */
public class AesUtils {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(AesUtils.class);

    public static String AesKey = "api.JHuan.com)!^";

    private static byte[] iv = {0x41, 0x72, 0x65, 0x79, 0x6F, 0x75, 0x6D, 0x79, 0x53, 0x6E, 0x6F, 0x77, 0x6D, 0x61, 0x6E, 0x3F};

    /**
     * 加密
     *
     * @param content  需要加密的内容
     * @param password 加密密码
     * @return
     */
    public static String encrypt(String content, String password) {
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            byte[] keyBytes = password.getBytes();
            if (keyBytes.length % base != 0) {
                int groups = keyBytes.length / base + (keyBytes.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyBytes, 0, temp, 0, keyBytes.length);
                keyBytes = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            // 转化成JAVA的密钥格式
            Key key = new SecretKeySpec(keyBytes, "AES");
            // 初始化cipher
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
            return new BASE64Encoder().encode(cipher.doFinal(content.getBytes()));
        } catch (Exception e) {
            logger.error("AesUtils加密失败", e);
        }
        return null;
    }

    /**
     * 解密
     * @param content
     * @param password
     * @return
     */
/*    public static String decrypt(String content, String password) {
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            byte[] keyBytes = password.getBytes();
            if (keyBytes.length % base != 0) {
                int groups = keyBytes.length / base + (keyBytes.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyBytes, 0, temp, 0, keyBytes.length);
                keyBytes = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            // 转化成JAVA的密钥格式
            Key key = new SecretKeySpec(keyBytes, "AES");
            // 初始化cipher
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
            return String.valueOf(cipher.doFinal(new BASE64Decoder().dcontent.getBytes()));
        } catch (Exception e) {
            logger.error("AesUtils解密失败", e);
        }
        return null;
    }

    public static void main(String[] args) {
        String pwd = encrypt("123", AesKey);
        System.out.println(pwd);
        pwd = decrypt(pwd,AesKey);
        System.out.println(pwd);
    }*/
}
