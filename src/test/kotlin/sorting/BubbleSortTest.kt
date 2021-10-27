package sorting

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Assertions.*
import kotlin.random.Random

internal class BubbleSortTest : SortTest() {
    override val sort: SortAlgo<Int>
        get() = BubbleSort()

    @Test
    fun test() { test_all() }

}