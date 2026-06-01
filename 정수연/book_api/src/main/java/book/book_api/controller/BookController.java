package book.book_api.controller;

import book.book_api.domain.Book;
import book.book_api.dto.BookCreateRequest;
import book.book_api.dto.BookResponse;
import book.book_api.dto.BookUpdateRequest;
import book.book_api.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller //@Controller는 html 화면 그릴때
@RestController
public class BookController {
    private BookService bookService;

    public BookController (BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public BookResponse createBook(@RequestBody BookCreateRequest request){
        BookResponse result = bookService.saveBook(request);
        return result;
    }

    @GetMapping("/books")
    public List<BookResponse> getAllBooks(){
        List<BookResponse> result = bookService.findAllBooks();
        return result;
    }

    @GetMapping("/books/{id}")
    public BookResponse getBookById(@PathVariable Long id){
        //@PathVariable 주소 창에 적힌 {id} 자리에 id를 넣어준다
        BookResponse result = bookService.findBookById(id);
        return result;
    }

    @PutMapping("/books/{id}")
    public BookResponse updateBook(@PathVariable Long id, @RequestBody BookUpdateRequest request){
        BookResponse result = bookService.updateBook(id, request);
        return result;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return "책이 성공적으로 삭제되었습니다. id="+id;
    }

}
