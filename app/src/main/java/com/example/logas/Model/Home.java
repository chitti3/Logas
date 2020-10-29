package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Home {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("status_message")
    @Expose
    private String statusMessage;

    @SerializedName("popup")
    @Expose
    private Popup popup;
    @SerializedName("listdata")
    @Expose
    private List<Listdatum> listdata = null;


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
/*

    public Popup getPopup() {
        return popup;
    }

    public void setPopup(Popup popup) {
        this.popup = popup;
    }
*/

    public List<Listdatum> getListdata() {
        return listdata;
    }

    public void setListdata(List<Listdatum> listdata) {
        this.listdata = listdata;
    }
}
