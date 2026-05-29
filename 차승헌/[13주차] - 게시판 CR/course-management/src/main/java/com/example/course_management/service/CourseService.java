package com.example.course_management.service;

import com.example.course_management.domain.Course;
import com.example.course_management.dto.CourseCreateRequest;
import com.example.course_management.dto.CourseResponse;
import com.example.course_management.dto.CourseUpdateRequest;
import com.example.course_management.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// 이 클래스가 Service 계층임을 Spring에게 알려줌
// Spring이 이 클래스를 Bean으로 등록해줌
@Service

// 생성자 주입 방식(@Autowired가 자동으로 됨)
// public CourseService(CourseRepository repository){this.courseRepository = repository} 를 자동으로
@RequiredArgsConstructor

public class CourseService {

    // final로 선언된 필드가 DI의 파라미터로 이용됨.
    private final CourseRepository courseRepository;



    // 수업 등록
    public CourseResponse createCourse(CourseCreateRequest request) {
        Course course = new Course();
        course.setCourseCode(request.getCourseCode());
        course.setTitle(request.getTitle());
        course.setProfessor(request.getProfessor());
        course.setMaxStudents(request.getMaxStudents());
        Course savedCourse = courseRepository.save(course);
        return CourseResponse.from(savedCourse);
    }

    // 전체 수업 조회
    public List<CourseResponse> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(CourseResponse::from)
                .collect(Collectors.toList());
    }

    // 단건 수업 조회
    public CourseResponse getCourse(Long id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("해당 수업이 없습니다. id=" + id));
        return CourseResponse.from(course);
    }

    // 수업 수정
    public CourseResponse updateCourse(Long id, CourseUpdateRequest request) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("해당 수업이 없습니다. id=" + id));
        course.setTitle(request.getTitle());
        course.setProfessor(request.getProfessor());
        course.setMaxStudents(request.getMaxStudents());
        Course updatedCourse = courseRepository.save(course);
        return CourseResponse.from(updatedCourse);
    }

    // 수업 삭제
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}