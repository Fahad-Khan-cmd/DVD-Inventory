package com.example.dvdinventory;

public class DVDCollection {
    private String name;
    private Integer releaseYear;
    private String director;

    public DVDCollection() {
    }

    public DVDCollection(String name, Integer releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setReleaseYear(Integer releaseYear)
    {
        this.releaseYear = releaseYear;
    }
    public Integer getReleaseYear()
    {
        return releaseYear;
    }
    public void setDirector(String director)
    {
        this.director = director;
    }
    public String getDirector()
    {
        return director;
    }

    @Override
    public String toString() {
        return "DVDInventory{" +
                "name='" + name + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
