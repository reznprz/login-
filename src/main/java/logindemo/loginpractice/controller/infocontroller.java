package logindemo.loginpractice.controller;



import org.springframework.web.bind.annotation.*;



@RestController
public class infocontroller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "Hello";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "private";
    }

}
