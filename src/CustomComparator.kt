import model.Car

class CustomComparator: Comparator<Car> {
    override fun compare(o1: Car?, o2: Car?): Int {
        if(o1?.gosNomer == o2?.gosNomer) { //null == null -> true
            return 0
        }else if(o1!!.gosNomer > o2!!.gosNomer){ //может быть null -> выпадет ошибка
            return -1
        }else{
            return 1
        }
    }
}