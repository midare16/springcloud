package springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import springcloud.service.IFeignService;

@RestController
public class HelloController {
	
	@Resource
	private IFeignService feignService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return feignService.get();
    }

    
}
