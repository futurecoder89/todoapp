package com.example.todoapp.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Todo")
@Table(name= "todo") /*이 entity은 "todo"라는 테이블과 자동연결*/
@AllArgsConstructor //자동생성자생성
@NoArgsConstructor //빈 기본생성자
@Getter
@Setter
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동생성
    private Long id;

    @NotNull
    private String todo;
}
