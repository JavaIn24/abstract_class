package Task1

class Piyaterochka (timeOpen: Int, timeClose: Int, name: String, checkMorning: Int, checkEvening: Int) :
    Shop(timeOpen, timeClose, name, checkMorning, checkEvening) {
    override fun getCheck() : Double {
        var checkDay = checkMorning + checkEvening / 2
        return checkDay.toDouble()
    }

    override fun getTimeWork() : Double {
        var timeWork = timeClose - timeOpen
        return timeWork.toDouble()
    }

    override fun getInfo() {
        super.getInfo()
    }
}