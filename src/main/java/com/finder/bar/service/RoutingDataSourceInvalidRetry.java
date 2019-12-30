package com.finder.bar.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 28/27/2019
 */
public class RoutingDataSourceInvalidRetry implements ApplicationContextAware {
	@Autowired
	ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
//
//	@Scheduled(initialDelay = 10 * 60 * 1000, fixedDelay = 60 * 1000)
//	public void runTest() {
//		dataSources = dataSources != null ? dataSources : applicationContext.getBeansOfType(DynamicDataSource.class);
//		Iterator<Entry<String, DynamicDataSource>> it = dataSources.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<String, DynamicDataSource> entry = (Map.Entry<String, DynamicDataSource>) it.next();
//			entry.getValue().retryFailureSlavesDataSource();
//		}
//
//	}

}
