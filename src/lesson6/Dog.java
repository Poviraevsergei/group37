package lesson6;

//Шаблон
class Dog {
    //Характеристики
    int age;
    String breed;

    //Поведение(метод)
    // ?модификатордоступа чтовозращаетметод
    int giveMeAge() {
        System.out.println("Возраст собаки: " + age);
        return age;
    }

    void addOneYear() {
        ++age;
    }
}
