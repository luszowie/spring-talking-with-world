package pl.edu.wszib.springtalkingwithworld;

import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sun.dc.pr.PRError;

@Component
public class ControllerAdvice {

    @ExceptionHandler(PRError.class)
    public String runtimeException()

    {
        return "ASDF";

    }

    @ExceptionHandler(HeaderController.MyException.class)
    public String MyException()

    {
        return "ASDF2";

    }

    @ExceptionHandler(NoSuchMessageException.class)
    public String exception3()

    {
        return "ASDF3";

    }

}
