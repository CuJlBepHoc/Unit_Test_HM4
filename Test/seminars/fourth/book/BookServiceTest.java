package seminars.fourth.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

class BookServiceTest {

    @Test
    public void testFindBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        Book foundBook = bookService.findBookById("1");

        assertEquals("Book1", foundBook.getTitle());
        assertEquals("Author1", foundBook.getAuthor());

        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    public void testFindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);

        List<Book> foundBooks = bookService.findAllBooks();

        assertEquals(2, foundBooks.size());

        verify(bookRepository, times(1)).findAll();
    }
}