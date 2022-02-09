package tenderoglasi.me;

public class subsection_spinner {
    boolean isHeader;
  //  int categoryId;

    String name;
    int drawable;


    public subsection_spinner(boolean isHeader, String name, int drawable) {
        this.isHeader = isHeader;
        this.name = name;
        this.drawable = drawable;
    }

    public boolean isHeader() {
        return isHeader;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
