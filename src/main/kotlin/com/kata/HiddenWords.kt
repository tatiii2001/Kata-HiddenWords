package com.kata

class HiddenWords {

    private val letterAndNumberCombination = mapOf(
        "a" to 6,
        "b" to 1,
        "d" to 7,
        "e" to 4,
        "i" to 3,
        "l" to 2,
        "m" to 9,
        "n" to 8,
        "o" to 0,
        "t" to 5
    )
    fun decipherWord(number: Int): String {

        if(number < 100 || number > 999999) return "The number has to be between 100 and 999999"
        var decryptedWord = ""
        val numberSeparate = number.toString().split("")

        numberSeparate.forEach {
            letterAndNumberCombination.forEach { (letter, number) ->
                if(it == number.toString()){
                    decryptedWord += letter
                }
            }
        }
        return decryptedWord
    }


}
