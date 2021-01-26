package by.com.task3;

public class Program {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("D:\\TestFile\\test.txt");    // создаем объект на файл test.txt
        if (file.exists()) {                                    // если файл существует, то переименовываем его
            file.renameTo(new java.io.File("D:\\TestFile\\secondName.txt"));
            System.out.println("Файл успешно переименован test.txt --> secondName.txt");
        } else {
            System.out.println("File not found!");
        }
    }
}

