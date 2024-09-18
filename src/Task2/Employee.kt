package Task2

class Employee(name: String, age: Int, action: String, spouse: Boolean, var haveWork : Boolean)
    : Person(name, age, action, spouse) {
    override fun live() {
        println("Объект рабочий жив но только физичесий, его ментальная оболочка давно сгорела и теперь он просто живет ни на что не надеясь")
    }

    override fun work() {
        println("Объект рабочий работает на заводе")
    }

    override fun getInfo() {
        println("Имя = $name; возраст равен = $age; основное занятие = $action; наличие супруга/супруги = $spouse наличие рабочего места объекта $haveWork")
    }
}