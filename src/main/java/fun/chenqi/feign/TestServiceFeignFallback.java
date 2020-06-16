package fun.chenqi.feign;

import org.bouncycastle.util.test.Test;
import org.bouncycastle.util.test.TestResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenqi
 * @date 2019/7/8 17:46
 */
@Component
public class TestServiceFeignFallback implements TestFeign {

    @Override
    public String get(String id) {
        return  "出现异常，服务降级";
    }

    @Override
    public String get2() {
        return null;
    }

    @Override
    public String get3(String fr) {
        return null;
    }


}
