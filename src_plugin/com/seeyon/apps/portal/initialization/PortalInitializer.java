package com.seeyon.apps.portal.initialization;

import com.seeyon.ctp.common.AbstractSystemInitializer;

/**
 * @author 刘星锴
 * API文档开发要求，需要新建该类用于启动OA时初始化该本（根据名字）模块
 */
public class PortalInitializer extends AbstractSystemInitializer {

    @Override
    public void destroy(){
        System.out.println("销毁了Portal模块");
    }

    @Override
    public void initialize(){
        System.out.println("初始化Portal握手模块");
    }

}
