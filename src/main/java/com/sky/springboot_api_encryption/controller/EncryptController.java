package com.sky.springboot_api_encryption.controller;

import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;
import com.sky.springboot_api_encryption.entity.TestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptController {

    /**
     * 加密
     * @return
     */
    @Encrypt
    @GetMapping("/encryption")
    public TestBean encryption(){
        TestBean testBean = new TestBean();
        testBean.setName("sky");
        testBean.setAge(18);
        return  testBean;
    }

    @Decrypt
    @PostMapping("/decryption")
    public TestBean decryption(@RequestBody TestBean testBean){
        System.out.println(testBean.toString());
        return testBean;
    }





}
