
open class Outer {
    private val privateA = 1
    protected open val protectedB = 2
    internal open val internalC = 3
    val defaultD = 4 // public по умолчанию
    protected class Nested {
        public val protectedNestedE: Int = 5
    }
}


class Subclass : Outer() {
    // privateA не видно
    // protectedB, internalC и defaultD видно
    // класс Nested и protectedNestedE видно


    public override val protectedB = 5   // protectedB - protected
    override val internalC = 7   // internalC - internal
}


class Unrelated(val o: Outer) {
    // o.privateA и o.protectedB не видно
    // o.internalC и o.defaultD видно (тот же модуль)
    // Outer.Nested не видно, и Nested:: protectedNestedE также не видно

}