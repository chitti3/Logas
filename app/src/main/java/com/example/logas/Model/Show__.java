package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Show__ {
    @SerializedName("title")
    @Expose
    private Boolean title;
    @SerializedName("image")
    @Expose
    private Boolean image;
    @SerializedName("icon")
    @Expose
    private Boolean icon;

    public Boolean getTitle() {
        return title;
    }

    public void setTitle(Boolean title) {
        this.title = title;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public Boolean getIcon() {
        return icon;
    }

    public void setIcon(Boolean icon) {
        this.icon = icon;
    }
}
