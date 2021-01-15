package application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: liujingxiang
 * @time: 2021/1/14 11:22
 */
@Controller
public class Quick2Controller {

    @Value("${name}")//从yml配置文件中获取值
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        //获得配置文件的信息
        System.out.println(name);
        System.out.println(addr);
        return "name: "+name+"\n addr: "+addr;
    }
}
