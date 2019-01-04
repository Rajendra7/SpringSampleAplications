package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        Organization organization =(Organization) context.getBean("organization");
        System.out.println("Oraganization Name :"+organization.getName());
        System.out.println("Board Members:"+organization.getBoardMembers());
        System.out.println("Branch Mangers:"+organization.getBranchManagers());
        System.out.println("Oragnization Cities:"+organization.getCities());
        System.out.println("Date Of Establishment:"+organization.getDateOfEstablishment());
        System.out.println("Organization Id:"+organization.getOrgId());
        System.out.println("Share Value:"+organization.getShareValue());
        System.out.println("Ip Address :"+organization.getIpAddresses());
        
    }
}
