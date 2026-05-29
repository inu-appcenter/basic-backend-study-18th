package com.example.course_management.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

// 수업 등록 요청 시 클라이언트가 보내는 데이터
@Getter
@NoArgsConstructor
public class CourseCreateRequest {
    private String courseCode;
    private String title;
    private String professor;
    private int maxStudents;
}