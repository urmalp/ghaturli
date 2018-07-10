package urmalp.github.com.ghaturli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhaturliApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhaturliApplication.class, args);
        BinarySearchImpl search = new BinarySearchImpl();
        int result = search.binarySearch(new int[]{12, 14, 6}, 3);
        System.out.println(result);
        SpringApplication.run(GhaturliApplication.class, args);
    }
}
