package com.example.logas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Show_ {


        @SerializedName("header")
        @Expose
        private Boolean header;
        @SerializedName("title")
        @Expose
        private Boolean title;
        @SerializedName("image")
        @Expose
        private Boolean image;
        @SerializedName("button")
        @Expose
        private Boolean button;

        public Boolean getHeader() {
            return header;
        }

        public void setHeader(Boolean header) {
            this.header = header;
        }

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

        public Boolean getButton() {
            return button;
        }

        public void setButton(Boolean button) {
            this.button = button;
        }

}
