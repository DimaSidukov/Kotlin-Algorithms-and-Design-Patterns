package other

/**
 * проверяет строку на палиндром
 *
 * @text - строка, которую нужно проверить
*/
class Palindrome(private val text: String) {

    /**
     * возвращает true, если строка является палиндромом
     */
    fun isYes() = text == text.reversed()

    /**
     * возвращает true, если строка не является палиндромом
     */
    fun isNot() = text != text.reversed()

}