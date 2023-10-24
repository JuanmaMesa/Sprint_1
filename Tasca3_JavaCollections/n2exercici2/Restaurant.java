package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

	private String name;
	private int rating;
	
	
	public Restaurant(String name, int rating) {
		
		this.name = name;
		this.rating = rating;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(name, rating);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && (rating == other.rating);
	}
	
	@Override
	public int Compare(Restaurant rest1, Restaurant rest2) {
		
		return Integer.compare(rest1.rating, rest2.rating);
		
	}


	@Override
	public String toString() {
		return "Name: " + name + ", Rating: " + rating ;
	}
	
	
	

}
