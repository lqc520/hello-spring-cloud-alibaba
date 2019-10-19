package cn.lqcnb.hello.spring.cloud.alibaba.rocketmq.provider;

import cn.lqcnb.hello.spring.cloud.alibaba.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;



@SpringBootApplication
@EnableBinding({ Source.class })
public class RocketMQProviderApplication implements CommandLineRunner {

    @Autowired
    private ProviderService providerService;

    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        providerService.send("Hello RocketMQ");
    }
}
