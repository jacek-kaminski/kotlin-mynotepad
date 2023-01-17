package com.jkcoding.mynotepad.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
  class ByDate(orderType: OrderType) : NoteOrder(orderType)
  class ByTitle(orderType: OrderType) : NoteOrder(orderType)
  class ByColor(orderType: OrderType) : NoteOrder(orderType)
  //todo addCategory

  fun copy(orderType: OrderType) = when (this) {
    is ByTitle -> ByTitle(orderType)
    is ByDate -> ByDate(orderType)
    is ByColor -> ByColor(orderType)
  }
}
