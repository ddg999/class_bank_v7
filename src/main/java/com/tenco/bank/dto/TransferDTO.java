package com.tenco.bank.dto;

import lombok.Data;

@Data
public class TransferDTO {
	private String wAccountNumber; // 출금 계좌 번호
	private String password; // 출금 계좌 비밀번호
	private String dAccountNumber; // 입금 계좌 번호
	private Long amount; // 거래 금액
}
