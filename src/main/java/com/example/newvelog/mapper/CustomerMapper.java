package com.example.newvelog.mapper;

import com.example.newvelog.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/*
Mapper인터페이스란?

정의해놓은 sql과 개발할 때 사용하는 메소드를 연결하고 결과 값을 정의해놓은 타입으로 매핑 시켜주는 것

Mybatis 매핑XML에 기재된 SQL을 호출하기 위한 인터페이스이다. Mybatis3.0부터 생겼다.
Mapper인터페이스를 사용하지 않을 경우

SqlSession을 등록해줘야 한다.
DAO인터페이스와 인터페이스를 구현한 DAO클래스를 생성해줘야한다.
Mapper인터페이스를 사용하지 않았을 때는 네임스페이스 + “.” + SQL ID로 지정해서 SQL을 호출해야한다.(예를들면 sesseion.selectOne(“com.test.mapper.TimeMapper.getReplyer, bno ))
selectOne, insert, delete 등 제공하는 메소드를 사용해야 한다.
문자열로 작성하기 때문에 버그가 생길 수 있다.
IDE에서 제공하는 code assist를 사용할 수 없다.
Mapper인터페이스를 사용하는 방법

Mapper인터페이스는 개발자가 직접 작성한다.
mapper 네임스페이스는 패키지명을 포함한 인터페이스 명으로 작성한다.
SQL id는 인터페이스에 정의된 메서드명과 동일하게 작성한다
 */

@Mapper
public interface CustomerMapper {

    List<Customer> getCustomerList();
}