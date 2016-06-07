package fr.mby.cardgame.model

import scala.collection.mutable.Cloneable

trait Card {
  
  val uid: String
  
  val behaviours: Iterable[Behaviour]
  
}

case class SimpleCard(val uid: String, val behaviours: Iterable[Behaviour] = Seq.empty)