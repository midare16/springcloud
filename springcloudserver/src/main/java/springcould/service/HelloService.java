package springcould.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Resource
	private RestTemplate restTemplate;
	
	public String get(){
		return restTemplate.getForObject("http://MIDARE/search",String.class);
	}
}
