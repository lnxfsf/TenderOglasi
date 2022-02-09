package tenderoglasi.me;

public class posts_model {

    private String description;
    private String place;
    private String price;
    private String phone;
    private String date_created;

    public posts_model() {
    }


    public posts_model(String description, String place, String price, String phone, String date_created) {
        this.description = description;
        this.place = place;
        this.price = price;
        this.phone = phone;
        this.date_created = date_created;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
}
