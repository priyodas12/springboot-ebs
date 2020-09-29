package learn.elasticbeanstalk.springbootebs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@RestController
public class EbsController {

    @GetMapping("/ebs")
    public String getEbsInfo(){
        return "I'm"+ UUID.randomUUID()+" generating\n  "+new Date();
    }
}
