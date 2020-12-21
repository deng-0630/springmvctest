package com.bdqn.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentView {
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public String add(){
        System.out.println("添加一个学生");
        return "success";
    }
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.DELETE)
    public String del(@PathVariable("id") Integer id){
        System.out.println("删除一个学生:"+id);

        return "success";
    }
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.PUT)
    public String update(@PathVariable("id") Integer id){
        System.out.println("更新一个学生:"+id);
        return "success";
    }
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.GET)
    public String query(@PathVariable("id") Integer id){
        System.out.println("查询一个学生"+id);
        return "success";
    }
}
