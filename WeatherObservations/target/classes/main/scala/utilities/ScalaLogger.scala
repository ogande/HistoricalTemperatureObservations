package main.scala.utilities

// Required import(s)
import org.apache.log4j._

// Defining a Scala object for the logging
object ScalaLogger extends Serializable { 
  
   //Getting log instance for logging the activities, used during debugging
   @transient lazy val log = Logger.getLogger(getClass.getName)

  // Description: Method to get the name of the method where an exception is occurs
  // Parameters: None
  // Return type: String
  def getMethodName:String = new Exception().getStackTrace().apply(1).getMethodName()
}
