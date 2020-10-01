package learn.elasticbeanstalk.springbootebs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping(value = "/cicd")
public class GenericController {

    @RequestMapping(value ="/codestar",method = {RequestMethod.GET})
    public String getServerInfo(){
        return "Codestar:Available Processor:"+Runtime.getRuntime().availableProcessors() +" \nTimeNow: "+new Date();
    }

    @RequestMapping(value ="/codepipeline",method = {RequestMethod.GET})
    public String getServerInfoGeneric(){
        return "CodePipeline:Available Processor:"+Runtime.getRuntime().availableProcessors() +" \nTimeNow: "+new Date();
    }
}
