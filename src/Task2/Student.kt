package Task2

class  Student  (name: String, age: Int, action: String, spouse: Boolean, private val study : Boolean)
    : Person(name, age, action, spouse) {
    override fun live() {
        println("Студент жив и полностью доволен своей молодостью, учебв дается легко много друзей времени и никаких серьехных обязанностей")
    }

    override fun work() {
        println("Объект студент нигде не работает")
    }

    override fun getInfo() {
        println("Имя = $name; возраст равен = $age; основное занятие = $action; наличие супруга/супруги = $spouse обучение объекта в учебном заведении = $study")
    }
}