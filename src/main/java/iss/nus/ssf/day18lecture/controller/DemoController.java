package iss.nus.ssf.day18lecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/demo")
public class DemoController {

    public ResponseEntity<?> hello(){
        try{
            return new ResponseEntity<>("Springboot is okay!", HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>("Springboot is NOT okay. Error runnning...", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
}
