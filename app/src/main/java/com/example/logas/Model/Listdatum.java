package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Listdatum {
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("orientation")
    @Expose
    private String orientation;
    @SerializedName("rows")
    @Expose
    private Integer rows;
    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("show")
    @Expose
    private Show_ show;
    @SerializedName("style")
    @Expose
    private Style style;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("param")
    @Expose
    private Param__ param;
    @SerializedName("button")
    @Expose
    private Button button;

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Show_ getShow() {
        return show;
    }

    public void setShow(Show_ show) {
        this.show = show;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
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

    public Param__ getParam() {
        return param;
    }

    public void setParam(Param__ param) {
        this.param = param;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
