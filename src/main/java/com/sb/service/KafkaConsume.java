package com.sb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaConsume 
{
	
	private final Logger logger=LoggerFactory.getLogger(KafkaConsume.class);
	@KafkaListener(topics ="kafka_string",groupId ="group_id")
	public void consume(String message)
	{
		//log.info("message    :"+message);
		logger.info("consumed message   :"+message);
	}

	/*@KafkaListener(topics ="kafka_json",groupId ="group_json",containerFactory ="kafkaListenerContainerFactory")
	public void consumeJson(Customer customer)
	{
		System.out.println("Consuming Json:  "+customer);
	}*/
}
