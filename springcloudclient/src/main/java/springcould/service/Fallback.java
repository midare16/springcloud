package springcould.service;

public class Fallback implements IFeignService{

	@Override
	public String get() {
		return "access fall";
	}

}
