package com.lnzz.listener;

import com.google.gson.Gson;
import com.lnzz.pojo.PayInfo;
import com.lnzz.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName：PayMsgListener
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/24 10:14
 * @Description:
 */

@Component
@RabbitListener(queues = "payNotify")
@Slf4j
public class PayMsgListener {

    @Autowired
    private OrderService orderService;

    @RabbitHandler
    public void process(String msg) {
        log.info("【接收到消息】=> {}", msg);

        PayInfo payInfo = new Gson().fromJson(msg, PayInfo.class);
        if (payInfo.getPlatformStatus().equals("SUCCESS")) {
            //修改订单里的状态
            orderService.paid(payInfo.getOrderNo());
        }
    }
}

