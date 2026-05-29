package com.example.course_management.repository;

import com.example.course_management.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 상속 -> 기본 CRUD 메서드
// <Course, Long> = <엔티티 타입, PK 타입>
public interface CourseRepository extends JpaRepository<Course, Long> {
}