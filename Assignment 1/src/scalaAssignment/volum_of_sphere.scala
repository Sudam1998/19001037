package scalaAssignment

object volum_of_sphere {
  
  def main(args:Array[String]){
    
     val pi= 22/7f
     var ipi = pi.toFloat
     var radius = 5
     var volume = (4*pi*radius*radius*radius)/3
     println("The volume of the sphere is "+volume)
     
     
  }
}