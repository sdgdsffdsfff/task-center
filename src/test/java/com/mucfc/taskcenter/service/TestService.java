package com.mucfc.taskcenter.service;

import com.mucfc.taskcenter.vo.AppReg;
import com.mucfc.taskcenter.service.AppRegService;
import com.mucfc.taskcenter.control.ScheduleCaller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author HuQingmiao
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:quartz.xml"})
//@TransactionConfiguration(defaultRollback = false)
public class TestService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AppRegService appConfigService;

    @Autowired
    ScheduleCaller scheduleCaller;

//    @Test
//    public void testCURD() {
//        try {
//            // appConfigService.deleteAll();
//
//            AppReg ac1 = new AppReg();
//            ac1.setAppName("爬虫");
//            ac1.setAppCode("192.168.0.1");
//            ac1.setHostName("192.168.0.1");
//            ac1.setCommand("java sfsf ");
//
//            AppReg ac2 = new AppReg();
//            ac2.setAppName("风险集市");
//            ac2.setAppCode("192.168.0.1");
//            ac2.setHostName("192.168.0.3");
//            ac2.setCommand("shell ff ");
//
//            appConfigService.addAppConfig(ac1);
//            appConfigService.addAppConfig(ac2);
//
//
//            List<AppReg> appRegList = appConfigService.findAppConfigs(null, null, null,1,2);
//            for (AppReg ac : appRegList) {
//                log.info(ac.getAppName());
//                log.info(ac.getHostName());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


}