package J2EE_Bai6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J2EE_Bai6.models.Book;
import J2EE_Bai6.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() { return bookRepository.findAll(); }
    @SuppressWarnings("null")
    public Book saveBook(Book book) { return bookRepository.save(book); }
    public Book getBookById(int id) { return bookRepository.findById(id).orElse(null); }
    @SuppressWarnings("null")
    public Book updateBook(Book book) { return bookRepository.save(book); }
    public void deleteBook(int id) { bookRepository.deleteById(id); }
}