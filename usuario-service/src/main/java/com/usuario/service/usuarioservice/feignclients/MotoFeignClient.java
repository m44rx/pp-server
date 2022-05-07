package com.usuario.service.usuarioservice.feignclients;

import java.util.List;

import com.usuario.service.usuarioservice.models.Moto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "moto-service", url = "http://localhost:8083")
public interface MotoFeignClient {

    @PostMapping("/moto")
    public Moto save(@RequestBody Moto moto);
    
    @GetMapping("/moto/usuario/{usuarioId}")
    public List<Moto> getMotos(@PathVariable int usuarioId);
    
}
