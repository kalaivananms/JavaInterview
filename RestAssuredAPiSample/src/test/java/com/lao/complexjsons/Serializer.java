package com.lao.complexjsons;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lao.complexJson.Movies;
import com.lao.complexJson.OtherDeatils;
import com.lao.complexJson.SuperHeroMoviesAndTVSeries;
import com.lao.complexJson.TVseries;

public class Serializer {
	
	public static void main(String[] args) {
		
		
		 SuperHeroMoviesAndTVSeries heroMoviesAndTVSeries= new 
				 SuperHeroMoviesAndTVSeries();
		 heroMoviesAndTVSeries.setCategory("Super Hero Movies & TV Series");
		 
		 List<String>accpectedFranchies = new ArrayList<String>();
		 accpectedFranchies.add("DC");
		 accpectedFranchies.add("Marvel");
		 
		 heroMoviesAndTVSeries.setAcceptedFranchies(accpectedFranchies);
		 
		 List<String>geners = new ArrayList<String>();
		 geners.add("Action");
		 geners.add("Adventure");
		 geners.add("Herioc");
		 geners.add("Dark");
		 geners.add("Funny");
		 
		 heroMoviesAndTVSeries.setGeners(geners);
		 
		 List<Movies> allmovies= new ArrayList<>();
		 List<TVseries> alltvseries = new ArrayList<>();
		 
  
		 
		 Movies batman= new Movies();
		 batman.setTitle("Batman: The Dark knigth");
		 batman.setYear(2008);
		 allmovies.add(batman);
		 
		 List<String>batmancast= new ArrayList<>();
		 batmancast.add("Christian Bale");
		 batmancast.add("Heath Ledger");
		 batman.setCast(batmancast);
		 
		 Movies jl= new Movies();
		 jl.setTitle("Justice League : Snyder Cut");
		 jl.setYear(2021);
		 allmovies.add(jl);
		 
		 List<String>jlcast= new ArrayList<>();
		 jlcast.add("Henry Cavill");
		 jlcast.add("Gal Gadot");
		 jl.setCast(jlcast);
		 
		 Movies avengersAOU= new Movies();
		 avengersAOU.setTitle("Avengers: Age of Ultron");
		 avengersAOU.setYear(2015);
		 allmovies.add(avengersAOU);
		 
		 List<String>AOUcast= new ArrayList<>();
		 AOUcast.add("Robert Downey Jr");
		 AOUcast.add("Chris Evans");
		 avengersAOU.setCast(AOUcast);
		 
		 Movies avengers= new Movies();
		 avengers.setTitle("The Avengers");
		 avengers.setYear(2012);
		 allmovies.add(avengers);
		 
		 List<String>avengerscast= new ArrayList<>();
		 avengerscast.add("Chris Evans");
		 avengerscast.add("Chris Hemsworth");
		 avengers.setCast(avengerscast);
		 
		 TVseries flash = new TVseries();
		 flash.setTitle("Flash");
		 flash.setYear(2014);
		 alltvseries.add(flash);
		 
		 TVseries gotham = new TVseries();
		 gotham.setTitle("Gotham");
		 gotham.setYear(2014);
		 alltvseries.add(gotham);
		 
		 TVseries superGirl = new TVseries();
		 superGirl.setTitle("Super Girl");
		 superGirl.setYear(2015 );
		 alltvseries.add(superGirl);
		 
		 OtherDeatils deatils = new OtherDeatils();
		 deatils.setCountry("Only USA, Engaluku verengum kilagal Kidayathu");
		 deatils.setLanguage("Alien ah irunthalum English Karanda");
		 
		 heroMoviesAndTVSeries.setMovies(allmovies);
		 heroMoviesAndTVSeries.setOtherDeatils(deatils);
		 heroMoviesAndTVSeries.setTvSeries(alltvseries);  
		 
		 ObjectMapper mapper = new ObjectMapper();
		 
		 File superjson = new File("complex.json");
		 
		 mapper.writerWithDefaultPrettyPrinter()
		 .writeValue(superjson, heroMoviesAndTVSeries);
		 
		 
		 
		
	}

}
