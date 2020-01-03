package com.demo.MessangerApp.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.MessangerApp.model.Message;

public class MessageRepository {

	Message msg=null;
	List<Message> msgList = null ;
	
	public MessageRepository()
	{
		msg= new Message();
	    msgList=new ArrayList<Message>();
	    
		msg.setMsgId(1L);
		msg.setMessage("best selling book");
		msg.setAuthor("Balagurusamy");
		msg.setCreated(new Date());
		
		msgList.add(msg);
		
		//another msg
		msg= new Message();
		msg.setMsgId(2L);
		msg.setMessage("2 States");
		msg.setAuthor("Chetan Bhagat");
		msg.setCreated(new Date());
		msgList.add(msg);
		
		//another msg
		msg= new Message();
		msg.setMsgId(3L);
		msg.setMessage("Half Girlfriend");
		msg.setAuthor("Chetan Bhagat");
		msg.setCreated(new Date());
		msgList.add(msg);
		
	}
	
	
	public List<Message> getAllMessages()
	{			
		return msgList;
	}
	
	public Message getMessageById(Long msgId)
	{
		
		for(Message m: msgList)
		{
			if(m.getMsgId()==msgId)
			{
				return m;
				
			}
		}		
		
		return null;				
	}
	
	public void createMessage(Message m)
	{
		msgList.add(m);
		
	}
	
	
	
	
}
