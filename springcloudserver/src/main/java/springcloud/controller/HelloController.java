package springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import springcloud.service.HelloService;

@RestController
public class HelloController {
	
	@Resource
	private HelloService helloService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return helloService.get();
    }

}
