package explarity.example.uploadMultiFiles.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@RestController
@RequestMapping("api")
public class UploadMultipleFiles {

    private Logger log = LoggerFactory.getLogger(UploadMultipleFiles.class);


    @PostMapping("upload-files")
    public ResponseEntity<?> uploadMultiFiles(@RequestParam("images")MultipartFile[] files){

        log.info("{} number of files uploded ",files.length);

        Arrays.stream(files).forEach(uploadMultiFiles->{

            log.info(" file name {}",uploadMultiFiles.getOriginalFilename());
            log.info(" file type {} ",uploadMultiFiles.getContentType());
            System.out.println("............");

        });

        return ResponseEntity.ok("file Uploaded SuccessFully !!!");
    }

}
