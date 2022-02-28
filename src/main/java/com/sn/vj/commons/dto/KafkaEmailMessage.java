package com.sn.vj.commons.dto;

import java.util.Date;


import lombok.Data;

@Data
public class KafkaEmailMessage {

	private String email;
	private Integer cuc;
	private String idConsumer;
	private String message;
	private Long timestamp;
	private String idEmail;
	
}
