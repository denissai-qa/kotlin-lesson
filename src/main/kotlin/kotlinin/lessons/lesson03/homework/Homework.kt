package org.example.kotlinin.lessons.lesson03.homework
const val hourse: Int = 8

class Wending {// Название мероприятия
val name: String = "Wending"
    // Дата проведения
    var data: String = "апрель"
    //Место проведения
    val city: String = "Минск"
    // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    var many: Int = 1000
    //Количество участников
    var people: Int = 25
    // Длительность хакатона

    // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    val contakt : String= "телеграм, вайбер"
  // Бюджет мероприятия
    lateinit var fuulmany: String

    // Общее настроение участников (определяется опросами)
    val otchet : String by lazy {
        "многим понравился, не очень был ведущий, плохо вел себя с детьми"
    }
}