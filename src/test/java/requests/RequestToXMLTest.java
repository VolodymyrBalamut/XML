package requests;

import org.junit.Test;

import javax.xml.xquery.XQException;

import static org.junit.Assert.*;

public class RequestToXMLTest {
    public RequestToXML request;
    public RequestToXMLTest() throws XQException {
        request = new RequestToXML();
    }

    @Test
    public void getListOfBooks() throws Exception {
        String expected ="[Inferno, Harry Potter and the Philosopher's Stone, " +
                "The Chamber of Secrets, The Prisoner of Azkaban, " +
                "The Goblet of Fire, The Da Vinci Code, Angels and Demons," +
                " The Alchemist , Fahrenheit 451, " +
                "The Old Man and the Sea, A Farewell to Arms, The Picture of Dorian Gray, Ulysses, The Financier, The Titan, The Sun Also Rises]";
        assertEquals(request.getListOfBooks(), expected);
    }

    @Test
    public void getListOfAuthors() throws Exception {
        String expected ="[Dan Brown, Ernest Hemingway, James Joyce, Joanne Rowling, Oscar Wilde, Paulo Coelho, Ray Bradbury, Theodore Dreiser]";
        assertEquals(request.getListOfAuthors(), expected);
    }

    @Test
    public void getListOfGenres() throws Exception {
        String expected ="[Modernist novel, Philosophical fiction, adventure, drama, dystopian, fantasy, mystery]";
        assertEquals(request.getListOfGenres(), expected);
    }

    @Test
    public void getListOfCities() throws Exception {
        String expected ="[Dublin, Exeter, Holywell, New York, Rio de Janeiro, Terre Haute]";
        assertEquals(request.getListOfCities(), expected);
    }

    @Test
    public void getListOfPublishers() throws Exception {
        String expected ="[Ballantine Books, Bloomsbury, Charles Scribner's Sons, Doubleday, Harper and Brothers, HarperTorch, John Lane, Lippincott's Monthly Magazine, Scribner, Sylvia Beach, The Lost Symbol]";
        assertEquals(request.getListOfPublishers(), expected);
    }

    @Test
    public void getListOfBooksByAuthor() throws Exception {
        String expected ="[Inferno, The Da Vinci Code, Angels and Demons]";
        assertEquals(request.getListOfBooksByAuthor("Dan Brown"), expected);
    }

    @Test
    public void getListOfBooksByPublisher() throws Exception {
        String expected ="[Inferno]";
        assertEquals(request.getListOfBooksByPublisher("The Lost Symbol"), expected);
    }

    @Test
    public void getListOfBooksByGenre() throws Exception {
        String expected ="[Inferno, The Da Vinci Code, Angels and Demons]";
        assertEquals(request.getListOfBooksByGenre("mystery"), expected);
    }

    @Test
    public void getListOfBookByDate() throws Exception {
        String expected ="[The Da Vinci Code, Inferno]";
        assertEquals(request.getListOfBookByDate("2000","2017"), expected);
    }

    @Test
    public void getListOfBookByPrice() throws Exception {
        String expected ="[The Old Man and the Sea, A Farewell to Arms, Fahrenheit 451, The Picture of Dorian Gray, The Sun Also Rises]";
        assertEquals(request.getListOfBookByPrice("20","50"), expected);
    }

    @Test
    public void getCountOfBooksByAuthor() throws Exception {
        String expected ="[3]";
        assertEquals(request.getCountOfBooksByAuthor("Dan Brown"), expected);
    }

    @Test
    public void getTotalPriceOfBooksByAuthor() throws Exception {
        String expected ="[84]";
        assertEquals(request.getTotalPriceOfBooksByAuthor("Dan Brown"), expected);
    }

    @Test
    public void getCountOfSolidBooks() throws Exception {
        String expected ="[9]";
        assertEquals(request.getCountOfSolidBooks(), expected);
    }

    @Test
    public void getCountOfSoftBooks() throws Exception {
        String expected ="[7]";
        assertEquals(request.getCountOfSoftBooks(), expected);
    }


}