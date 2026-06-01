package book.book_api.service;

import book.book_api.domain.Book;
import book.book_api.dto.BookCreateRequest;
import book.book_api.dto.BookResponse;
import book.book_api.dto.BookUpdateRequest;
import book.book_api.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookService {
    //레포지토리 가져오기
    private final BookRepository bookRepository;

    //@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //책 등록
    public BookResponse saveBook(BookCreateRequest request){
        Book book = new Book(request.getTitle(), request.getAuthor(), request.getPublishedYear());
        Book savedBook = bookRepository.save(book);
        return new BookResponse(savedBook);
    }

    //책 전체 목록 조회
    public List<BookResponse> findAllBooks(){
        List<Book> books = bookRepository.findAll();
        return books.stream()
                .map(book->new BookResponse(book))
                .collect(Collectors.toList());
    }

    //아이디로 책 조회
    public BookResponse findBookById(Long id){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 책이 존재하지 않습니다. id = "+id));
        return new BookResponse(book);
    }

    //책 정보 업데이트
    public BookResponse updateBook(Long id, BookUpdateRequest request){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 책이 존재하지 않습니다. id = "+id));
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPublishedYear(request.getPublishedYear());

        return new BookResponse(book);
    }

    public void deleteBook(Long id){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 책이 존재하지 않습니다. id = "+id));
        bookRepository.delete(book);
    }
}
