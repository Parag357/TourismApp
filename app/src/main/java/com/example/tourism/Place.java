package com.example.tourism;

public class Place
{
    public String title,loc,describe;
    public int image;
    public double rating;
    Place()
    {

    }
   Place(String title,String loc,String describe,int image,double rating) {
        this.title = title;
        this.loc = loc;
        this.describe = describe;
        this.image = image;
        this.rating=rating;
    }
    public void setDescribe(String describe)
    {
        this.describe = describe;
    }
    public void setLoc(String loc)
    {
        this.loc = loc;
    }
    public void setImage(int image)
    {
        this.image = image;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getDescribe()
    {
        return describe;
    }
    public String getLoc()
    {
        return loc;
    }
    public int getImage()
    {
        return image;
    }
    public float getRating()
    {
        return (float)(rating);
    }
    public String getTitle()
    {
        return title;
    }
}
