package library;

public class Book {
    private String title;
    private String author;
    private int date;
    private String code;
    private float cost;

    public Book(String title, String author, int date, String code, float cost) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.code = code;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public String getCode() {
        return code;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return "Название: "+this.title+" Автор: "+this.author+" Дата написания: "+
                this.date+" Код: "+this.code+" Стоимость: "+this.cost+" BYN";
    }
}
