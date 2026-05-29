package com.example.course_management.controller;

import com.example.course_management.dto.CourseCreateRequest;
import com.example.course_management.dto.CourseResponse;
import com.example.course_management.dto.CourseUpdateRequest;
import com.example.course_management.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// @Controller + @ResponseBody 를 합친 것
// @ResponseBody -> 메서드의 리턴 값을 뷰에서 찾지 않고, response body로 넘김(Json 형태)
@RestController

// 이 Controller의 기본 URL 경로를 /courses로 설정
@RequestMapping("/courses")

// CourseService를 생성자 주입 받기 위한 Lombok 애노테이션
@RequiredArgsConstructor

public class CourseController {

    private final CourseService courseService;

    // POST /courses - 수업 등록
    // @RequestBody: HTTP 요청의 Body(JSON)를 CourseCreateRequest 객체로 변환해줌
    @PostMapping
    //ResponseEntity -> Spring의 래퍼 클래스로, http 상태 헤더를 포함한 제네럴 클래스임(CourseResponse 반환)
    //@RequestBody -> request body의 json 데이터를 메서드 파라미터 타입에 맞게 변환시킴.
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseCreateRequest request) {
        CourseResponse response = courseService.createCourse(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // GET /courses - 전체 수업 조회
    @GetMapping
    public ResponseEntity<List<CourseResponse>> getAllCourses() {
        List<CourseResponse> responses = courseService.getAllCourses();
        return ResponseEntity.ok(responses);
    }

    // GET /courses/{id} - 단건 수업 조회
    // @PathVariable: URL 경로의 {id} 값을 파라미터로 받아줌
    @GetMapping("/{id}")
    public ResponseEntity<CourseResponse> getCourse(@PathVariable Long id) {
        CourseResponse response = courseService.getCourse(id);
        return ResponseEntity.ok(response);
    }

    // PUT /courses/{id} - 수업 수정
    @PutMapping("/{id}")
    public ResponseEntity<CourseResponse> updateCourse(@PathVariable Long id, @RequestBody CourseUpdateRequest request) {
        CourseResponse response = courseService.updateCourse(id, request);
        return ResponseEntity.ok(response);
    }

    // DELETE /courses/{id} - 수업 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}