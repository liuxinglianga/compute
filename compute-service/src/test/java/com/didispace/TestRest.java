package com.didispace;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestRest {

	public static void main(String[] args) throws Exception, ExecutionException 
	{
//		// TODO Auto-generated method stub
//		RestTemplate rest =new RestTemplate();
//		int count=0;
//		long start = System.currentTimeMillis();
//		
//		String url = "http://apis.baidu.com/heweather/weather/free?city=beijing";	
//		 HttpHeaders httpHeaders = new HttpHeaders();
//		  httpHeaders.add("apikey", "0ae09eed4f3c0267cb6e6ed7e1cdda8f"); 
//		  Map<String, String> hashmap = new LinkedHashMap<String, String>();
//	        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(
//	                hashmap, httpHeaders);
//	        
//	        ResponseEntity<String> resp = rest.exchange(url
//	                ,HttpMethod.GET,requestEntity, String.class);
//	        System.out.println(resp.getBody());
//	        
////		List elist = new ArrayList();
////		for(int i=0;i<10000;i++)
////		{
////	
//		String a=	rest.getForObject("http://localhost:5555/add?a=11121531&b="+i, String.class);
////		
////		
////		System.out.println(a);
////		if(a.equals("error"))
////		{
////			elist.add(i);
////			count++;
////		}
////		}
////		System.out.println("耗时："+(System.currentTimeMillis()-start)+"毫秒");
////		System.out.println("失败次数："+count);
////		System.out.println("失败下标："+elist);
		String url="http://192.168.3.131:3333/add";
		ExecutorService pool = Executors.newFixedThreadPool(100);
		List tasks = new ArrayList(10000);
		for(int i=0;i<5000;i++)
		{
			tasks.add(new Ctask(url) );
			System.out.println("任务"+i);
		}
		pool.invokeAll(tasks);
	

	}
	

}
