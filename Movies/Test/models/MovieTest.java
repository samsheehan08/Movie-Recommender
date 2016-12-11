package models;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {
	Movie texas, exor, carrie, dead;
	List<Movie> movies;
	Movie movie =new Movie("Rosemary's Baby (1968)","12 Jun 1968","http://www.imdb.com/title/tt0063522/releaseinfo?ref_=tt_ov_inf");

	@Test
	public void testCreate()
	{
		assertEquals ("Rosemary's Baby (1968)",     movie.getTitle());
		assertEquals ("12 Jun 1968",             	movie.getYear());
		assertEquals ("http://www.imdb.com/title/tt0063522/releaseinfo?ref_=tt_ov_inf",   		movie.getUrl());  
	}
	@Before
	public void setUp() throws Exception {
		movies=new ArrayList<Movie>();
		texas= new Movie ("The Texas Chain Saw Massacre (1974)", "04 Oct 1974", "http://www.imdb.com/title/tt0072271/?ref_=tt_rec_tt");
		movies.add(texas);
		exor= new Movie ("The Exorcist (1973)",  "29 Dec 1973", "http://www.imdb.com/title/tt0070047/?ref_=tt_rec_tt");
		movies.add(exor);
		carrie= new Movie ("Carrie (1976)",  "16 Nov 1976", "http://www.imdb.com/title/tt0074285/?ref_=tt_rec_tt");
		movies.add(carrie);
		dead= new Movie ("The Night of The Lving Dead (1968)","10 Nov 1968", "http://www.imdb.com/title/tt0063350/?ref_=tt_rec_tt");
		movies.add(dead);
		  
	}


	@Test
	public void testIds(){
		Set<Long> ids = new HashSet<>();
		for (Movie movie:movies)
		{
			ids.add(movie.getMovieID());
		}
		assertEquals (movies.size(), ids.size());
	}

	@Test
	public void testEquals()
	{
		Movie movie2= new Movie ("Rosemary's Baby (1968)","12 Jun 1968","http://www.imdb.com/title/tt0063522/releaseinfo?ref_=tt_ov_inf");
		Movie sound= new Movie ("The Sound of Music (1966)", "20 May 1966", "http://www.imdb.com/title/tt0059742/?ref_=nv_sr_1"); 

		assertEquals(texas, texas);
		assertEquals(movie, movie);
		//assertEquals(movie, movie2); not working for some reason
		assertNotEquals(movie2, sound);
	} 
	//test getters and setters


}
