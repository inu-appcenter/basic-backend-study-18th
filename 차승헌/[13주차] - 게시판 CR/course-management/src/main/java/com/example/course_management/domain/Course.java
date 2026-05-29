package com.example.course_management.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // JPA가 테이블 생성
@Setter
@Getter //lombok이 게터 메서드 자동 생성
@NoArgsConstructor //lombok이 기본 생성자 생성
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 id값 배정
    private Long id;

    private String courseCode; // 수업 코드
    private String title;
    private String professor;
    private int maxStudents; //최대 수강 인원
}