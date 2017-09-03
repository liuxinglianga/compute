package com.didispace;

import java.util.concurrent.Callable;

import org.springframework.web.client.RestTemplate;

public class Ctask implements Callable<String> {

	public Ctask(String url)
	{
		this.url=url;
		
	}
	private String url;
	private RestTemplate restTmp=new RestTemplate() ;
	@Override
	public String call() throws Exception {

		String result=	restTmp.getForObject(url, String.class);
		System.out.println(result);
		return result;
	}

}
