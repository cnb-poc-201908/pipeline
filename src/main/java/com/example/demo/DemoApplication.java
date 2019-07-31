package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class HelloController {

    @RequestMapping("/")
    public String index() {
    	String hostnameString = "";
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:ss.S");
    	String now = sdf.format(new Date());
		try {
			hostnameString = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------------------");
    	System.out.println(hostnameString + " @ " + now);
    	System.out.println("---------------------------");

        return "Greetings from " + hostnameString + " @ " + now;
    }

}
