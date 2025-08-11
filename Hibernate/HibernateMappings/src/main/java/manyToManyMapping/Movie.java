package manyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieid;
	private String mov_name;
	private String mov_lang;
	
	@ManyToMany
	private List<Actor> actors;

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public String getMov_lang() {
		return mov_lang;
	}

	public void setMov_lang(String mov_lang) {
		this.mov_lang = mov_lang;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
