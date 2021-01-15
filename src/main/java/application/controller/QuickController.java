package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: liujingxiang
 * @time: 2021/1/13 20:10
 */
@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello springboot";
    }
}
