package com.JuanOsorio.MINTIC.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.JuanOsorio.MINTIC.model.Message;
import com.JuanOsorio.MINTIC.repository.crud.MessageCrudRepository;

@Repository
public class MessageRepository {

	@Autowired
	private MessageCrudRepository messageCrudRepository;
	
	public List<Message> getAll(){
		return (List<Message>) messageCrudRepository.findAll();
	}
	
	public Optional<Message> getMessage(Integer id){
		return messageCrudRepository.findById(id);
	}
	
	public Message save(Message message) {
		return messageCrudRepository.save(message);
	}
	
	public void delete(Message message) {
		messageCrudRepository.delete(message);
	}
	
	
}
