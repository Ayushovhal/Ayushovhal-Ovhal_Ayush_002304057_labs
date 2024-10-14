/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Legion
 */
public class Product {
    
    private String name;
    private int price;
    private int id;

    
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addNewFeature() {
        // Default values for name and value
        String defaultName = "Unnamed Feature";
        Object defaultValue = null;

        Feature newFeature = new Feature(this, defaultName, defaultValue);
        features.add(newFeature); // Add the new feature to the list
        return newFeature; // Return the newly created feature
    }
    
   
     @Override
    public String toString() {
        return name;
    }
    
}
