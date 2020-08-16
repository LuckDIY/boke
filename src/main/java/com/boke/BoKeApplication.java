package com.boke;

import com.boke.vo.ResponseVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping
@RestController
public class BoKeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoKeApplication.class);
    }

    @GetMapping("ok")
    public ResponseVo ok(){
        return new ResponseVo();
    }


}
