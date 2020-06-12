package org.example.cloud.product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import java.util.Scanner;
@SpringBootApplication
@EnableEurekaClient
public class ProductDataApp
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入端口号：");
        String port = scanner.next();
        new SpringApplicationBuilder(ProductDataApp.class).properties("server.port="+port).run(args);

    }
}
