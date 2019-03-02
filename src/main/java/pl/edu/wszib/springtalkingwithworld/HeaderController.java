package pl.edu.wszib.springtalkingwithworld;

import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.dc.pr.PRError;

import java.util.Random;

import static java.lang.Math.random;

@Controller
@RequestMapping("/headers")
public class HeaderController {
@ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class MyException extends RuntimeException {

    }

    PRError runtimeException = new PRError();
    MyException runtimeException2 = new MyException();
    NoSuchMessageException runtimeException3 = new NoSuchMessageException("123");


    @GetMapping
    public String test() {
        int rand = new Random().nextInt(3);
        if (rand == 0) {
            throw new PRError();
        }
         else if (rand == 1) {
            throw new MyException();
        }
        else {
            throw new NoSuchMessageException("123");
        }
    }



}
