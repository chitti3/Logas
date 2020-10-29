package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Button {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("param")
    @Expose
    private Param___ param;
    @SerializedName("style")
    @Expose
    private Style__ style;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Param___ getParam() {
        return param;
    }

    public void setParam(Param___ param) {
        this.param = param;
    }

    public Style__ getStyle() {
        return style;
    }

    public void setStyle(Style__ style) {
        this.style = style;
    }

}
