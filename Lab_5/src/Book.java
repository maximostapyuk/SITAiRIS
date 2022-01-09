public class Book  {
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

    public void showBookInfo(){
        System.out.println("*********************************************");
        System.out.println("Название: " + this.title);
        System.out.println("Автор: " + this.author);
        System.out.println("Дата написания: " + this.date);
        System.out.println("Код: " + this.code);
        System.out.println("Стоимость: " + this.cost);
    }
}
