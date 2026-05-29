package com.example.course_management.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

// 수업 수정 요청 시 클라이언트가 보내는 데이터
@Getter
@NoArgsConstructor
public class CourseUpdateRequest {
    private String title;
    private String professor;
    private int maxStudents;
}