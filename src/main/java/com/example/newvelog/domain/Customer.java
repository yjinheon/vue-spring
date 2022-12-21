package com.example.newvelog.domain;
import lombok.Data;

/*
DAO : 실질적으로  DB에 접근하여 데이터 조회하거나 조작

 */
@Data
public class Customer {
    // CamelCase 형태로 설정
    private String lastName;
    private String firstName;
    private String email;
    
}
