package cn.sysu.purchase;

import cn.sysu.purchase.Config.RedisConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(RedisConfig.class);
    }
}