package com.example.testingweb;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class GreetingServiceA {
	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}
}
