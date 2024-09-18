package Task1

fun main () {
    var shopMagnit = Magnit(7,20,"Magnit" , 400 , 1500)
    var shopPiyaterochka = Piyaterochka(6 , 22 , "Piyaterochka" , 200 , 2000)
    println(shopMagnit.getInfo())
    println("средний чек равен ${shopMagnit.getCheck()}")
    println("Время работы равно ${shopMagnit.getTimeWork()}")
    println("----------------------")
    println(shopPiyaterochka.getInfo())
    println("средний чек равен ${shopPiyaterochka.getCheck()}")
    println("Время работы равно ${shopPiyaterochka.getTimeWork()}")

}