package cn.bdqn.bdqnproject.distributorch.controller;

import cn.bdqn.bdqnproject.distributorch.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 杨幸运
 * @create 2020/12/5
 */
@Controller
@RequestMapping("/admin")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public String test(@PathVariable Integer id){
        String str = testService.test(id).toString();
        System.out.println(str);
        return  str;
    }
}
