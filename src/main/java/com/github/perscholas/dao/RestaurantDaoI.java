package com.github.perscholas.dao;

import com.github.perscholas.entity.Foodtype;
import com.github.perscholas.entity.Restaurant;

import java.util.List;

public interface RestaurantDaoI {

  //create
  void add (Restaurant restaurant);
  void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype);

  //read
  List<Restaurant> getAll();
  Restaurant findById(int id);
  List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId);

  //update - user will be able to update any field of a record except the ID
  boolean update(int id);

  //delete
  void deleteById(int id);
  void clearAll();
}
