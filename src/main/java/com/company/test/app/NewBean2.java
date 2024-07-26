package com.company.test.app;

import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewBean2 {
    Logger logger = LoggerFactory.getLogger(NewBean.class);

    @Autowired
    private DataManager dataManager;

    public NewBean2( ) {
        if (dataManager == null) {
            logger.warn("DataManager is null");
        } else {
            logger.warn("DataManager is " + dataManager);
        }
    }
}