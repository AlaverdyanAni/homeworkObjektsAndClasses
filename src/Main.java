public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина",  1878, levTolstoy);

        annaKarenina.setPublicationYear(1895);

        System.out.println(levTolstoy);
        System.out.println(annaKarenina);

        Author mariaRemark = new Author( "Мария", "Ремарк");
        Book threeComrades = new Book( "Три товарища",1936, mariaRemark);

        threeComrades.setPublicationYear(1942);
        System.out.println(mariaRemark);
        System.out.println(threeComrades);


    }
}