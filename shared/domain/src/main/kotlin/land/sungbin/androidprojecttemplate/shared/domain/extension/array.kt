package land.sungbin.androidprojecttemplate.shared.domain.extension

fun <T> MutableList<T>.updateIndex(index: Int, newValue: T): MutableList<T> {
    return apply { set(index, newValue) }
}

fun <T> MutableList<T>.updateIndex(index: Int, newValueBuilder: T.() -> T): MutableList<T> {
    return apply { set(index, newValueBuilder(get(index))) }
}
