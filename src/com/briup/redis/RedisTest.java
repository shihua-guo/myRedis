package com.briup.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Server is Running:"+jedis.ping());
		jedis.set("map1", "alan");
		System.out.println(jedis.get("map1"));
		//存入表中
		jedis.lpush("myList", "alan");
		jedis.lpush("myList", "jade");
		
	}
}
