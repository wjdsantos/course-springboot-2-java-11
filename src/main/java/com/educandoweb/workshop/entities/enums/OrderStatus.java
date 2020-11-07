package com.educandoweb.workshop.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) { //Construtor para o tipo Enumerado, com números. No tipo Enumerado o construtor é 'private'
		this.code = code;
	}
	
	public int getCode() {  //Método para esse código ficar acessivel p/ o mundo exterior
		return code;
	}
	
	public static OrderStatus valueOf(int code) {  //Método pra converte um valor numérico para um tipo Enumerado
		for (OrderStatus value : OrderStatus.values()) {  //Esse método é 'static' pq esse método vai funcionar sem precisar estanciar
			if (value.getCode() == code) {  //Percorrendo todos os val. possíveis do enumerado verificando se o 'code' é aquele que foi recebido
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
