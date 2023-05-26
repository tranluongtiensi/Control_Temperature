package org.dop.control_temperature.model;

public class RecyclerItem {
    private int imageResId;
    private String title;
    private String time;

    public RecyclerItem(int imageResId, String title, String time) {
        this.imageResId = imageResId;
        this.title = title;
        this.time = time;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }
}
