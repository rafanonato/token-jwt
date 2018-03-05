package br.com.security.jtw.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("usuarios")
    @ResponseBody
    public String usuarios(){
       return "{\"users\":[{\"nome\":\"Lucas\", \"cidade\":\"Brazil\"},"
               + "{\"nome\":\"Jackie\",\"cidade\":\"China\"}]}";
    }
}
