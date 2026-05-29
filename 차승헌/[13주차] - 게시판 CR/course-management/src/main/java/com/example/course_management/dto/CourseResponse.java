package com.example.course_management.dto;

import com.example.course_management.domain.Course;
import lombok.Getter;

// 클라이언트에게 반환하는 데이터
// 엔티티를 직접 노출하지 않고 필요한 데이터만 담아서 반환
@Getter
public class CourseResponse {
    private Long id;
    private String courseCode;
    private String title;
    private String professor;
    private int maxStudents;

    // Course 엔티티를 받아서 CourseResponse로 변환해주는 정적 팩토리 메서드
    public static CourseResponse from(Course course) {
        CourseResponse response = new CourseResponse();
        response.id = course.getId();
        response.courseCode = course.getCourseCode();
        response.title = course.getTitle();
        response.professor = course.getProfessor();
        response.maxStudents = course.getMaxStudents();
        return response;
    }
}