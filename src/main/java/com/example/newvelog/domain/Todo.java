package com.example.newvelog.domain; // Model에 해당

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@DynamicInsert // insert 생성 시점에 Null이 아닌 컬럼들만 포함한다.
public class Todo {
    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Long id;

    private String item;

    private String date;

    private boolean completed;

    private String time;

    private LocalDateTime writeDate;
    private LocalDateTime updateDate;

    @Column(columnDefinition = "varchar(1) default 'Y'")
    private String useYn;


}
