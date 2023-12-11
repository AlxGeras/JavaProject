import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DZ6 {

  /*
   * Реализуйте структуру телефонной книги с помощью HashMap.
   * Программа также должна учитывать, что во входной структуре будут
   * повторяющиеся имена с разными телефонами, их необходимо считать, как одного
   * человека с разными телефонами. Вывод должен быть отсортирован по убыванию
   * числа телефонов.
   */

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out
        .print("Меню:\n 1 - Показать контакты\n 2 - добавить контакт\n 3 - Удалить контакт\n 4 - Выход\n");
    System.out
        .print("Введите номер пункта: ");
    Integer menuNumber = input.nextInt();
    switch (menuNumber) {
      case 1:
        System.out.println(showPhoneBook());
        break;
      case 2:
        addContact();
        break;
      case 3:
      deliteContact();
      break;
      case 4:
        System.out.println("Хорошего дня!");
        break;
      default:
        System.out.println("Выберите правильный номер!");
        break;
    }
    input.close();
  }

  static Map<String, String> showPhoneBook() {
    Map<String, String> phoneBook = new HashMap<>();
   
    phoneBook.put("test", "81111111111");

    return (phoneBook);
  }

  static void addContact() {
    Scanner input = new Scanner(System.in);
    System.out.print("Сколько контактов вы хотите добавить: ");
    Integer getNumber = input.nextInt();

    Map<String, String> phoneBook = showPhoneBook();
    for (int i = 0; i < getNumber; i++) {
      System.out.print("Введите имя: ");
      String name = input.next();
      System.out.print("Введите номер телефона: ");
      String phoneNamber = input.next();

      if (phoneBook.containsKey(name)) {
        phoneBook.put(name, phoneNamber);
      } else {
        phoneBook.put(name, phoneNamber);
      }
    }

    for (Map.Entry<String, String> worker : phoneBook.entrySet()) {
      System.out.printf("%s - %s\n", worker.getKey(), worker.getValue());
    }
    input.close();
  }

  static void deliteContact() {

    Map<String, String> phoneBook = showPhoneBook();
    System.out.println(phoneBook);

    Scanner input = new Scanner(System.in);
    System.out.print("Введите имя удаляемого контакта: ");
    String name = input.nextLine();

    if (phoneBook.keySet().contains(name)) {
      phoneBook.keySet().remove(name);
    } else {
      System.out.println(name + " не найдено!");
    }
    System.out.println(phoneBook);
    input.close();
  }

}