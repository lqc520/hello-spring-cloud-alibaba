package cn.lqcnb.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import cn.lqcnb.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.NacosProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = NacosProviderFallback.class)
public interface NacosProviderService {

    @GetMapping(value = "echo/{message}")
    public String echo(@PathVariable("message") String message);
}
