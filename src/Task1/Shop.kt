package Task1

abstract class Shop (var timeOpen : Int, var timeClose : Int, var name : String, var checkMorning : Int, var checkEvening : Int) {
  abstract fun getCheck () : Double
  abstract fun getTimeWork () : Double

  open fun getInfo () {
      println("Магазин $name со средним чеком утром $checkMorning и средним чеком вчером $checkEvening ," +
              " временем открытия утром $timeOpen и временем закрытия вечером $timeClose ")
  }
 }