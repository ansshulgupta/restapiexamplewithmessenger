package com.demo.MessangerApp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.MessangerApp.model.Message;
import com.demo.MessangerApp.repository.MessageRepository;

@Path("message")
public class MessageResource {

	
	MessageRepository repo= new MessageRepository();
		
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("allmessage")
	public List<Message> getAllMessages()
	{
		System.out.println("called getAllMeassage method");		
		
		return repo.getAllMessages();
	}	
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getMessage/{msgid}")         //@Path("/getMessage/1")
	public Message getMessageById(@PathParam("msgid") long msgid)
	{
		System.out.println("called getMessageById method");
		System.out.println(repo.getMessageById(msgid));
		return repo.getMessageById(msgid);
	}
	
	
	
	
	
	
}
