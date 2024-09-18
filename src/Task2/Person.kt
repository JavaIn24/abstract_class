package Task2

import javax.xml.catalog.CatalogResolver.NotFoundAction

abstract  class Person (var name : String, var age : Int, var action : String, var  spouse : Boolean) {
     abstract fun live ()
     abstract fun work ()
    open fun getInfo() {
        println("Имя = $name; возраст равен = $age; основное занятие = $action; наличие супруга/супруги = $spouse")
    }


}
