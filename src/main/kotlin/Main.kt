fun applyDiscount(purchaseAmount: Double, isRegularCustomer: Boolean): Double {
    val REGULAR_CUSTOMER_DISCOUNT = 0.01 // 1% скидка для постоянных клиентов

    return when {
        purchaseAmount <= 1000 -> purchaseAmount // Скидка не предоставляется
        purchaseAmount <= 10000 -> purchaseAmount - 100 // Скидка 100 рублей
        else -> {
            val discountPercentage = if (isRegularCustomer) 0.05 + REGULAR_CUSTOMER_DISCOUNT else 0.05
            purchaseAmount - (purchaseAmount * discountPercentage) // Скидка 5% и дополнительная скидка для постоянных клиентов
        }
    }
}
fun main() {
    val purchaseAmount = 10001.0 // Сумма покупки
    val isRegularCustomer = true // если true то покупатель постоянный

    val discountedAmount = applyDiscount(purchaseAmount, isRegularCustomer)

    println("Сумма с учетом скидки: $discountedAmount рублей")
}
