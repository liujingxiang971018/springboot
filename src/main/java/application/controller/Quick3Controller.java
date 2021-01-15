package application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: liujingxiang
 * @time: 2021/1/14 11:22
 */
@Controller
@ConfigurationProperties(prefix = "person")//从yml文件中找key的前缀为person的value
public class Quick3Controller {


    private String name;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        //获得配置文件的信息
        System.out.println(name);
        System.out.println(addr);
        return "name: "+name+"\n addr: "+addr;
    }
}
