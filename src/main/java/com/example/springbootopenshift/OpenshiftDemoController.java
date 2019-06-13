package com.example.springbootopenshift;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenshiftDemoController {

        @Value("${application.message}")
        private String message;

        @GetMapping("/test")
        public String printMessage(){
            return message;
        }

        @GetMapping("/{user}")
        public String printMessage(@PathVariable String user){
            return "Hi "+user+" your spring boot openshift deployment completed";
        }
}
