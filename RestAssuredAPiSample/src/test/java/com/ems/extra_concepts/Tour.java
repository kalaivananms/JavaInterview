package com.ems.extra_concepts;

public class Tour {

	String place;
	String Modeoftravel;



	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getModeoftravel() {
		return Modeoftravel;
	}

	public Tour setModeoftravel(String modeoftravel) {
		this.Modeoftravel = modeoftravel;
		return this;
	}

	public void heymanwherearegoing() {
		System.out.println(getPlace());
		System.out.println("Oh jolly ah car"+ getModeoftravel()+"la"+getPlace()+"poriya");
	}

	public static void main(String[] args) {


		Tour tour = new Tour();
		tour.setPlace("chennai");
		tour.setModeoftravel("car");
		tour.heymanwherearegoing();
		//tour.setplace("chennai").setModeofTravel("flight").heymanwherearegoing();


	}

}
