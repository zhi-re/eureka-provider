package fun.chenqi.controller;

import fun.chenqi.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenqi
 * @date 2019/7/8 13:37
 */

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    private TestFeign feign;

    @GetMapping("/hello")
    public String hello() {
        String s = feign.get("1234");
        return s;
    }
    @PostMapping("/hello2")
    public String hello2() {
        String s = feign.get2();
        System.out.println(s);
        return s;
    }

    @PostMapping("/hello3")
    public String hello3() {
        String s = feign.get3("daohang");
        System.out.println(s);
        return s;
    }
}
