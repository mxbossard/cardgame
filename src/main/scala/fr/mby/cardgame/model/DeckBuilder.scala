package fr.mby.cardgame.model

trait DeckBuilder {
  
  def add(amount: Int, card: Card): DeckBuilder
  
  def build: Pile
  
}

case class SimpleDeckBuilder(val cards: Seq[Card] = Seq.empty) extends DeckBuilder {
  
  def add(amount: Int, card: Card): DeckBuilder = {
    ???
  }
  
  def build: Pile = ???
  
}