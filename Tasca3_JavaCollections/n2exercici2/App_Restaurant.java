package n2exercici2;

import n2exercici1.Restaurant;
import sun.security.jca.GetInstance;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App_Restaurant   {
	public static Set<Restaurant> setRestaurants = new HashSet<>();

	public static void main(String[] args) {
		Set<Restaurant> setRestaurant = new HashSet<>();
		Restaurant r1 = new Restaurant("El tenedor", 7);
		Restaurant r2 = new Restaurant("El tenedor", 8);
		Restaurant r3 = new Restaurant("Diabolo", 4);
		Restaurant r4 = new Restaurant("Pizza", 8);
	
		setRestaurant.add(r1);
		setRestaurant.add(r2);
		setRestaurant.add(r3);
		setRestaurant.add(r4);
		
		System.out.println(setRestaurants);
		
		Set<Restaurant> tree_set = getInstance(setRestaurant);
		
		//Set<Restaurant> tree_set = new TreeSet<Restaurant>(setRestaurant);
		//System.out.println(tree_set);
		
		
		
		
		// treeSet 
		//TreeSet<Restaurant> mytreeset = new TreeSet<Restaurant>(setRestaurants);
		
		//System.out.println(setRestaurants);
	
		
	}
		//Collections.sort(setRestaurants, new Comparator<Restaurant>(); 	// ordenados por nombre y puntuacion.
           
		
			/*public int compare(Restaurant rest1, Restaurant rest2) {
                int comparate = -1;
                comparate = rest1.getName().compareToIgnoreCase(rest2.getName());
               
                if(comparate == 0)
                    comparate = rest2.getRating()-rest1.getRating();
               
                return comparate;  
            }*/
       

		//for(Restaurant orden:restaurants) {
			//System.out.println(orden.toString()); 
		
		

		
		
	
	
	}
	

		
