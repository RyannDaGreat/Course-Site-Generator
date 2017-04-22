import org.json.*
class entry(var key:String, var value:Any)
fun main(args:Array<String>)
{
//⁠⁠⁠⁠⁠             ⎧                                                                                                  ⎫
//⁠⁠⁠⁠⁠             ⎪                                       ⎧                                                         ⎫⎪
//⁠⁠⁠⁠⁠             ⎪                                       ⎪                                          ⎧             ⎫⎪⎪
    val g=mapOf("Hello" to "goodbye", "Senior" to mapOf("Citizen" to "kite", "arraytest" to listOf(1, 2, 3, 4, 5)))//TAG:JAVA
//⁠⁠⁠⁠⁠             ⎪                                       ⎪                                          ⎩             ⎭⎪⎪
//⁠⁠⁠⁠⁠             ⎪                                       ⎩                                                         ⎭⎪
//⁠⁠⁠⁠⁠             ⎩                                                                                                  ⎭
    val h=JSONObject(g)
    println(g)
    println(h)
//    println(h.keys().)
}