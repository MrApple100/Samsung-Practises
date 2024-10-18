class Rectangle(
    val width:Int,
    val height:Int
):Shape() {
    override fun area():Double {
        return (width*height).toDouble()
    }
}