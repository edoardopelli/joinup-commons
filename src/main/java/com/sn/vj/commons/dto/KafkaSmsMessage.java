package com.sn.vj.commons.dto;

import java.time.Instant;

import lombok.Data;
import lombok.Getter;

@Data
public class KafkaSmsMessage {

	private String mobile;
	private Integer cuc;
	private String idConsumer;
	private String message;
	private Long timestamp;
	private String idSms;
	@Getter
	private final Instant instant = Instant.now();
	
}
