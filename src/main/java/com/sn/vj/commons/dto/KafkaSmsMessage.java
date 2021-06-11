package com.sn.vj.commons.dto;

import java.util.Date;


import lombok.Data;

@Data
public class KafkaSmsMessage {

	private String mobile;
	private Integer cuc;
	private String idConsumer;
	private String message;
	private Long timestamp;
	private String idSms;
	
}
