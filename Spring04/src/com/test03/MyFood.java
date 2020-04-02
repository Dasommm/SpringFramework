package com.test03;

public class MyFood {
	
	private Food favoriteFood;
	private Food unFavoriteFood;
	
	public MyFood() {
		this.favoriteFood = new Food("tt",15000);
		this.unFavoriteFood = new Food("dd", 20000);
	}
	public MyFood(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}
	public Food getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}
	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}
	@Override
	public String toString() {
		return "MyFood [favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}
	
	

}
