package com.cq.entity;

import org.junit.Test;

/**
 * hello¿‡≤‚ ‘
 * @author hzx
 * @createDate 2019-04-08
 * @version 1.0
 *
 */
public class HelloTest {
	/**
	 * ≤‚ ‘say∑Ω∑®
	 */
	Hello hello=new Hello();
	@Test
	public void say() {
		hello.say("Maven");
	}
	@Test
	public void out() {
		System.out.println(hello.out());
	}
}
