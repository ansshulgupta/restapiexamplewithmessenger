package com.demo.MessangerApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alians")
public class AlianResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Alian getAlian()
	{
		System.out.println("get allian called....");
		Alian a = new Alian();
		a.setAlianId(101);
		a.setAlianName("anshul");
		a.setAlianPoint(100);
				
		return  a;
	}
	
	

}
