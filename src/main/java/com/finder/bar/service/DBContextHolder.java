package com.finder.bar.service;

public class DBContextHolder {

	private static final ThreadLocal<DBType> contextHolder = new ThreadLocal<>();

	public static void setCurrentDb(DBType dbType) {
		contextHolder.set(dbType);
	}

	public static DBType getCurrentDb() {
		return contextHolder.get();
	}

	public static void clear() {
		contextHolder.remove();
	}
}
