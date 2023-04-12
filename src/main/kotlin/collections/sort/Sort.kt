package collections.sort

import collections.sort.comparator.MyComparatorByAge
import collections.sort.comparator.MyComparatorByWeight

fun main() {
    val personList = listOf(
        Person("Billy", 30,90),
        Person("Oleg", 13,50),
        Person("Van", 45,140),
        Person("Alex", 41,60)
    )

    println(personList.sorted())
    println(personList.sortedWith(MyComparatorByAge()))
    println(personList.sortedWith(MyComparatorByWeight()))
    println(personList.sortedBy { it.weight })

}

private operator fun Person.plus(person: Person): Person =
    Person("${name} ${person.name}",
        age + person.age,
        weight + person.weight )