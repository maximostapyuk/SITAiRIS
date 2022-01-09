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

    @Override
    public String toString(){
        return "Навзание: "+this.title+" Автор: "+this.author+" Дата написания: "+
                this.date+" Код: "+this.code+" Стоимость: "+this.cost+" BYN";
    }
}
