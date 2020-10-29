package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("param")
    @Expose
    private Param_ param;
    @SerializedName("style")
    @Expose
    private Style_ style;
    @SerializedName("show")
    @Expose
    private Show__ show;
    @SerializedName("header")
    @Expose
    private Boolean header;
    @SerializedName("icon")
    @Expose
    private String icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Param_ getParam() {
        return param;
    }

    public void setParam(Param_ param) {
        this.param = param;
    }

    public Style_ getStyle() {
        return style;
    }

    public void setStyle(Style_ style) {
        this.style = style;
    }

    public Show__ getShow() {
        return show;
    }

    public void setShow(Show__ show) {
        this.show = show;
    }

    public Boolean getHeader() {
        return header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
