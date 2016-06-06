package fr.mby.cardgame.model

import scala.util.Failure

trait CardIterable extends Iterable[Card] {
  
  def topToBottomIterator: Iterator[Card]
  
  def bottomToTopIterator: Iterator[Card]
  
  def shuffleIterator: Iterator[Card]
  
  def defaultIterator = topToBottomIterator
  
  def iterator = defaultIterator
  
}

trait Pile extends CardIterable {
  
  def shuffle(): Pile
  
  def pushTop(card: Card): Pile
  def pushTop(cards: Iterable[Card]): Pile
  
  def pushBottom(cards: Card): Pile
  def pushBottom(cards: Iterable[Card]): Pile
  
  def --(card: Card): Pile
  def --(cards: Iterable[Card]): Pile
  
}

object Pile {
  
  def draw(hand: Hand, pile: Pile): (Hand, Pile) = {
    assume(! pile.isEmpty, "Pile is empty")
    val topCard = pile.head
    (hand ++ topCard, pile -- topCard)
  }
  
  def discardTop(card: Card, hand: Hand, pile: Pile): (Hand, Pile) = {
    (hand -- card, pile.pushTop(card))
  }
  
  def discardBottom(card: Card, hand: Hand, pile: Pile): (Hand, Pile) = {
    (hand -- card, pile.pushBottom(card))
  }
  
}