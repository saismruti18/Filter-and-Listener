package com.sai;

import javax.servlet.*;

public class MyListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent e)
    {
        System.out.println("Server Started!");
    }

    public void contextDestroyed(ServletContextEvent e)
    {
        System.out.println("Server Stopped!");
    }
}