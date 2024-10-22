package controller.observer

trait Subject {

  def registerObserver(obs: Observer): Unit

  def notifyObserver(): Unit
}
