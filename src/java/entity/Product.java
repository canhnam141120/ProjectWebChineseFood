/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author cauch
 */
public class Product extends BaseModel{
    
    private int itemId;
   private String name;
   private String description;
   private String image;
   private int rate ;
   private double price;
   private int status;
   private int menuID;
   private Type tname;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public Type getTname() {
        return tname;
    }

    public void setTname(Type tname) {
        this.tname = tname;
    }

    public Product(int itemId, String name, String description, String image, int rate, double price, int status, int menuID, Type tname) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.image = image;
        this.rate = rate;
        this.price = price;
        this.status = status;
        this.menuID = menuID;
        this.tname = tname;
    }

    public Product() {
    }

   
}
