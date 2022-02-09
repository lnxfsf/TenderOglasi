package tenderoglasi.me;

public class add_posts_model {

    String date_created;
    String description;
    String menuId;
    String phone;
    String place;
    String price;

    public add_posts_model() {
    }


    public add_posts_model(String date_created, String description, String menuId, String phone, String place, String price) {
        this.date_created = date_created;
        this.description = description;
        this.menuId = menuId;
        this.phone = phone;
        this.place = place;
        this.price = price;
    }


    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
