package id.andtree.reqrx.util

import id.andtree.reqrx.Convertible
import io.reactivex.Flowable

fun <T> Flowable<T>.toConvertible(): Convertible<T> {
    return Convertible(this)
}