package org.o7planning.hellospringmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public Connection cn;
    public void KetNoi() throws Exception{
   	 //B1: Xac dinh hqtcsdl
   	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-NRD44P2:1433;databaseName=NGUYENKIMNGAN;user=sa; password=123456");
        System.out.println("Da ket noi");
    }

}
