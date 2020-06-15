package org.example;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入端口号：");
        String port = scanner.next();
        new SpringApplicationBuilder(FeignApplication.class).properties("server.port="+port).run(args);
    }
}
