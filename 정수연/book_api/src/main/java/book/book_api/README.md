# 도서 및 카테고리 관리 시스템

## 도메인 설명
### Book: 도서 id, 제목, 저자, 출판년도 정보를 저장하고 관리한다
### rest api: 도서 등록, 전체 목록 조회, 단건 조회, 수정, 삭제 제공

## ERD
### 엔티티 : Book
PK  id : Long
    title : String
    author : String
    publishedYear : int

## api 명세서
기능              http 메서드/url       요청DTO                응답DTO
도서 등록          post /books         BookCreateRequest     BookResponse
도서 전체 조회      get /books                                List<BookResponse>
도서 한권 조회      get /boooks/{id}                          BookResponse
도서 수정          put /books/{id}     BookUpdateRequest     BookResponse
도서 삭제         delete /books/{id}                         String

