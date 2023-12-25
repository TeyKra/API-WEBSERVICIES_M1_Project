package com.project.movies.Entity;

import com.project.movies.Validation.Genre;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.time.LocalTime;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Movie name is mandatory")
    @Column(name = "movie_name")
    private String movieName;

    @Min(value = 1900, message = "Movie release year must be greater or equal to 1900")
    private int releaseYear;

    private double rating;

    @Genre(value = "",message = "Invalid movie genre")
    private String genre;

    @NotBlank(message = "Plot is mandatory")
    private String plot;

    @Min(value = 1, message = "Duration must be a positive number")
    private int duration;

    private String language;

    private String subtitles;

    private String director;

    @Column(columnDefinition = "TEXT")
    private String mainActors;

    private Integer minimumAge;

    private Date startDate;

    private Date endDate;

    @Column(name = "days_of_week")
    private String daysOfWeek;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "cinema_address")
    private String cinemaAddress;

    private String city;

    
    public Movie() {
    }

    
    public Movie(String movieName, int releaseYear, double rating, String genre, String plot, int duration, String language, String subtitles, String director, String mainActors, Integer minimumAge, Date startDate, Date endDate, String daysOfWeek, LocalTime startTime, String cinemaAddress, String city) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
        this.plot = plot;
        this.duration = duration;
        this.language = language;
        this.subtitles = subtitles;
        this.director = director;
        this.mainActors = mainActors;
        this.minimumAge = minimumAge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.cinemaAddress = cinemaAddress;
        this.city = city;
    }

    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMainActors() {
		return mainActors;
	}

	public void setMainActors(String mainActors) {
		this.mainActors = mainActors;
	}

	public Integer getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(Integer minimumAge) {
		this.minimumAge = minimumAge;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public String getCinemaAddress() {
		return cinemaAddress;
	}

	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
	    return "Movie{" +
	            "id=" + id +
	            ", movieName='" + movieName + '\'' +
	            ", releaseYear=" + releaseYear +
	            ", rating=" + rating +
	            ", genre='" + genre + '\'' +
	            ", plot='" + plot + '\'' +
	            ", duration=" + duration +
	            ", language='" + language + '\'' +
	            ", subtitles='" + subtitles + '\'' +
	            ", director='" + director + '\'' +
	            ", mainActors='" + mainActors + '\'' +
	            ", minimumAge=" + minimumAge +
	            ", startDate=" + startDate +
	            ", endDate=" + endDate +
	            ", daysOfWeek='" + daysOfWeek + '\'' +
	            ", startTime=" + startTime +
	            ", cinemaAddress='" + cinemaAddress + '\'' +
	            ", city='" + city + '\'' +
	            '}';
	}

	
	
}
