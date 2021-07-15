package scalaAssignment

object book_sale {
  def main(args:Array[String]){
    
    var cover_price=24.95f
    var discount=cover_price*(40/100f)
    println(discount)
    var discounted_price = cover_price-discount
    println(discounted_price)
    var wholesale_cost=discounted_price*(50*3 + 10*0.75f)
    println("The wholesale cost for 60 copies = "+wholesale_cost)
  }
}