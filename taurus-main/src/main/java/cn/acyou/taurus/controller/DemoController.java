package cn.acyou.taurus.controller;

import cn.acyou.taurus.entity.Boss;
import cn.acyou.taurus.mapper.BossMapper;
import cn.acyou.taurus.service.BossService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private BossMapper bossMapper;
    @Autowired
    private BossService bossService;

    @ResponseBody
    @RequestMapping("index")
    public List<Boss> index(){
        List<Boss> bosses = bossMapper.selectList(null);
        bosses.forEach(x-> log.info(x.toString()));
        return bosses;
    }
    @ResponseBody
    @RequestMapping("index2")
    public List<Boss> index2(){
        List<Boss> bosses = bossMapper.selectList(null);
        bosses.forEach(x-> log.info(x.toString()));
        return bosses;
    }
}
