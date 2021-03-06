package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import com.atguigu.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")  Long id){
        return paymentFeignService.getPaymentById(id);

    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //OpenFeign客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
