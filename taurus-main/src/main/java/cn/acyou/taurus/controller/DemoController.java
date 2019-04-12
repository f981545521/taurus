package cn.acyou.taurus.controller;

import cn.acyou.taurus.entity.Boss;
import cn.acyou.taurus.mapper.BossMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author youfang
 * @version [1.0.0, 2019-04-12 上午 09:36]
 **/
@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private BossMapper bossMapper;

    @ResponseBody
    @RequestMapping("index")
    public List<Boss> index(){
        List<Boss> bosses = bossMapper.selectList(null);
        return bosses;
    }
}
