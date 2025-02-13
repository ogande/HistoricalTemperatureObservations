package main.scala.spark.temperature

// Required import(s)
import main.scala.utilities.DownloadUitlity

// Defining an object to get the temperature data
object GetTemperatureData {
  
  private[this] val temperatureData = new DownloadUitlity // Creating a utility instance for downloading the barometer data 
  
  /* Description: method to download raw temperature data
		 Parameters : None
     Return type: Unit */
  def downloadTemperatureData = {
    temperatureData.downloadFromGivenURL("https://bolin.su.se/data/stockholm/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_1756_1858_t1t2t3.txt")
    temperatureData.downloadFromGivenURL("https://bolin.su.se/data/stockholm/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_1859_1960_t1t2t3txtn.txt")
    temperatureData.downloadFromGivenURL("https://bolin.su.se/data/stockholm/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt")
    temperatureData.downloadFromGivenURL("https://bolin.su.se/data/stockholm/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_2013_2017_t1t2t3txtntm.txt")
    temperatureData.downloadFromGivenURL("https://bolin.su.se/data/stockholm/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholmA_daily_temp_obs_2013_2017_t1t2t3txtntm.txt")
  }  
}