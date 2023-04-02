package tacos.security;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorHandler {

  @ExceptionHandler(value = Exception.class)
  public ModelAndView handleAllExceptions(Exception ex) {
    ModelAndView model = new ModelAndView("error");
    model.addObject("errorMessage", "An error occurred: " + ex.getMessage());
    return model;
  }
}

