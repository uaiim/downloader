package id.andtree.fetch2rx.util

import id.andtree.fetch2rx.Convertible
import io.reactivex.Flowable

fun <T> Flowable<T>.toConvertible(): Convertible<T> {
    return Convertible(this)
}