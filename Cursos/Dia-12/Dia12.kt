fun main(){
    //Profundizando en clases , continuamos con ejemplo del día 11
    //override,super y open
    open class SmartDevice(val name: String, val category: String) {

        var deviceStatus = "online"
        open val deviceType = "unknown" //Para luego poder sobreescribir la propiedad, debemos ponerle delante de var la palabra reservada open

        open fun turnOn() {
            // function body //El método de la superclase solo enciende el aparato
            deviceStatus = "on"
        }

        open fun turnOff() {
            // function body //El método de la superclase solo apaga
            deviceStatus = "off"
        }
    }

    class SmartLightDevice(deviceName: String, deviceCategory: String) :
        SmartDevice(name = deviceName, category = deviceCategory) {
        override val deviceType = "Smart Light" //sobreescribimos la propiedad
        var brightnessLevel = 0
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }

        fun increaseBrightness() {
            brightnessLevel++
            println("Brightness increased to $brightnessLevel.")
        }

        override fun turnOn() { //Hemos añadido la palabra reservada override, La palabra clave override indica al entorno de ejecución de Kotlin que ejecute el código incluido en el método definido en la subclase.
            brightnessLevel = 2
            super.turnOn() //con la palabra super.funcion estamaos llamando al método de la clase padre
            println("$name turned on. The brightness level is $brightnessLevel.")
        }

        override fun turnOff() {//Hemos añadido la palabra reservada override, La palabra clave override indica al entorno de ejecución de Kotlin que ejecute el código incluido en el método definido en la subclase.
            brightnessLevel = 0
            super.turnOff() //con la palabra super.funcion estamaos llamando al método de la clase padre
            println("Smart Light turned off")
        }
    }
    class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory) {
        override val deviceType = "Smart TV" //sobreescribimos la propiedad
        var speakerVolume = 2
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }

        var channelNumber = 1
            set(value) {
                if (value in 0..200) {
                    field = value
                }
            }

        fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }

        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }

        override fun turnOn() {//lo mismo de arriba, override para sobreescribir el método "padre"
            super.turnOn() //con la palabra super.funcion estamaos llamando al método de la clase padre
            println(
                "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                        "set to $channelNumber."
            )
        }
        override fun turnOff() {//lo mismo de arriba, override para sobreescribir el método "padre"
            super.turnOff()//con la palabra super.funcion estamaos llamando al método de la clase padre
            println("$name turned off")
        }
    }

    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn() //usamos el método de la subclase smartTvDevice
    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn() //usamos el método de la subclase SmartLightDevice
}