package com.tenco.bank.dto;

import com.tenco.bank.repository.model.Account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SaveDTO {
	private String number;
	private String password;
	private Long Balance;

	public Account toAccount(Integer principalId) {
		return Account.builder().number(this.number).password(this.password).balance(this.Balance).userId(principalId).build();
	}
}
