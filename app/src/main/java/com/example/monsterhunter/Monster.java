package com.example.monsterhunter;

import androidx.fragment.app.Fragment;
import com.google.gson.annotations.SerializedName;

public class Monster extends Fragment {
    @SerializedName("name")
    String name;
    @SerializedName("type")
    String type;
    @SerializedName("species")
    String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
