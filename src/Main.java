//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих Мария", "Ремарк", 5);
        Author author2 = new Author("Лев", "Толстой", 4);
        Book book1 = new Book("На западном фронте бе перемен", 1944, author1, 10);
        Book book2 = new Book("Война и мир", 1901, author2, 850);

        System.out.println("Автор книги: " + book2.author.name + " " + book2.author.surname);
        System.out.println("Книга большая? - " + book2.isBig());
        System.out.println("Содержится ли слово в описании книги? - " + book2.matches("Лев"));
        System.out.println("Оценочная стоимость книги: " + book2.estimatePrice());
    }
}