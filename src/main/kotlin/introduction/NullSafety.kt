package introduction

fun main() {
    var neverNull: String = "This can't be null"
    //everNull = null
    var nullalbe: String? = "You can keep a null here"
    nullalbe = null;
}

fun strLength(notNull: String): Int = notNull.length

fun describeString(maybeString: String?): String {
    return if(!maybeString.isNullOrEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}