package com.example.practicalproject

//Данные для QuestionDisplay, где хранятся вопросы и id изображения

object Data {

    val imageId: Array<Int> = arrayOf(R.drawable.one, R.drawable.two, R.drawable.three,
                                      R.drawable.four, R.drawable.five, R.drawable.six,
                                      R.drawable.seven, R.drawable.eight, R.drawable.nine,
                                      R.drawable.ten)

    val questions: Array<String> = arrayOf(
        "1. Вторая мировая война началась:",
        "2. Что такое \"пакт Молотова — Риббентропа\"?",
        "3. Что предполагал \"план Ост\", разработанный Германией?",
        "4. Что обсуждалось на Ялтинской конференции?",
        "5. Кто из этих полководцев не был участником Великой Отечественной войны?",
        "6. Приказ номер 227 \"Ни шагу назад\" был отдан Иосифом Сталиным в ходе:",
        "7. Какой военачальник советской армии был казнен как предатель?",
        "8. Что предполагала \"операция Уран\"?",
        "9. Какой немецкий военачальник командовал армией, окруженной и капитулировавшей под Сталинградом?",
        "10. В ходе какой битвы произошло крупнейшее танковое сражение за всю Великую Отечественную войну?"
    )

    val answers: Array<Array<String>> = arrayOf(
        arrayOf(
            "22 июня 1941 года",
            "1 сентября 1939 года",
            "15 марта 1939 года"
        ),
        arrayOf(
            "советско-английское соглашение о совместных действиях в войне против Германии",
            "германо-советское торговое соглашение",
            "договор о ненападении между Германией и Советским союзом"
        ),
        arrayOf(
            "оккупацию СССР, истребление 30 миллионов человек, превращение оставшейся части населения в рабов",
            "молниеносную войну с СССР (в течение трех месяцев дойти до Волги)",
            "окружение и уничтожение советских войск, расположенных в районе Курского выступа"
        ),
        arrayOf(
           "открытие второго фронта",
           "послевоенное устройство мира",
           "подготовка мирных договоров с бывшими союзниками Германии"
        ),
        arrayOf(
            "Андрей Еременко",
            "Константин Рокоссовский",
            "Алексей Брусилов"
        ),
        arrayOf(
            "Битвы на Курской дуге",
            "Битвы за Москву",
            "Сталинградской битвы"
        ),
        arrayOf(
            "Андрей Власов",
            "Матвей Шапошников",
            "Александр Василевский"
        ),
        arrayOf(
            "Наступление Германии на Москву",
            "План контрнаступления советских войск под Сталинградом",
            "План Германии по захвату Кавказа"
        ),
        arrayOf(
            "Эрих фон Манштейн",
            "Фридрих Паулюс",
            "Гейнц Гудериан"
        ),
        arrayOf(
            "В ходе битвы за Москву",
            "В ходе Ржевской битвы",
            "В ходе Курской битвы"
        )
    )

    val correctAnswers: Array<Array<Boolean>> = arrayOf(
        arrayOf(false, true, false),
        arrayOf(false, false, true),
        arrayOf(true, false, false),
        arrayOf(false, true, false),
        arrayOf(false, false, true),
        arrayOf(false, false, true),
        arrayOf(true, false, false),
        arrayOf(false, true, false),
        arrayOf(false, true, false),
        arrayOf(false, false, true)

    )
}