package fr.mby.cardgame.model

trait Hand extends Iterable[Card] {
  
  def ++(cards: Iterable[Card]): Hand
  def ++(card: Card): Hand
  
  def --(cards: Iterable[Card]): Hand
  def --(card: Card): Hand
  
}