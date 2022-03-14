package com.company;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long start;
        long end;

        DBManager dbManager = DBManager.getDbManager();
        System.out.println(dbManager);

        start=System.currentTimeMillis();
        Connection connection=dbManager.getConnection();
        end=System.currentTimeMillis();

        System.out.println(end-start);

        DBManager dbManager1 = DBManager.getDbManager();
        start=System.currentTimeMillis();
        Connection connection1=dbManager.getConnection();
        //System.out.println(dbManager1);
        end=System.currentTimeMillis();

        System.out.println(end-start);

    }
}
