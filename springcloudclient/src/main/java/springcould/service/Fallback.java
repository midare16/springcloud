package springcould.service;

import org.springframework.stereotype.Component;

@Component
public class Fallback implements IFeignService{

	@Override
	public String get() {
		return "access fall!";
	}

}
