package leetcode

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val parkingSlots = mutableMapOf(
        ParkingSlotType.BIG to big,
        ParkingSlotType.MEDIUM to medium,
        ParkingSlotType.SMALL to small
    )

    fun addCar(carType: Int): Boolean {
        ParkingSlotType.values()
            .map { parkingSlotType ->
                if (parkingSlotType.isParkable(carType) && hasEmptySlot(parkingSlotType)) {
                    fillSlot(parkingSlotType = parkingSlotType)
                    return true
                }
            }

        return false
    }

    private fun hasEmptySlot(parkingSlotType: ParkingSlotType) = parkingSlots[parkingSlotType]!! > 0

    private fun fillSlot(parkingSlotType: ParkingSlotType, count: Int = 1) {
        parkingSlots[parkingSlotType] = parkingSlots[parkingSlotType]!! - count
    }

    enum class ParkingSlotType(
        val size: Int
    ) {
        BIG(size = 1),
        MEDIUM(size = 2),
        SMALL(size = 3);

        fun isParkable(carType: Int) = size == carType
    }
}
