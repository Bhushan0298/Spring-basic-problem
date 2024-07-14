package com.glo.glo_logistics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.glo.glo_logistics.model.Fleet;
import com.glo.glo_logistics.service.FleetService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

         FleetService fleetService = (FleetService) context.getBean("fleetService");

         Fleet fleet1 = new Fleet(1, "FleetOne", "TypeA");
         fleetService.addFleet(fleet1);

         fleetService.getAllFleets().forEach(fleet -> {
             System.out.println("Fleet ID: " + fleet.getId());
             System.out.println("Fleet Name: " + fleet.getName());
             System.out.println("Fleet Type: " + fleet.getType());
         });
    }
}
