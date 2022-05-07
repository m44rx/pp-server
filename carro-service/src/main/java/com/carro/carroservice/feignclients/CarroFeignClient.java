package com.carro.carroservice.feignclients;

import com.carro.carroservice.entity.Carro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "carro-service",url = "http://localhost:8082")
@RequestMapping("/carro")
public interface CarroFeignClient {

    public Carro save(@RequestBody Carro carro);
    
}
