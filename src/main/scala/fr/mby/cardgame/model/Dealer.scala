package fr.mby.cardgame.model

object Dealer {
  
  def deal(pile: Pile, amountByPlayer: Int, playerCount: Int): (Pile, Iterable[Iterable[Card]]) = {
    val cards = pile.iterator.take(amountByPlayer * playerCount).toSeq
    
    (pile -- cards, cards.grouped(amountByPlayer).map { _.toIterable }.toIterable)
  }
  
}