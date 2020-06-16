package fun.chenqi.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenqi
 * @date 2019/7/8 17:46
 */
@FeignClient(value = "server-provider-two", fallback = TestServiceFeignFallback.class
)
public interface TestFeign {
    @GetMapping("test/test01")
    public String get(@RequestParam("id") String id);

    @PostMapping("test/test02")
    String get2();

    @PostMapping("/home/experthome")
    String get3(@RequestParam("fr") String fr);
}
