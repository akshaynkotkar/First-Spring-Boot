package com.example.introductionto.SampleLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleLearningApplication implements CommandLineRunner {
	@Autowired // Annotation notify SB that inject this object whenever it is used
	Apple obj1;// We need to create like this here using SB we are creating obj without new keyword
	public static void main(String[] args) {
		SpringApplication.run(SampleLearningApplication.class, args);
		//Apple obj=new Apple();// T his will not give any error but in SB beans takes care of object no need to create like this
//Apple obj; we can not create obj like this
		//obj.eatApple();// But still this give an error we cannot have a access of non static field
	//For that need to implement  CommandLineRunner click on it and implement run method
	}
@Autowired
Apple obj2;
	@Autowired
	DBService dbService;
	@Override
	public void run(String... args) throws Exception {
		obj1.eatApple();// This will give an runtime error null ptr exception need to make a bean of apple class
		/*
		 Add @Component top of the class That will notify the spring framework that all
		 the objects are created with spring framework
		 */
		/*
		Then obj.eatApple(); still gives error bcz we haven't notified the SB that inject the Bean
		Dependency of Apple class
		For Injecting bean We are using @Autowired Annotation
		 */
		obj2.eatApple();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		/*
		Output of singleton is its scope is singleton only:

Creating the apple before use
2024-11-10T14:07:59.887+05:30  INFO 21784 --- [SampleLearning] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 27 (http) with context path '/'
2024-11-10T14:07:59.895+05:30  INFO 21784 --- [SampleLearning] [           main] c.e.i.S.SampleLearningApplication        : Started SampleLearningApplication in 1.502 seconds (process running for 1.944)
I'm eating the Apple
I'm eating the Apple
1841945133
1841945133


		 */
		System.out.println(dbService.getData());// this obj used to take the data
		/*
		Required 1 Bean but 2 were found error
		Here in this case created two beans but need to make one bean as primary else it will
		throw an error
		 */
	}
}
