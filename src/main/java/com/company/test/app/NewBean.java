package com.company.test.app;

import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NewBean {
    Logger logger = LoggerFactory.getLogger(NewBean.class);
    private final DataManager dataManager;

    public NewBean(DataManager dataManager) {
        this.dataManager = dataManager;
        if (dataManager == null) {
            logger.warn("DataManager is null");
        } else {
            logger.warn("DataManager is " + dataManager);
        }
    }
}