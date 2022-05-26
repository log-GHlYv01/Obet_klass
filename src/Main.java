public class Main {
    public static void main(String[] args) {
        Author autor1 = new Author("Л.Н. ", "Толстой");
        Author autor2 = new Author("М.Ю. ", "Лермонтв");
        Author autor3 = new Author("А.С. ", "Пушкин");

        Book book1 = new Book("Война и мир", autor1, 1805);
        Book book2 = new Book("Мцири", autor2, 1838);
        Book book3 = new Book("Евгений Онегин", autor3, 1830);

        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAutor().getName()+""+book1.getAutor().getSurname());
        System.out.println(book2.getTitle() + " " + book2.getYear() + " " + book1.getAutor().getName()+""+book2.getAutor().getSurname());
        System.out.println(book3.getTitle() + " " + book3.getYear() + " " + book1.getAutor().getName()+""+book3.getAutor().getSurname());

        book1.setYear(1812);
        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAutor().getName()+""+book1.getAutor().getSurname());
    }

}