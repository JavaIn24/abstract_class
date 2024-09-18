package Task2



fun main (){
    var student = Student("Ivan", 20 , "обучение на программиста ассемблер" , false, true)
    var employee = Employee ("Sergey" , 40 , "работа на железобетонном предприятии" , true , true)
    student.getInfo()
    student.live()
    student.work()
    println("-------------------")
    employee.getInfo()
    employee.live()
    employee.work()

}