package springbootfileuploaddownload;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbootfileuploaddownload.service.FileService;

import javax.annotation.Resource;

@SpringBootApplication

public class UploadApplication  {

    @Resource
    FileService fileService;


    public static void main(String[] args) {
        SpringApplication.run(UploadApplication.class, args);
    }

//    @Override
//    public void run(String... arg) throws Exception {
//        fileService.deleteAll();
//        fileService.init();
//    }

}
