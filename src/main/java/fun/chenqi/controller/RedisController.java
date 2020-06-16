package fun.chenqi.controller;

import fun.chenqi.config.DistributedRedisLock;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author chenqi
 * @date 2019/7/15 10:01
 */
@RequestMapping("redisTest")
@RestController
public class RedisController {


    //    @Resource
//    private Redisson redisson;
//
//    @RequestMapping("redis")
//    public String redis(){
//        RLock lock = redisson.getLock("kkkey");
//        lock.lock(60, TimeUnit.SECONDS); //设置60秒自动释放锁  （默认是30秒自动过期）
//        System.out.println("provider------1-----");
//        System.out.println("provider--1----修改了库");
//        lock.unlock(); //释放锁
//        return "11111";
//    }
    @RequestMapping("redis2")
    public String redis2() throws InterruptedException {
        String key = "test123";
        //加锁
        DistributedRedisLock.acquire(key);
        System.out.println("provider------1-----");
        Thread.sleep(50000);
        System.out.println("provider--1----修改了库");

        //释放锁
        DistributedRedisLock.release(key);
        System.out.println(new Date().getTime());
        return "1111111111";
    }

}
