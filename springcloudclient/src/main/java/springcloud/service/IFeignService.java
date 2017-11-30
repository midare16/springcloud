package springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="hello", fallback=Fallback.class)
public interface IFeignService {

	@RequestMapping(value = "/access",method = RequestMethod.GET)
	String get();
}
