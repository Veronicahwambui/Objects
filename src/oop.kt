fun main() {
var person=Human("Jane",43,58)
    person.eat(9)
   println(person.weight)
    person.speak("My name is veronicah Njenga from Nairobi")
    var sarah=Fields("Peninah","Njeri","peninahnjeri@gmail.com","075656543","Njeri345")
    person.birthday()
    println(sarah.email)
    println(sarah.FirstName)




}
class Human(var name:String, var age:Int,var weight: Int) {
    fun eat(foodWeight: Int): Int {
        println("Iam eating $foodWeight kgs of food")
        weight = weight + foodWeight
        return weight
    }

    fun speak(speech: String) {
        println(speech)
    }
    fun birthday(){
        age=age+ 1
        println(age)

    }


}
data class Fields(var FirstName:String,var LastName:String,var email:String,var phoneNumber:String,var password:String)