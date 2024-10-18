class Wizard():Human() {
    var mana:Int =100
    override fun attack(human: Human) {
        human.damage(10)

    }

    override fun damage(uron: Int) {
        if(mana !=null){
            mana -=uron
        }else{
            this.health-=uron
        }
    }
}