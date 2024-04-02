package com.kata

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class HiddenWordsShould : ShouldSpec({

    context("Deciphering the word"){
        should("for the number 1152"){
            val number = HiddenWords()

            val result = number.decipherWord(1152)

            result shouldBe "bbtl"
        }

        should("for the number 654789"){
            val number = HiddenWords()

            val result = number.decipherWord(654789)

            result shouldBe "atednm"
        }

        should("for the number 10"){
            val number = HiddenWords()

            val result = number.decipherWord(10)

            result shouldBe "The number has to be between 100 and 999999"
        }

        should("for the number 9999999"){
            val number = HiddenWords()

            val result = number.decipherWord(9999999)

            result shouldBe "The number has to be between 100 and 999999"
        }
    }
})