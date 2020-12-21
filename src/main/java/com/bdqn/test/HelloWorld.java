package com.bdqn.test;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

///WEB-INF/views/success.jsp
@RequestMapping("/helloword")
@Controller
public class HelloWorld {
    @RequestMapping(value = "/tm",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return "success";
    }
    @RequestMapping("/tsp1")
    public String testSendParam1(@RequestParam(value = "uname",required = false) String un,
    @RequestParam(value ="pwd",required = false) String pwd,
                                 @RequestParam(value = "age",required = false,defaultValue = "0") int id){
        System.out.println(String.format("用户名：%s,密码：%s,id是:%s", un, pwd, id));
        return "success";
    }
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("hello world");
        return "success";
    }
//
    @RequestMapping(value = "/tp",params = {"uname","age!=10"},headers = {"Accept-Language=zh-CN,zh;q=0.9"})
   public String testParam(){
        System.out.println("testParam");
        return "success";
   }
    @RequestMapping("/tsp/{id}")
    public String testSendParam(@PathVariable("id") Integer id){
        System.out.println("参数ID的值是："+id);
        return "success";
   }

}
